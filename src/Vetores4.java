import java.util.Scanner;
public class Vetores4 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira um número para a posição " + i + ": ");
            numeros[i] = scanner.nextInt(); }

            System.out.println("Valores inseridos:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Posição " + i + ": " + numeros[i]);
        }
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i]; // Soma os valores do vetor
        }
        double media = (double) soma / numeros.length;
        System.out.println("Média dos valores: " + media);

        scanner.close();
    }
}
