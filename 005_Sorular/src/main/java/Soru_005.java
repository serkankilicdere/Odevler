import java.util.Scanner;

public class Soru_005 {
    public static void main(String[] args) {
        /*
5-	Elimizde şöyle bir liste var, bu listeden şehir
seçildiğinde ilgili şehirin plaka numarasını veren kodu yazınız.
01-	Adana
02-	Adıyaman
03-	Ayfon
10-	Balıkesir
11-	Bilecik
12-	Bingöl
13-	Bitlis
20- Denizli
Yukarıda verilen plaka kodlarını kullanacaksınız.
Örn:
Şehir adını giriniz: ADANA
Plaka: 01
Örn:
Şehir adını giriniz: BiTLis
Plaka: 13

         */

        System.out.println("""
                Adana,Adıyaman,Ayfon,Balıkesir,Bilecik,Bingöl,Bitlis,Denizli""");
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen listeden bir sehir seciniz:  ");
        String sehir= input.nextLine().toLowerCase();

        switch (sehir){
            case "adana":
                System.out.println("Plaka 01");
                break;
            case "adıyaman":
                System.out.println("Plaka 02");
                break;
            case "afyon":
                System.out.println("Plaka 03");
                break;
            case "balıkesir":
                System.out.println("Plaka 10");
                break;
            case "bilecik":
                System.out.println("Plaka 11");
                break;
            case "bingöl":
                System.out.println("Plaka 12");
                break;
            case "bitlis":
                System.out.println("Plaka 13");
                break;
            case "denizli":
                System.out.println("Plaka 20");
                break;
        default:
            System.out.println("gecerli bir sehir giriniz");
                break;


        }

    }//END OF MAIN METHOD
}//END OF CLASS
