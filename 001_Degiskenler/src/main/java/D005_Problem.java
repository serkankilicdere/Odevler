import java.util.Scanner;

public class D005_Problem {
    public static void main(String[] args) {
/*
Kullanıcıdan bir ürünün fiyatını alın ve %18 KDV eklenmiş halini ekrana yazdıran bir program yazın
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Ham fiyat giriniz.. : ");
        double hamFiyat=input.nextDouble();
        double kdv=hamFiyat*0.18;
        System.out.println("ürün kdv..: "+kdv);
        System.out.println("toplam fiyat : " + (kdv+hamFiyat));



    }//END OF MAIN METHOD
}// END OF CLASS
