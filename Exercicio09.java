public class Exercicio09 {
    public static void executar() {
        System.out.println("Exercicio09: ");

        //9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C de acordo com as seguintes regras:
        //a. Os elementos das posições pares de C são os elementos das posições pares de A;
        //b.Os elementos das posições ímpares de C são os elementos das posições ímpares de B;

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

        int[] vetorC = new int[5];

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { 
                vetorC[i] = vetorA[i];
            } else { 
                vetorC[i] = vetorB[i];
            }
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i+1) + ": " + vetorC[i]);
        }
    }
}
