package basico;

public class TestaValores {
    /**
     * Variaveis primitivas guardam valores e não a referência de memória
     */
    public void exemploValores(){
        int primeiro = 5;
        int segundo = 7;
        segundo = primeiro;
        primeiro = 10;
        System.out.println(segundo);
        
    }
}
