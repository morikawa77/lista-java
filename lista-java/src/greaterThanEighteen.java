// exercicio 31

public class greaterThanEighteen {
  public static void main(String[] args) {
    int idade, qtdMaiorDezoito = 0;
    String sexo;

    for (int i = 0; i < 100; i++) {
      System.out.println("Digite a sua idade: ");
      idade = Integer.parseInt(System.console().readLine());

      System.out.println("Digite o seu sexo: ");
      sexo = System.console().readLine();

      if (idade >= 18) {
        qtdMaiorDezoito += 1;
        // qtdMaiorDezoito = qtdMaiorDezoito + 1;
      }
    }

    System.out.println("A quantidade de pessoas maior ou igual a 18 anos é " + qtdMaiorDezoito);;
  }
}
