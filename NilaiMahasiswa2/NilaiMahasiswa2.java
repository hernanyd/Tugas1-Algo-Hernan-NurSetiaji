package NilaiMahasiswa2;      //Hernan Yudistira 227064516003
import java.util.*;           //Nur Setiaji Ramadhani 227064516018
public class NilaiMahasiswa2 {   
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //membuat scanner

 System.out.print("Masukkan jumlah data mahaiswa\t: ");
 int jumlahData = input.nextInt();//memasukan jumlah data mahasiswa
  
 //membuat array nama, nilai uts, nilai uas, rata-rata
  String[] nama = new String[jumlahData];
  int[] nilaiUts = new int[jumlahData];
  int[] nilaiUas = new int[jumlahData];
  int[] totalNilai = new int[jumlahData];
  double[] rataRata = new double[jumlahData];

 //proses perulangan i sebanyak jumlah data mahasiswa
 for (int i = 0; i < jumlahData; i++) {
 //memasukan nama mahasiswa
 System.out.print("Masukkan nama mahasiswa\t\t: ");
 nama[i] = input.next();
//memasukan nilai UTS mahasiswa
 System.out.print("Masukkan nilai UTS mahasiswa\t: ");
 nilaiUts[i] = input.nextInt();
//memasukan nilai UAS mahasiswa
 System.out.print("Masukkan nilai UAS mahasiswa\t: ");
 nilaiUas[i] = input.nextInt();

 //menghitung total nilai dengan rumus nilai uts + nilai uas
 totalNilai[i] = nilaiUts[i] + nilaiUas[i];
 //menghitung rata-rata dengan rumus total nilai dibagi 2
 rataRata[i] = totalNilai[i] / 2;
 }
 
//menampilkan semua isi aray
 System.out.println("\nNo\tNama\tUTS\tUAS\tTotal\tRata-Rata");
 System.out.println("=================================================");
 //proses perulangan untuk menampilakan semua isi array
 for (int i = 0; i < jumlahData; i++) {
 System.out.println((i + 1) + "\t" + nama[i] + "\t" + nilaiUts[i] +
 "\t" + nilaiUas[i] + "\t" + totalNilai[i] + "\t" + rataRata[i]);
        }
    }
}

