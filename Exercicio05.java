public class Exercicio05 {
    public static void executar() {

        System.out.println("Exercicio05: ");

        //5. Elabore um programa que leia 5 números do teclado e os armazene em um vetor.
        //Em seguida, leia um número n qualquer e apresente na
        // tela a quantidade de vezesque o número n aparece no vetor.

        int[] numeros = new int[5];

        for (int i = 0; i < 5 ; i++) {
            numeros[i] = Prompt.lerInteiro("Digite um número de : ");
        }

        int n = Prompt.lerInteiro("Digite um número qualquer: ");

        int contador = 0;

        for (int i = 0; i < 5; i++) {
            if (numeros[i] == n) {
                contador++; 
            }
        }

        System.out.println("O número " + n + " aparece " + contador + " vez(es).");
    }
}
