import java.util.Scanner;

public class sedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        double hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah " + hasil);
    }
}