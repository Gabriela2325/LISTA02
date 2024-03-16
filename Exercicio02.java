public class Exercicio02 {
    public static void executar() {

        System.out.println("Exercicio02: ");
        
        //2. Escreva um algoritmo que leia em um vetor uma sequência finita de números
        //digitados pelo usuário e, logo após,
        // mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero.

        double[] numeros = new double[3];

        for (int i = 0; i < 3 ; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = Prompt.lerDecimal();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("O número na posição " + i + " é: " + numeros[i]);
        }

        int positivo = 0, negativo = 0, zero = 0;

        double[] negativos = new double[3];
        double[] zeros = new double[3];
        double[] positivos = new double[3];

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