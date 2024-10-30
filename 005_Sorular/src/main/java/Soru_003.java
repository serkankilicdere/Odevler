import java.util.Scanner;

public class Soru_003 {
    public static void main(String[] args) {
        /*
3-	Kübik number ları yazdıracaksınız ancak ekranda çıktılandığı şekilde olması istenmektedir
Örn:
Bir sayı giriniz…: 5
Sayı	 1:125
Sayi	 2:64
Sayi	 3:27
Sayi	4:8
Sayi	5:1

Bir sayı giriniz…: 9
Sayi	 1:729
Sayi	 2:512
Sayi	 3:343
Sayi	 4:216
Sayı	 5:125
Sayi	 6:64
Sayi	 7:27
Sayi	8:8
Sayi	9:1

         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz ");
        int sayi = input.nextInt();

        for(int i = sayi; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                System.out.println("sayi "+j + " = "+(i * i * i));
                }
            }
        }

    }//END OF MAIN METHOD
}//END OF CLASS
