public class Exercicio11 {
    public static void executar(){

        System.out.println("Exercicio10: ");

    //11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros de
    // tamanho igual a 5. 
    //Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +8*9 = 140

    int[] vetor1 = new int[]{0, 2, 4, 6, 8};
    int[] vetor2 = new int[]{1, 3, 5, 7, 9};

    int produtoE = 0;
    for (int i = 0; i < 5; i++) {
        produtoE += vetor1[i] * vetor2[i];
    }

    System.out.println("Produto escalar entre os vetores: " + produtoE);

    }
}
