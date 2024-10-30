import java.util.Scanner;

public class A002_Problem {
    public static void main(String[] args) {
        /*
        Bir dizideki en küçük elemanı ve indeksini bulan bir program yazın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adedi giriniz:  ");
        int adet = input.nextInt();
int[] dizi = new int[adet];
        System.out.println("dizideki sayi adedi "+adet);

        for (int i = 0; i < adet; i++) {
            System.out.println((i+1)+"."+"sayiyi giriniz");
            dizi[i] = input.nextInt();
        }

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }
        System.out.println();
        int enKucuk=dizi[0];
       int enKucukIndex=0;
for (int i = 0; i < dizi.length; i++) {
     if(dizi[i]<enKucuk) {
         enKucuk = dizi[i];
         if(dizi[i]==enKucuk) {
         enKucukIndex = i;
         }
     }
}

        System.out.println("en kucuk sayi: "+enKucuk+"index: "+enKucukIndex);


    }//END OF MAIN METHOD
}//EMD OF CLASS
