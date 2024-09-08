public class Vetores3 {
    public static void main(String[] args) {
        int numeros []=new int[2];
        numeros [0]=5;
        numeros [1]=10;

        System.out.println("Antes da troca:");
        System.out.println("Posição 0:" + numeros[0]);
        System.out.println("Posição 1:" + numeros[1]);

        int temp = numeros[0];
        numeros[0] = numeros[1];
        numeros[1] = temp;

        System.out.println("Após a troca:");
        System.out.println("Posição 0:" + numeros[0]);
        System.out.println("Posição 1:" + numeros[1]);
    }
}
