import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        double sonuc = 0.0;

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++) {
            sonuc += (1.0 / i);
        }
        System.out.println("sonuç :" + sonuc);

    }
}
