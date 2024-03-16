public class Exercicio03 {
    public static void executar() {

        System.out.println("Exercicio03: ");

        //3. Faça um programa que leia em um vetor uma sequência finita de números
        // digitados pelo usuário. Crie um segundo vetor que armazene o dobro de cada número
        // doprimeiro vetor e depois apresente os valores deste vetor.

        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor: ");
        
        double[] vetorOriginal = new double[tamanho];

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = Prompt.lerDecimal("Digite o número para a posição " + i + ": ");
        }

        double[] vetorDobro = new double[tamanho];

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        Prompt.imprimir("Valores do segundo vetor (dobro de cada número do primeiro vetor):");
        for (int i = 0; i < vetorDobro.length; i++) {
            Prompt.imprimir("Posição " + i + ": " + vetorDobro[i]);
        }
    }
}
