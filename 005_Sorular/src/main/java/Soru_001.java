import java.util.Scanner;

public class Soru_001 {
    public static void main(String[] args) {
        /*
1-	Bir kişinin öğrencilik süresini alıp hangi okul döneminde olduğunu söyleyen kodu yazınız.
<5.   “Elemantary School”
5<= gradle <8  ”Junior School”
8<= gradle <10 “High School”
>=10   “College”
<0  “NONE”

         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kac yildir ogrenci oldugunu yaz:  ");
        int yil = input.nextInt();


        if (yil < 5 && yil>=1) {
            System.out.println("elemantry school");
        } else if (yil < 8 && yil >= 5) {
            System.out.println("junior school");
        } else if (yil>=8 && yil<10) {
            System.out.println("high school");
        } else if (yil>=10) {
            System.out.println("college");
        } else {
            System.out.println("gecerli bir rakam giriniz");
        }


    }//END OF MAIN METHOD
}//END OF CLASS
