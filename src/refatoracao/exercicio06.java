package refatoracao;

public class exercicio06 {
    public String verificarAprovacao(double nota1, double nota2) {

        double media;
        media = (nota1 + nota2) / 2;

        if (media > 5) {
            return "aprovado";
        }

        if (media < 5) {
            return "reprovado";
        }

        if (media == 5) {
            return "exame";
        }
        return "nao foi possivel ter um resultado";

    }

}
