package refatoracao;

public class execucao5 {
 public static void main(String[] args) {
    exercicio05 exercicio05= new exercicio05();
    System.out.println("A soma dos números digitados é: " + exercicio05.calcularSoma(10, 20, 30));
    System.out.println("A subtração dos números digitados é: " + exercicio05.calcularSubtracao(10, 20, 30));
    System.out.println("A multiplicacao dos números digitados é: " + exercicio05.calcularMultiplicacao(10, 20, 30));
    System.out.println("A media dos números digitados é: " + exercicio05.calcularMedia(exercicio05.calcularSoma(10, 20, 30), 0, 0));

}   
}
