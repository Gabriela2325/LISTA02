public class Exercicio08 {
    public static void executar() {

        System.out.println("Exercicio08: ");

        //8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que 
        //representa aconcatenação de A e B,
        // ou seja, C contém os elementos de A seguidos dos elementosde B

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Preencha o vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = Prompt.lerInteiro("Elemento " + (i+1) + ": ");
        }

        System.out.println("Preencha o vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = Prompt.lerInteiro("Elemento " + (i+1) + ": ");
        }

        int[] vetorC = new int[10]; //o dobro dos 2****

        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i]; 
            vetorC[i + 5] = vetorB[i]; 
        }

        System.out.println("Vetor C é a concatenação de A e B:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + (i+1) + ": " + vetorC[i]);
        }
    }
}
