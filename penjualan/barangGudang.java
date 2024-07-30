import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class barangGudang {

    public static void main(String[] args) {
        Map<String, Integer> gudang = new HashMap<>();
        initializeGudang(gudang);

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            tampilkanGudang(gudang);

            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Keluar");

            System.out.print("Pilih menu (1/2): ");
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    tambahBarang(gudang, scanner);
                    break;
                case 2:
                    System.out.println("Program Selesai");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak sesuai. Silahkan pilih ulang.");
            }
        }
    }

    private static void initializeGudang(Map<String, Integer> gudang) {
        gudang.put("Kardus", 79);
        gudang.put("Plastik", 15);
        gudang.put("Kertas", 7);
        gudang.put("Kaca", 99);
        gudang.put("Karet", 110);
    }

    private static void tampilkanGudang(Map<String, Integer> gudang) {
        System.out.println("\nJumlah Barang Yang Ada di Gudang");
        for (Map.Entry<String, Integer> entry : gudang.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void tambahBarang(Map<String, Integer> gudang, Scanner scanner) {
        System.out.println("\nPilih Barang Yang Ingin di Tambahkan: ");

        int i = 1;
        for (String namaBarang : gudang.keySet()) {
            System.out.println(i + "." + namaBarang);
            i++;
        } 
        
        System.out.print("Masukkan Nomor Barang Anda: ");
        int nomorBarang = scanner.nextInt();

        if (nomorBarang < 1 || nomorBarang > gudang.size()) {
            System.out.println("Nomor Barang Tidak Ada di Data");
            return;
        }

        String namaBarang = "";
        int count = 1;
        for (String nama : gudang.keySet()) {
            if (count == nomorBarang) {
                namaBarang = nama;
                break;
            }
            count++;
        }
        System.out.print("Masukkan Jumlah Barang Yang Ingin Anda Masukkan: ");
        int jumlahTambah = scanner.nextInt();

        gudang.put(namaBarang, gudang.get(namaBarang) + jumlahTambah);
        System.out.println("Jumlah " + namaBarang + "telah ditambahkan.");
    }
}