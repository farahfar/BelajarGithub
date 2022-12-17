print("----------------------------------")
print("PROGRAM GAJI KARYAWAN")
print("----------------------------------")

nama = str(input("Masukkan Nama = "))
giliran = int(input("Masukkkan Giliran = "))
Jam = int(input("Masukkan Jam Kerja ="))

if giliran == 1:
        gapok = 2500000
        Jam = 340000
elif giliran == 2:
        gapok = 3850000
        Jam = 470000
elif giliran == 3:
        gapok = 4500000
        Jam = 690000
elif giliran == 4:
        gapok = 5000000
        Jam = 750000
elif giliran == 5:
        gapok = 5700000
        Jam = 830000
else:
        gapok = 0
        Jam = 0
        
if Jam > 10:
        Lembur = Jam - 10
        JamLembur = Lembur * 450000
else:
        JamLembur = 0
        
gajiBersih = Lembur + Jam + gapok

print("=====================================")
print("Nama Karyawan            : ", nama)
print("Gaji Pokok 1 Bulan       : Rp ", gapok)
print("Gaji Lembur              : Rp ", Lembur)
print("Tunjangan Lama Kerja     : Rp ", Jam)
print("Gaji Bersih              : Rp ",gajiBersih)
print("=====================================")