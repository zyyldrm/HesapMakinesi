
package hesapmakinesi;
import java.util.Scanner;
public class HesapMakinesi {

public static void main(String[] args) {

   int n1 ,n2;
   int select;
 Scanner input = new Scanner(System.in);
    System.out.println("ilk sayiyi giriniz : ");
    n1 = input.nextInt();
    System.out.println("ikinci sayiyi giriniz : ");
    n2 = input.nextInt();
    
    System.out.println("1-Toplama");
    System.out.println("2-Cikarma");
    System.out.println("3-Carpma");
    System.out.println("4-Bolme");
    
    System.out.println("Seciminiz : ");
    select = input.nextInt();
    
    if (select == 1){
      System.out.println("Toplam : " + (n1 + n2));}
    
    else if (select == 2) {
      System.out.println("Sonuc : " + (n1 - n2));}
    
    else if (select == 3) {
      System.out.println("Sonuc : " + (n1 * n2));}
    
    else if(select == 4)  {
      System.out.println("Sonuc : " + (n1 / n2));}
    }
    
}
