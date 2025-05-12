/*Andre Amelini de Faria Ra:252207
 * Arthur Marcolino da Silva Ra:252369
 * Thiago Andrade - 252434
 */
import java.util.Scanner;
public class Ac2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int QtdAluno = 0;
         String[] provas = new String[0];
         System.out.println("Quantos alunos tem na sala:");
         QtdAluno = scanner.nextInt();
        System.out.println("Qual sera a nota minima das provas:");
        int MediasMinima = scanner.nextInt();

        System.out.println("Qual sera a media da ac1:");
         MediasMinima = scanner.nextInt();
           System.out.println("Qual sera a media da ac2:");
         MediasMinima = scanner.nextInt();
           System.out.println("Qual sera a media da aF:");
         MediasMinima = scanner.nextInt();
           System.out.println("Qual sera a media da aG:");
         MediasMinima = scanner.nextInt();

        for(int P = 0;P < provas.length; P++ ){
            System.out.println("Qual o nome do Aluno:");
            provas[P] = scanner.next();

             System.out.println("Qual o nome a nota da Ac1:");
              provas[P] = scanner.next();

              System.out.println("Qual o nome a nota da Ac2:");
              provas[P] = scanner.next();

              System.out.println("Qual a nota da AG");
              provas[P] = scanner.next();

              System.out.println("Qual a nota da AF");
              provas[P] = scanner.next();

        }
        System.out.println("---------------");
        scanner.close();
    }
    
}
