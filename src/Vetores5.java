import java.util.Scanner;

public class Vetores5 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < nomes.length; i++) {
            System.out.println("Insira um nome para a posição " + i + ": ");
            nomes[i] = scanner.nextLine(); }
        System.out.println("Nomes inseridos:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }

        scanner.close();
    }
}
