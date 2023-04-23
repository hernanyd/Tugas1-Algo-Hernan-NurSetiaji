package NilaiMahasiswa1;    //Hernan Yudistira 227064516003
import java.util.Scanner;   //Nur Setiaji Ramadhani 227064516018
public class NilaiMahasiswa1 {   
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in); //membuat scanner
        
       //memasukan jumlah mahasiswa
       System.out.print("Berapa masukan nilai mahaisswa\t= ");
       int jumlahMahasiswa = input.nextInt();
       double totalNilai = 0; //variable total nilai      
       
        //proses perulangan i sebanyak jumlah mahasiswa
       for (int i = 1; i <= jumlahMahasiswa; i++) {
           //memasukan nama mahasiswa
           System.out.print("Masukkan nama mahasiswa\t\t= ");
           String namaMahasiswa = input.next();

           //memasukan nilai mahasiswa
           System.out.print("Masukkan nilai mahasiswa\t= "); 
          double nilaiMahasiswa = input.nextDouble();

          //menghitung total nilai dengan menjumlahkan nilai mahasiswa
          totalNilai += nilaiMahasiswa;
        }
         /*menghitung rata-rata dengan rumus 
         total nilai di bagi dengan jumlah mahasiswa*/
         double rataRata = totalNilai / jumlahMahasiswa;

         //menampilkan total dan rata-rata nilai mahasiswa
         System.out.println("Total nilai mahasiswa\t\t= " + totalNilai);
         System.out.println("Rata-rata nilai mahasiswa\t= " + rataRata);
    }
}

