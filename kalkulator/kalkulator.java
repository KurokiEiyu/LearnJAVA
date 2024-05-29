package kalkulator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class kalkulator {
    public static void main(String[]args)throws Exception {
        BufferedReader baca=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("masukan angka ke-1 : ");
                double bil1=Double.parseDouble (baca.readLine());
                System.out.println("masukan angka ke-2 : ");
                double bil2=Double.parseDouble (baca.readLine());
                do {
		double hasil = 0 ;
				System.out.println("===========================");
                System.out.println("======Menu Kalkulator======");
                System.out.println("===========================");
                System.out.println("1.Hitung  Hasil Penjumlahan");
                System.out.println("2.Hitung  Hasil Pengurangan");
                System.out.println("3.Hitung  Hasil Perkalian");
                System.out.println("4.Hitung  Hasil Pembagian");
				System.out.println("5.Hitung  Hasil Perpangkatan");
				System.out.println("6.Hitung  Hasil Modulus");
                System.out.println("7.Hitung  Hasil Lebih Kecil");
                System.out.println("8.Hitung  Hasil Lebih Besar");
                System.out.println("9.Hitung  Hasil Sama Dengan");
                System.out.println("10.Hitung  Hasil Tidak Sama Dengan");
                System.out.println("11.Ulangi (Looping)");
                System.out.println("12.Keluar (Exit)");
                System.out.println("Masukan Nomor Pilihan Menu : ");
                int nopil = Integer.parseInt (baca.readLine());
                switch (nopil) {
                case 1 :
                hasil = bil1 + bil2;
                System.out.println("Hasil Penjumlahan \t :" + hasil);
                break;
                case 2 :
                hasil = bil1 - bil2;
                System.out.println("Hasil Pengurangan \t :" + hasil);
                break;
                case 3 :
                hasil = bil1 * bil2;
                System.out.println("Hasil Perkalian \t :" + hasil);
                break;
                case 4 :
                hasil = bil1 / bil2;
                System.out.println("Hasil Pembagian \t :" + hasil);
                break;
                case 5 :
                hasil = bil1 ^ bil2;
                System.out.println("Hasil Perpangkatan \t :" + hasil);
                break;
                case 6 :
                hasil = bil1 % bil2;
                System.out.println("Hasil Modulus \t :" + hasil);
                break;
                case 7 :
                hasil = bil1 < bil2;
                System.out.println("Hasil Lebih Kecil \t :" + hasil);
                break;
                case 8 :
                hasil = bil1 > bil2;
                System.out.println("Hasil Lebih Besar \t :" + hasil);
                break;
                case 9 :
                hasil = bil1 = bil2;
                System.out.println("Hasil Sama Dengan \t :" + hasil);
                break;
                case 10 :
                hasil = bil1 != bil2;
                System.out.println("Hasil Tidak Sama Dengan \t :" + hasil);
                break;
				case 11 :
                System.Looping (0);
                break;
                case 12 :
                System.exit (0);
                break;
                }
        } while (true);
    }
}