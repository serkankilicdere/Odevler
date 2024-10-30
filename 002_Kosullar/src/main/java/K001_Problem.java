import java.util.Scanner;

public class K001_Problem {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir tamsayı alın ve bu sayının çift mi, tek mi olduğunu belirleyin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi girinix.. : ");
        int girilenSayi = input.nextInt();

        if(girilenSayi%2==0)
            System.out.println("Sayi cifttir");
        if(girilenSayi%2==1)
            System.out.println("Sayi tektir");

    }// END OF MAIN METHOD
}//END OF CLASS
