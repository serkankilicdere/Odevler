import java.util.Scanner;

public class A001_Problem {
    public static void main(String[] args) {
        /*
        5 elemanlı bir dizi oluşturun, kullanıcıdan elemanları alın ve bu dizinin ortalamasını hesaplayın.
         */
        int[] dizi=new int[5];
        Scanner input = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println((i+1)+"."+"sayiyi girin");
            dizi[i]=input.nextInt();

        }
        System.out.println("-----------------------");

        for(int i=0;i<5;i++){
            System.out.print(dizi[i]+" ");
        }

int toplam=0;
        for (int i = 0; i < 5; i++) {

            toplam+=dizi[i];
        }
        System.out.println();

        double ortalama=(double) toplam/5;
        System.out.println("ortalama="+ortalama);
    }//END OF MAIN METHOD
}//END OF CLASS
