import java.util.Scanner;

public class K003_Problem {
    public static void main(String[] args) {

        /*
Kullanıcıdan doğum yılını alın ve
18 yaşından büyük olup olmadığını kontrol edin.
Büyükse "Reşit", değilse "Reşit değil" yazdırın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen dogum yılınızı giriniz:  ");
        int dogumYili = input.nextInt();

        int present=2024;
        int yas=present-dogumYili;

        if(yas>=18) System.out.println("resitsiniz");
        if(yas<18) System.out.println("resit degilsiniz");

    }//END OF MAIN METHOD
}//END OF CLASS
