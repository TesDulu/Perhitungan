import java.util.Scanner;
public class luassegitiga {
public static void main(String[] args) {
   int alas;
   int tinggi;
   double luas;

   Scanner scan = new Scanner(System.in);
   System.out.print("Masukan Alas: ");
   alas = scan.nextInt();
   System.out.print("Masukan Tinggi: ");
   tinggi = scan.nextInt();
  
   luas = ((alas * tinggi)/2);
   System.out.println("Luas Segitiga = " +luas);
    }
}

