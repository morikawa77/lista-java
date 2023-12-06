// exercicio 15

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        
        Double peso, altura;
        String sexo;

        System.out.println("Digite o seu peso: ");
        peso = leia.nextDouble();

        System.out.println("Digite a sua altura: ");
        altura = leia.nextDouble();

        System.out.println("Digite o seu sexo: ");
        sexo = leia.next();

        Double pesoIdealHomem = (72.2 * altura) - 58.0;
        Double pesoIdealMulher = (62.1 * altura) - 44.7;

        switch (sexo) {
            case "M":
                if(peso < pesoIdealHomem){
                    System.out.println("Abaixo do peso");
                } else if (peso > pesoIdealHomem){
                    System.out.println("Acima do peso");
                } else {
                    System.out.println("Peso ideal");
                }
                break;
            case "F":
                if(peso < pesoIdealMulher){
                    System.out.println("Abaixo do peso");
                } else if (peso > pesoIdealMulher){
                    System.out.println("Acima do peso");
                } else {
                    System.out.println("Peso ideal");
                }
                break;
            default:
                break;
        }

        leia.close();
    }
}
