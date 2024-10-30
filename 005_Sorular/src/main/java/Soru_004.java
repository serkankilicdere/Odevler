import java.util.Scanner;

public class Soru_004 {
    public static void main(String[] args) {
        /*
4-	Kullanıcıdan 0-100 arası bir sayı girmesini isteyeceksiniz. Bu sayılar dışında
 bir değer girer ise girilen sayı sınır dışında bir sayıdır uyarısı vereceksiniz.
  Temel kural olarak Kullanıcının girdiği geçerli sayıların toplamı 100 ü geçtiğinde
  sayı istemeyi durduracaksınız. Kullanıcıdan alınan sayıların en büyük olanı,
  en küçük olanı ve ortalamasını hesaplayan kodu yazınız.
Örn:
Sayı gir…: 5
Sayı gir…: 12
Sayı gir…: 55
Sayı gir…: 43
Max: 55
Min: 5
Ort: 28.75

Örn:
Sayı gir…: 95
Sayı gir…: 105
Girilen sayı aralık dışı
Sayı gir…: 1
Sayı gir…: 5
Max: 95
Min: 1
Ort: 33,666666666664

         */

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;
        int sayiAdedi = 0;
        int sayiToplami = 0;

        while (toplam <= 100) {
            System.out.print("0-100 arasında bir sayı girin: ");
            int sayi = scanner.nextInt();

            if (sayi < 0 || sayi > 100) {
                System.out.println("Girilen sayı sınır dışında bir sayıdır.");
                continue;
            }

            toplam += sayi;
            sayiToplami += sayi;
            sayiAdedi++;

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }


        double ortalama = (double) sayiToplami / sayiAdedi;

        System.out.println("Girilen sayıların en büyüğü: " + enBuyuk);
        System.out.println("Girilen sayıların en küçüğü: " + enKucuk);
        System.out.println("Girilen sayıların ortalaması: " + ortalama);


    }//END OF MAIN METHOD
}//END OF CLASS
