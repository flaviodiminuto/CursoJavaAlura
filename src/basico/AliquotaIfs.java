/*
O João gostaria de criar um programa sobre Imposto de Renda (IR) e verificou as regras de alíquota. Ele descobriu no site da receita:

De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
Agora ajude o João a implementação todas as regras usando condicionais!

Obs: Os valores de alíquota exatos foram simplificados

Para começar, o João escreveu o seguinte esboço de classe:
 */
package basico;
public class AliquotaIfs {

    public float calculaAliquota(float declaracao){
        float aliquota;
        if(declaracao <1900.0f) {
            aliquota = 0.0f;
        }else if(declaracao <=2800.0f){
            aliquota = 7.5f;
        }else if(declaracao<=3751.0f){
            aliquota = 15f;
        }else if(declaracao <=4664.00f){
            aliquota = 22.5f;
        }else{
            aliquota = 27.5f;
        }
        return aliquota;
    }

}
