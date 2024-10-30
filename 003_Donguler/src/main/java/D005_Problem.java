public class D005_Problem {
    public static void main(String[] args) {
        /*
        1’den 100’e kadar olan sayılar içinde 3 ve 5 ile bölünebilen sayıları ekrana yazdırın.
         */
        for (int i=0; i<=100;i++ ){
            if(i%3==0) System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if(i%5==0) System.out.print(i+" ");

        }
    }//END OF MAIN METHOD
}//END OF CLASS
