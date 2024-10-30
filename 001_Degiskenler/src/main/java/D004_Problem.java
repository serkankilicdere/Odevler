import java.util.Scanner;

public class D004_Problem {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir cümle alın ve cümlenin karakter sayısını ekrana yazdıran bir program yazın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir şeyler yazınız");
        String girilenCumle= input.nextLine();
        for (int i = 1; i <= girilenCumle.length(); i++) {
if(i==girilenCumle.length())
            System.out.println("karakter sayisi..: "+i);
        }


    }//END OF MAIN METHOD
}//END OF CLASS
