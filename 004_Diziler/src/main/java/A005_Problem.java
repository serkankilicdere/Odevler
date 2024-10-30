import java.util.Scanner;

public class A005_Problem {
    public static void main(String[] args) {
        /*
10 elemanlı bir dizide yalnızca çift sayıları ekrana yazdıran bir program yazın.
         */
        int[] dizi=new int[10];
        Scanner input=new Scanner(System.in);
        System.out.println("10 adet sayı giriniz");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+".sayiyi giriniz");
            dizi[i]=input.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2==0){
                System.out.print(dizi[i]+" ") ;
            }
        }
    }//END OF MAIN METHOD
}//END OF CLASS
