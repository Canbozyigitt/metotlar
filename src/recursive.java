import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        double taban = scanner.nextDouble();

        System.out.print("Üssü girin: ");
        int us = scanner.nextInt();

        double sonuc = usHesapla(taban, us);

        System.out.println(taban + "^" + us + " = " + sonuc);

        scanner.close();
    }

    public static double usHesapla(double taban, int us) {
        if (us < 0) {
            // Negatif üs işlemi için işlem
            return 1 / (taban * usHesapla(taban, -us - 1));
        } else if (us == 0) {
            return 1; // Herhangi bir sayının 0. kuvveti 1'dir.
        } else {
            return taban * usHesapla(taban, us - 1);
        }
    }
}
