import java.util.Scanner;

public class Kecepatan {
    public static void main(String[] args){
        int j, w;
        double k;

        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Input Jarak (km) : ");
            j = input.nextInt();
            System.out.println("Input Waktu (jam) : ");
            w = input.nextInt();
        }

        k = (double) j / w;
        System.out.println("Kecepatan (k) = " + k + "km/jam");
    }
}
