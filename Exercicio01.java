public class Exercicio01 {
    public static void executar() {

        System.out.println("Exercicio01: ");

        //1. Construa um programa que leia em um vetor uma sequência de 5 números digitadospelo usuário, 
        //calcule a média e apresente na tela quais valores são menores, iguaisou superiores à média.

        double[] numeros = new double[5];  //inicializando******

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = Prompt.lerDecimal();
        }
  
        double soma = 0;

        for (double num : numeros) {
              soma += num;
        }

        double media = soma / numeros.length; // lengt == retorna o número de elementos no array
  
        double[] menores = new double[5];
        double[] iguais = new double[5];
        double[] maiores = new double[5];
  
        int menor = 0, igual = 0, maior = 0;
  
        for (double num : numeros) {
            if (num < media) {
                menores[menor++] = num;
            } else if (num == media) {
                  iguais[igual++] = num;
            } else {
                  maiores[maior++] = num;
            }
        }
  
        System.out.println("Média: " + media);

        System.out.print("Números menores que a média: ");
            for (int i = 0; i < menor; i++) {
                System.out.print(menores[i] + " ");
            }

            System.out.println();
  
        System.out.print("Números iguais à média: ");
            for (int i = 0; i < igual; i++) {
                System.out.print(iguais[i] + " ");
            }
        
            System.out.println();
  
        System.out.print("Números maiores que a média: ");
            for (int i = 0; i < maior; i++) {
                System.out.print(maiores[i] + " ");
            }

            System.out.println();
    }
}
