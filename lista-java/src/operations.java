// exercicio 18

import java.util.Scanner;

public class operations {
  public static void main(String[] args) {
    int primeiroNumero, segundoNumero, operacao;

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    primeiroNumero = leia.nextInt();

    System.out.println("Digite o segundo número: ");
    segundoNumero = leia.nextInt();

    System.out.println("Digite a operação que deseja realizar: ");
    operacao = leia.nextInt();

    int mediaAritmetica = (primeiroNumero + segundoNumero) / 2;
    int multiplicacao = primeiroNumero * segundoNumero;
    int divisao =  primeiroNumero / segundoNumero;
    int diferencaMaiorMenor; 

    if (primeiroNumero > segundoNumero) {
      diferencaMaiorMenor = primeiroNumero - segundoNumero;
    } else {
      diferencaMaiorMenor = segundoNumero - primeiroNumero;
    }


    switch(operacao) {
      case 1:
        System.out.println("A média aritmética dos números é " + mediaAritmetica);
        break;
      case 2:
        System.out.println("A diferença do maior pelo menor dos números é " + diferencaMaiorMenor);
        break;
      case 3:
        System.out.println("A multiplicação dos números é " + multiplicacao);
        break;
      case 4:
        System.out.println("A divisão dos números é " + divisao);
        break;
      default:
        System.out.println("Operação inválida");
        break;
    }

    leia.close();
  }
  
}
