import java.util.Scanner;

public class K004_Problem {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç sayı alın ve en büyüğünü ekrana yazdırın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz:  ");
        int sayi1 = input.nextInt();
        System.out.println("2.sayiyi giriniz:  ");
        int sayi2 = input.nextInt();
        System.out.println("3.sayiyi giriniz:  ");
        int sayi3 = input.nextInt();

        int enBuyuk = sayi1;
        if(sayi2>enBuyuk)enBuyuk = sayi2;
        if(sayi3>enBuyuk)enBuyuk = sayi3;
        System.out.println("en buyuk sayi:  " + enBuyuk);



    }//END OF MAIN METHOD
}//END OF CLASS
