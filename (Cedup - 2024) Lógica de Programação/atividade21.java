import java.util.Scanner;

class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas são?");
        int e = scanner.nextInt();
        scanner.nextLine();

        String[] nome = new String[e];
        int[] sexo = new int[e];
        String[] saude = new String[e];
        int[] idade = new int[e];
        int total = 0;

        for (int j = 0; j < e; j++) {
            System.out.println("\nQual é o seu nome?");
            nome[j] = scanner.nextLine();
            System.out.println("\n" + nome[j] + " Qual é o seu gênero?" + 
                                         "\n[1] Homem" +
                                         "\n[2] Mulher");
            sexo[j] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\nQual seu estado de saúde?" + 
                               "\n[1] Bom" + 
                               "\n[2] Mau" + 
                               "\n[3] Ruim");
            saude[j] = scanner.nextLine();
            System.out.println("\nQuantos anos você tem?");
            idade[j] = scanner.nextInt();
            scanner.nextLine();

            if (sexo[j] == 1 && idade[j] >= 18 && saude[j].equals("1")) {
                System.out.println("\nVocê é capaz de cumprir o serviço militar!");
                total += 1;
            } else if (sexo[j] == 2 && idade[j] <= 18) {
                System.out.println("\nVocê não é capaz de cumprir o serviço militar.");
            }
        }

        System.out.println("\n" + total + " pessoas são capazes de cumprir o serviço militar!");
    }
}