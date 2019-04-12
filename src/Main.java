import basico.AliquotaIfs;
import basico.CharEString;
import basico.TestaValores;
import basico.TesteIntEDouble;

public class Main {

    public static void main(String[] args) {
        TesteIntEDouble numericos = new TesteIntEDouble();
        CharEString textos = new CharEString();
        TestaValores valores = new TestaValores();
        AliquotaIfs imposto = new AliquotaIfs();

        //numericos.exemplosNumericos();
        //textos.exemplosTexto();
        //valores.exemploValores();
        System.out.println("Aliquota  = ".concat(String.valueOf(imposto.calculaAliquota(3300.0f))));

    }
}
