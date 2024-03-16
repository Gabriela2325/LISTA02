public class Exercicio04 {
    public static void executar() {

        System.out.println("Exercicio04: ");

        //4. Elabore um programa que leia um vetor de 5 números digitados pelo usuário
        // e uma variável de um número n qualquer,
        // depois mostre na tela o índice dos elementos que são inferiores a n

        int[] numeros = new int[5];

        for (int i = 0; i < 5 ; i++) {
            numeros[i] = Prompt.lerInteiro("Digite um número de : ");
        }

        int n = Prompt.lerInteiro("Digite um número qualquer: ");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < n) {
                System.out.println("O número " + numeros[i] + " no índice " + i + " é inferior a " + n);
            }
        }
    }
}