import java.util.Scanner;

public class D004_Problem {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve bu sayıya kadar olan çift sayıları ekrana yazdıran bir program yazın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("LUTFEN BiR SAYi GiRiN:  ");
        int girilenSayi = input.nextInt();

        for (int i = 0; i <=girilenSayi ; i+=2) {
            System.out.print(i+" ");
        }


    }//END OF MAIN METHOD
}//END OF CLASS
