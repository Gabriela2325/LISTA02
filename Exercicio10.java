public class Exercicio10 {
    public static void executar() {
        System.out.println("Exercicio10: ");

        //10. Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, 
        //copie os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é
        // oúltimo elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assimpor diante

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Preencha o vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = Prompt.lerInteiro("Elemento " + (i+1) + ": ");
        }


        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i]; // inverso
        }

        System.out.println("Vetor B com os elementos de A invertidos:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i+1) + ": " + vetorB[i]);
        }
    }
}