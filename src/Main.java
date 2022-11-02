import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

public class Main {static Scanner scanner =new Scanner(System.in);
   public static void main(String[] args) {

     Triangle triangle = new Triangle();
       System.out.print("a = ");
       triangle.a = scanner.nextInt();
       System.out.print("b = ");
      triangle.b = scanner.nextInt();
       System.out.print("c = ");
       triangle.c = scanner.nextInt();
      triangle.area();

   }

}