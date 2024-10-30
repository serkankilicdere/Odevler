import java.util.Arrays;
import java.util.Scanner;

public class A003_Problem {
    public static void main(String[] args) {
        /*
        Bir dizi oluşturun ve dizideki elemanları küçükten büyüğe sıralayan bir program yazın.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adet giriniz:  ");
        int adet=input.nextInt();
        int[] dizi=new int[adet];
        System.out.println("dizideki sayi adedi "+adet);

        for (int i = 0; i < adet; i++) {
            System.out.println((i+1)+"."+"elemanı giriniz: ");
            dizi[i]=input.nextInt();
        }

        Arrays.sort(dizi); //

        for(int eleman:dizi){
            System.out.print(eleman+" ");
        }

    }//END OF MAIN METHOD
}//END OF CLASS
