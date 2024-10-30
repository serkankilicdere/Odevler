import java.util.Scanner;

public class D001_Problem {
    public static void main(String[] args) {
        /*
        Problem: Kullanıcıdan iki tamsayı alın ve bu sayıların
        toplamını, farkını, çarpımını ve bölümünü ekrana yazdıran
        bir program yazın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 1. sayiyi giriniz:  ");
        int sayi1 = input.nextInt();

        System.out.println("lütfen 2. sayiyi giriniz:  ");
        int sayi2 = input.nextInt();

        System.out.println("-------------------");

        int toplam = sayi1 + sayi2;
        int fark= sayi1 - sayi2;
        int carpim= sayi1 * sayi2;
        double bolum= (double)sayi1 / sayi2;

        System.out.println("toplam : " + toplam);
        System.out.println("fark : " + fark);
        System.out.println("carpim : " + carpim);
        System.out.println("bolum : " + bolum);

        System.out.println("------------------------");
        System.out.println("PROGRAM SONLANDI");

    }//END OF METHOD
}//END OF CLASS
