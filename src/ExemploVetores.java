import java.util.Scanner;

public class ExemploVetores {
    public static void main(String[] args) {
        int votoPessoa1 = 10;
        int votoPessoa2 = 23;
        int votoPessoa3 = 10;
        int votoPessoa4 = 10;
        int votoPessoa5 = 99;
        int votoPessoa6 = 10;
        int votoPessoa7 = 99;
        int votoPessoa8 = 10;
        int votoPessoa9 = 23;
        int votoPessoa10 = 99;

        //primeira forma de criar e inicializar vetor
        //criamos o vetor vazio
        int[] votos = new int[10];

        //nomeVetor[posicao] = valor
        //vetor vai da posicao 0 até 9
        votos[0] = 90;
        votos[1] = 10;
        votos[9] = 10;
        votos[0] = 23;

        String[] nomes = new String[5];

        Scanner entrada = new Scanner(System.in);
        nomes[0] = entrada.next();
        System.out.println("O primeiro nome é:" + nomes[0]);
    }
}
