import java.util.Scanner;

public class K002_Problem {
    public static void main(String[] args) {
        /*
        Bir öğrencinin notunu (0-100 arası) kullanıcıdan alın ve
        50’den büyükse “Geçti”, küçükse “Kaldı” şeklinde sonuç yazdırın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz :  ");
        int not=input.nextInt();
        if(not<50) System.out.println("kaldınız");
        if(not>=50) System.out.println("gectiniz");
    }//END OF MAIN METHOD
}//END OF CLASS
