public class Exercicio06 {
    public static void executar() {

        System.out.println("Exercicio06: ");

        //6. Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetorcom
        // 5 pesos e calcule a média ponderada do aluno.Média ponderada 
        // = nota1 * peso1 + nota2 * peso2 + nota3 * peso3peso1 + peso2 + peso3Ex.: 
        //notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4)

        
            double[] notas = {7.5, 9.2};
            double[] pesos = {6, 4};
    
            double somaN = 0;
            double somaP = 0;
    
            for (int i = 0; i < notas.length; i++) {
                somaN += notas[i] * pesos[i];
                somaP += pesos[i];
            }
    
            double mediaP = somaN / somaP;
    
            System.out.println("Média ponderada: " + mediaP);
        
        }
    }

