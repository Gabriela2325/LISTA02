public class Exercicio15 {
    public static void executar() {
        System.out.println("Exercicio15: ");

        //15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor deacordo com a seguinte regra:
        // com exceção do 1º número, só é permitido armazenarum número se ele for maior que o anterior.
        //Ex.: se o primeiro valor lido for 5, o próximovalor lido só poderá ser maior que 5.

        int[] vetor = new int[5];

        vetor[0] = Prompt.lerInteiro("Digite o 1º número: ");

        for (int i = 1; i < 5; i++) {
            int numero = Prompt.lerInteiro("Digite o próximo número: ");
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido. Deve ser maior que o anterior.");
                i--; 
            }
        }

        System.out.println("Vetor preenchido de acordo com a regra:");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vetor[i]);
        }
    }
}
