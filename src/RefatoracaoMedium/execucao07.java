package RefatoracaoMedium;

public class execucao07 {
    public static void main(String[] args) {
       exercicio07 exercicio07= new exercicio07();
           exibirVetor(exercicio07.preencheVetorMeses());

       }
       public static void exibirVetor(String[]vetorParaImprimir){
           int i=0;
           while(i< vetorParaImprimir.length){
               System.out.println(vetorParaImprimir[i]);
               i++;
           }
       }
    }

