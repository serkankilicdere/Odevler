import java.util.Scanner;

public class D002_Problem {
    public static void main(String[] args) {
        /*
        Bir öğrencinin sınav notlarını (vize ve final) kullanıcıdan alın,
        vize %40, final %60 etkili olacak şekilde ortalamayı hesaplayın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen vize notunuzu giriniz: ");
        int vizeNotu=input.nextInt();
        System.out.println("Lütfen final notunuzu giriniz: ");
        int finalNotu=input.nextInt();

        double ortalama=(vizeNotu*0.4)+(finalNotu*0.6);
        System.out.println("Ortalama: "+ortalama);

    }//END OF METHOD
}//END OF CLASS
