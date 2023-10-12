import java.util.Scanner;

public class contador {
   public static void main(String[] args) {
      Scanner termScanner = new Scanner(System.in);
      System.out.println("Digite o primeiro parâmetro");
      int parametroUm = termScanner.nextInt();
      System.out.println("Digite o segundo parâmetro");
      int parametroDois = termScanner.nextInt();

      try {
         contar(parametroUm, parametroDois);
      } catch (Exception e) {
         System.out.println(e);
      }
   }

   public static void contar (int m, int n) throws ParametrosInvalidosException {
      if(m > n) {
         throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
      }
      final Integer contador = n - m;
      for(int i = 1; i <= contador; i++){
         System.out.println(String.format("Imprimindo o número %d", i));
      }
   }
}
