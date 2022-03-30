import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişken Oluşturma
        int a, b;
        double c, cevre, alan;

        // Kullanıcıdan Verileri Alma
        Scanner input = new Scanner(System.in);

        System.out.print("a Kenarını Giriniz: ");
        a = input.nextInt();

        System.out.print("b Kenarını Giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + c);

        cevre = a + b + c;
        System.out.println("Girmiş Olduğunuz Üçgenin Çevresi: " + cevre);
        
        alan = (a * b) / 2;
        System.out.println("Girmiş Olduğunuz Üçgenin Alanı: " + alan);
    }
}
