package basico;

public class TesteIntEDouble {
    public void exemplosNumericos(){
        double salario = 12345.90;
        System.out.println("Salario ".concat(String.valueOf(salario)));

        int a =5 ,b=2;
        System.out.println("Java \"Trunca\" ao dividir inteiros");
        System.out.println("int a = 5, b = 2;");
        System.out.println("a / b = ".concat(String.valueOf(a/b)));
        System.out.println();

        double c = 5/2;
        System.out.println("Mesmo utilizando double, pode-se obter um resultado truncado");
        System.out.println("double c = 5 / 2;");
        System.out.println(" c = ".concat(String.valueOf(c)));
        System.out.println();

        c = 5;
        System.out.println("Assim conseguimos o resultado desejado");
        System.out.println("double c = 5; int b = 2;");
        System.out.println("c / b = ".concat(String.valueOf(c/b)));
        System.out.println();

        c = 5.0 /2;
        System.out.println("Caso um dos dios seja um número do tipo double teremos o resultado do tipo double");
        System.out.println("double c = 5.0 / 2;");
        System.out.println("c = ".concat(String.valueOf(c)));
        System.out.println();

        int valor = new Double(salario).intValue();
        System.out.println("Double salario truncado ");
        System.out.println("int valor = new Double(salario).intValue();");
        System.out.println("valor = ".concat(String.valueOf(valor)));
        System.out.println();

        valor = (int)salario;
        System.out.println("Casting e double truncado");
        System.out.println("int valor = (int)salario;");
        System.out.println("valor = ".concat(String.valueOf(valor)));
        System.out.println();

        double valor1 = 0.2;
        double valor2 = 0.1;
        System.out.println("Os números de ponto flutuante podem se comportar um pouco fora do esperado");
        System.out.println("Somando dois doubles ocm 0.1 e 0.2");
        System.out.println(valor1+valor2);
        System.out.println();
    }
}
