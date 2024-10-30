import java.util.Scanner;

public class D003_Problem {
    public static void main(String[] args) {
/*
Kullanıcıdan bir sayı alın ve bu sayının asal olup olmadığını kontrol eden bir program yazın.
 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        boolean asal = true;

        if (sayi < 2) {
            asal = false;
        } else {
            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
        }

        if (asal) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

    }//END OF MAIN METHOD
}//END OF CLASS
