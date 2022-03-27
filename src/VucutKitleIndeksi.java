import java.util.Scanner;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy ;
        double kilo ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz:");
        boy = inp.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = inp.nextDouble();

        double vucutKitleIndeksi = kilo/(boy*boy) ;

        System.out.println("Vücut kitle indeksiniz:"+vucutKitleIndeksi );


    }


}
