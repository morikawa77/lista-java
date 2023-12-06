// exercicio 42

import java.util.Scanner;

public class quantNumeros {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        int numero, quantNum = 0;

        for(int i = 1; i <= 100; i++){
            System.out.println("\n Digite um número inteiro: ");
            numero = leitura.nextInt();
            if(numero > 30 && numero < 90) {
                quantNum += 1;
            }
        }
        System.out.println("A quantidade de números entre 30 e 90 é: " + quantNum);
    }
}
