import java.util.Scanner;

public class resi_penjualan {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Barang:");
        System.out.println("1. Pensil");
        System.out.println("2. Spidol");

       
        System.out.print("Pilih barang: ");
        int pilihanBarang = scanner.nextInt();

     
        String namaBarang = "";

        switch (pilihanBarang) {
            case 1:
                namaBarang = "Pensil";
                break;
            case 2:
                namaBarang = "Spidol";
                break;
        }

        
        System.out.print("jumlah barang: ");
        int jumlahBarang = scanner.nextInt();
        System.out.print("Masukkan harga barang: ");
        int hargaBarang = scanner.nextInt();

     
        int totalHarga = hargaBarang * jumlahBarang;

      
        System.out.println("\nResi penjualan:");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Total Harga: " + totalHarga);

        scanner.close();
  
    }
}
