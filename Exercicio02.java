public class Exercicio02 {
    public static void executar() {

        System.out.println("Exercicio02: ");
        
        //2. Escreva um algoritmo que leia em um vetor uma sequência finita de números
        //digitados pelo usuário e, logo após,
        // mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero.

        int tam = Prompt.lerInteiro("Digite o tamanho do vetor: ");

        double[] numeros = new double[tam];

        for (int i = 0; i < tam ; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = Prompt.lerDecimal();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("O número na posição " + i + " é: " + numeros[i]);
        }

        int positivo = 0, negativo = 0, zero = 0;

        double[] negativos = new double[tam];
        double[] zeros = new double[tam];
        double[] positivos = new double[tam];

        for (double num : numeros) {
            if (num < 0 ) {
                negativos[negativo++] = num;
            } else if (num == 0) {
                zeros[zero++] = num;
            } else {
                positivos[positivo++] = num;
            }
        }

        System.out.print("Os Números negativos são: ");
            for (int i = 0; i < negativo; i++) {
                System.out.print(negativos[i] + " ");
            }

            System.out.println();
  
        System.out.print("Números iguais a zero são: ");
            for (int i = 0; i < zero; i++) {
                System.out.print(zeros[i] + " ");
            }
        
            System.out.println();
  
        System.out.print("Números positivos são: ");
            for (int i = 0; i < positivo; i++) {
                System.out.print(positivos[i] + " ");
            }
    }
}