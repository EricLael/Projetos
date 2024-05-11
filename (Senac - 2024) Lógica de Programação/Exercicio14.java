public class Exercicio14 {
    public static void main(String[] args) {

        // Criando uma lista de números de 1 a 10
        int[] A = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Criando uma lista para armazenar os resultados da multiplicação
        int[] B = new int[A.length];

        // Preenchendo a lista B: cada número é o resultado de multiplicar o número
        // correspondente na lista A pelo seu índice
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * i;
        }

        // Exibindo os números da lista A
        System.out.println("Números de A:\n");

        for (int j = 0; j < A.length; j++) {
            System.out.println(A[j]);
        }

        // Exibindo os números da lista B, que são os números da lista A multiplicados
        // pelos seus índices
        System.out.println("\nNúmeros de B:\n");

        for (int e = 0; e < B.length; e++) {
            System.out.println(B[e]);
        }
    }
}