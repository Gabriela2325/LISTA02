public class Exercicio07 {
    public static void executar() {

        System.out.println("Exercicio07: ");

        //7. Faça um programa que leia dois vetores de 5 elementos cada e verifique se elessão
        // iguais ou não.
        // Para serem iguais, todos os elementos dos dois vetores devem coincidir.

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        System.out.println("Preencha o vetor 1:");

        for (int i = 0; i < 5; i++) {
            vetor1[i] = Prompt.lerInteiro("Elemento " + (i+1) + ": ");
        }

        System.out.println("Preencha o vetor 2:");

        for (int i = 0; i < 5; i++) {
            vetor2[i] = Prompt.lerInteiro("Elemento " + (i+1) + ": ");
        }

        boolean iguais = true;
        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break; 
            }
        }

        if (iguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }
    }
}

