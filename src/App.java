import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    System.out.print("Escolha a altura da sua pirâmide: ");

    try {
      int x = scan.nextInt();
      for (int i = 1; i <= x; i++) {
        for (int j = 1; j <= i ; j++) {
          System.out.print(i);
        }
        System.out.print("\n");
      }
    } catch (Exception e) {
      System.out.println("Deve ser um número inteiro");
    }
    scan.close();
  }
}
