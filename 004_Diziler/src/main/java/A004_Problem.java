import java.util.Scanner;
public class A004_Problem {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir dizi alın ve dizide tekrar eden elemanları bulun.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adet giriniz: ");
        int adet = scanner.nextInt();

        int[] dizi = new int[adet];


        System.out.println("elemanları girin:");
        for (int i = 0; i < adet; i++) {
            System.out.print((i + 1) + ". eleman: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.println("Dizideki tekrar eden elemanlar:");

        boolean tekrarVarMi = false;


        for (int i = 0; i < adet; i++) {
            for (int j = i + 1; j < adet; j++) {
                if (dizi[i] == dizi[j]) {
                    System.out.print(dizi[i]+" ");
                    tekrarVarMi = true;
                    break;
                }
            }
        }
        if (!tekrarVarMi) {
            System.out.println("Dizide tekrar eden eleman yok.");
        }


    }//END OF MAIN METHOD
}//END OF CLASS
