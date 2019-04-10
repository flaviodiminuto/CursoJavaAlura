package basico;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CharEString {
    public void exemplosTexto(){
        char letra = 'a';
        System.out.println("Letra ".concat(String.valueOf(letra)));
        System.out.println();

        char valor = 66;
        System.out.println("Letra ".concat(String.valueOf(valor)));
        System.out.println();

        char char2 = (char)(valor+1);
        System.out.println(char2);
        System.out.println();

        String texto1 = "curso online de tecnologia";
        System.out.println(texto1);
        System.out.println();

        String texto2  = " EM ANDAMENTO ";
        System.out.println(texto1.concat(texto2));

    }

}