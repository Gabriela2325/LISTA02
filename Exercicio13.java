public class Exercicio13 {
    public static void executar(int n){
        System.out.println("Exercicio12: ");
    
        //384013. Elabore um algoritmo que receba um número n e retorne um vetor com os nprimeiros termos
        // da sequência de Fibonacci.
        // Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,13, 21}.
    
         if (n <= 0) {
            System.out.println("O número n deve ser positivo.");
            return;
        }

        int[] fibonacci = new int[n];

        fibonacci[0] = 1;
        if (n > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }     
}



