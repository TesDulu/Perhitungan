import java.util.Scanner;
public class Perhitungan {
static float total = 0, bil1 = 1, bil2 = 1;// global 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    
    while(bil2 != 0 & bil1 != 0){
     System.out.println("Kalkulator Sederhana");
     System.out.println("1.Persegi");
     System.out.println("2.Segitiga");
     System.out.print("Masukan Pilihan Anda = ");
     int pilihan = input.nextInt();
     int alas;
int tinggi;
double luas;
int panjang;
   int lebar;
        
        switch(pilihan){
            
            case 1:
            
   System.out.println("Menghitung Luas Persegi Panjang");
   System.out.print("Masukan Panjang: ");
   panjang = input.nextInt();
   System.out.print("Masukan Lebar: ");
   lebar = input.nextInt();
  
   luas = (lebar * panjang);
   System.out.println("Luas Persegi  = " +luas);
            break;
            case 2:
           Scanner scan = new Scanner(System.in);
  		 System.out.print("Masukan Alas: ");
   		alas = scan.nextInt();
   		System.out.print("Masukan Tinggi: ");
   		tinggi = scan.nextInt();
  
   		luas = ((alas * tinggi)/2);
   		System.out.println("Luas Segitiga = " +luas);
            break;
            
            default:
            System.out.println("Anda harus mengisi angka");
            
        }
        System.out.println(total);
        
    }
    }
   
}
