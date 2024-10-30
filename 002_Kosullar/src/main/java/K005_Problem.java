import java.util.Scanner;

public class K005_Problem {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir ay ismi alın
        ve o ayın kaç gün çektiğini ekrana yazdıran
         bir program yazın (şubat için 28 varsayılabilir).
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sorgulamak istediginiz ayi giriniz:  ");
        String girilenAy = input.nextLine().toLowerCase();



    switch (girilenAy) {
        case "ocak":
            System.out.println("31 gundur");
            break;
        case "şubat":
            System.out.println("28 gundur");
            break;
        case "mart":
            System.out.println("31 gundur");
            break;
        case "nisan":
            System.out.println("30 gundur");
            break;
        case "mayıs":
            System.out.println("31 gundur");
            break;
        case "haziran":
            System.out.println("30 gundur");
            break;
        case "temmuz":
            System.out.println("31 gundur");
            break;
        case "ağustos":
            System.out.println("31 gundur");
            break;
        case "eylül":
            System.out.println("30 gundur");
            break;
        case "ekim":
            System.out.println("31 gundur");
            break;
        case "kasım":
            System.out.println("30 gundur");
            break;
        case "aralık":
            System.out.println("31 gundur");
            break;
        default:
            System.out.println("gecerli bir ay giriniz");
            break;

    }

    }//END OF MAIN METHOD
}//END OF CLASS
