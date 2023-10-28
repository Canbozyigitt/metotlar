import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir Palindrom Sayıdır.");
        } else {
            System.out.println(sayi + " bir Palindrom Sayı değildir.");
        }

        scanner.close();
    }

    // Bir sayının palindrom olup olmadığını kontrol eden fonksiyon
    public static boolean isPalindrom(int sayi) {
        int tersi = 0;
        int gecici = sayi;

        while (gecici != 0) {
            int basamak = gecici % 10;
            tersi = tersi * 10 + basamak;
            gecici /= 10;
        }

        return (sayi == tersi);
    }
}
