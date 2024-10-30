import java.util.Scanner;

public class D003_Problem {
    public static void main(String[] args) {
        /*
        Kullanıcıdan yarıçapı alınan bir dairenin alanını ve çevresini
        hesaplayan bir program yazın (alan = π * r^2, çevre = 2 * π * r).
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen dairenin yarıcapini giriniz");
        double yariCap=input.nextDouble();
        double alan=(3.14*yariCap*yariCap);
        double cevre=2*3.14*yariCap;
        System.out.println("alan..: "+alan);
        System.out.println("cevre..: "+cevre);


    }//END OF MAIN METHOD
}//END OF CLASS
