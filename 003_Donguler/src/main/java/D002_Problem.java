import java.util.Scanner;

public class D002_Problem {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz:  ");
        int girilenSayi=input.nextInt();
        int faktoriyel=1;
        for (int i = 1; i <=girilenSayi ; i++) {
            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);
    }//END OF MAIN METHOD
}//END OF CLASS
