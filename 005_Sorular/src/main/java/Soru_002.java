import java.util.Scanner;

public class Soru_002 {
    public static void main(String[] args) {
        /*
2-	Bir yolculuk için toplam maliyeti hesaplayan kodu yazınız. Kurallar;
-	L: LPG için H: Hibrit için kullanılacaktır.
-	Arabanın yaşı ve yolculuğun  KM si için 2 tam sayı değeri alın
-	Kullanıcı L veya H girmez ise hata verin
-	Toplam maliyet motor tipine göre hesaplanacaktır
-	LPG 100km de 3.3lt
-	HIBRIT 100km de 4.2lt
-	LPG yakıtı 1.6₺  1 litre için
-	Aracın yaşı 7 den küçük ve eşit ise toplam maliyeti yazdırmanız yeterli
-	Arabanın yaşı 7 den fazla ve 12 ye eşit ve küçük ise maliyet %3 arttırılmalı
-	Arabanın yaşı 12 de n büyük ise toplam maliyet %7 arttırılmalıdır.

         */

        // L 100 km 3,3 lt --> 1km 0,033 lt --> 1km'de 0,033*1,6 tl
        // H 100 km 4,2 lt --> 1km 0,042 lt --> 1km'de 0,042*1,6 tl

        Scanner input = new Scanner(System.in);
        System.out.println("aracın yasini giriniz: ");
        int yas=input.nextInt();
        System.out.println("kac km yol aldınız: ");
        int yol=input.nextInt();

                double birKmL=0.033*1.6;
                double birKmH=0.042*1.6;
while (yas>0 && yol>0 ) {
        System.out.println("aracınız tipi nedir?: L  -  H ");
        String tip=input.next().toLowerCase();
        switch (tip){
            case "l":
                if(yas<=7)System.out.println("yolculukmaliyeti "+ (int)(birKmL*yol)+" tl");
                if(yas>7 && yas<=12) System.out.println("yolculuk maliyeti "+ (int)((birKmL*yol) + 0.3*(birKmL*yol)) +" tl" );
                if (yas>12)System.out.println("yolculuk maliyeti "+ (int)((birKmL*yol) + 0.7*(birKmL*yol)) + "tl");
                break;
                case "h":
                    if(yas<=7)System.out.println("yolculukmaliyeti "+ (int)(birKmH*yol)+" tl");
                    if(yas>7 && yas<=12) System.out.println("yolculuk maliyeti "+ (int)((birKmH*yol) + 0.3*(birKmH*yol))+" tl"  );
                    if (yas>12)System.out.println("yolculuk maliyeti "+ (int)((birKmH*yol) + 0.7*(birKmH*yol))+" tl"  );
                    break;

        }
}


    }//END OF MAIN METHOD
}//END OF CLASS
