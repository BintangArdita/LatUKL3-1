import java.util.Scanner;

public class LatUKL3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah siswa");
 

        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa ; i++) {
            System.out.println("Masukkan nilai siswa ke " + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("=====Hasil Rekap Nilai Siswa====");
        System.out.println("Jumlah siswa : " +jumlahSiswa);
        System.out.println("Rata rata nilai siswa produktif RPL : " +rataRata);

    }
    
}
