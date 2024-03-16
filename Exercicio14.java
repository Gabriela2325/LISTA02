public class Exercicio14 {
    public static void executar() {
        System.out.println("Exercicio14: ");

        //14. Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicioneo maior
        // elemento na última posição do vetor.
        // Nenhum número do vetor pode ser apagado ou duplicado. Apresente o vetor atualizado na tela.
    
        int[] vetor = new int[5];

        System.out.println("Digite os 5 elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerInteiro("Elemento " + (i + 1) + ": ");
        }

        int iMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > vetor[iMaior]) {
                iMaior = i;
            }
        }

        int temp = vetor[4]; //temp regra do copo vazio
        vetor[4] = vetor[iMaior];
        vetor[iMaior] = temp;
        
        System.out.println("Vetor atualizado:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vetor[i]);
        }
    }
}
