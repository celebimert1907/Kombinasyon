package KombinasyonHesaplama;

import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int r;

        System.out.println("n in r li kombinasyonunu bulalim.");
        System.out.println("Farmul : C(n,r)= n!/(r!*(n-r)!): ");
        System.out.print("n: ");
        n = input.nextInt();
        System.out.print("r: ");
        r = input.nextInt();

        int total = 1;
        for (int c = 1; c<=n; c++){
            total = total * c ;
        }
        System.out.println("n!: " + total);

        int toplam = 1;
        for (int t =1; t<=r; t++){
            toplam = toplam * t;
        }
        System.out.println("r!: " + toplam);

        int fark = total - toplam ;

        System.out.println("(n-r)!: " + fark);



        System.out.print("C(n,r)= n!/(r!*(n-r)!): " + (total / (toplam * fark)));
    }
}
