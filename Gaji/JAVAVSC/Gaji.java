package JAVAVSC;
import java.util.Scanner;

public class Gaji{
        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);

                int jamKerja, giliran, Lembur, lamaKerja, gajiPokok, jamLembur;
                float gajiBersih;
                String namaKaryawan;

                System.out.println("\nMasukkan Nama : ");
                namaKaryawan = input.nextLine();
                System.out.println("\nMasukkan Giliran : ");
                giliran = input.nextInt();
                System.out.println("\nMasukkan Jam Kerja : ");
                jamKerja = input.nextInt();

                if (jamKerja > 10){
                        jamLembur = jamKerja-10;
                }else{
                        jamLembur = 0;
                }

                switch(giliran){
                        case 1:
                                gajiPokok = 2500000;
                                lamaKerja = 340000;
                                break;
                        case 2:
                                gajiPokok = 3850000;
                                lamaKerja = 470000;
                                break;
                        case 3:
                                gajiPokok = 4500000;
                                lamaKerja = 690000;
                                break;
                        default :
                                gajiPokok = 0;
                                lamaKerja = 0;
                                break;
                }
                Lembur=jamLembur*45000;
                gajiBersih=(Lembur+gajiPokok+lamaKerja);

                System.out.println("\nNama Karyawan : "+namaKaryawan);
                System.out.println("\tGaji Pokok 1 Bulan : "+gajiPokok);
                System.out.println("\tGaji Lembur : "+Lembur);
                System.out.println("\tTunjangan Lama Kerja : "+lamaKerja);
                System.out.println("\tGaji Bersih : "+gajiBersih);

                input.close();
        }
}