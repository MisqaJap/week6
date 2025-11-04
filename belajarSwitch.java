import java.util.Scanner;
public class belajarSwitch {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.println("Apakah Anda Manusia : ");
        String confirm = ns.nextLine();

        if (confirm.toLowerCase().equals("ya")) {
            System.out.println("Menu");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. exit");
            System.out.println("Maukan Pilihan Anda : ");
            int pilihan = ns.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Menghitung Luas Persegi");
                    int sisi, luasPersegi;
                    System.out.print("Masukkan Sisi : ");
                    sisi = ns.nextInt();
                    luasPersegi = sisi * sisi;
                    if (luasPersegi > 1000 && luasPersegi < 2000) {
                        System.out.println("Luas Persegi= " + luasPersegi + ", Besar");
                    } else if (luasPersegi >= 500 && luasPersegi <= 1000) {
                        System.out.println("Luas Persegi= " + luasPersegi + ", Sedang");
                    } else if (luasPersegi < 500 && luasPersegi > 0) {
                        System.out.println("Luas Persegi= " + luasPersegi + ", Kecil");
                    } else if (luasPersegi < 0) {
                        System.out.println("Ukuran Tidak Valid");
                    } else {
                        System.out.println("Luas Persegi Terlalu Besar");
                    }
                    break;
                case 2:
                    System.out.println("Menghitung Luas Persegi Panjang");
                    int panjang, lebar, luasPersegiPanjang;
                    System.out.print("Masukkan Panjang : ");
                    panjang = ns.nextInt();
                    System.out.print("Masukkan Lebar : ");
                    lebar = ns.nextInt();
                    luasPersegiPanjang = panjang * lebar;
                    if (luasPersegiPanjang > 1000 && luasPersegiPanjang < 2000) {
                        System.out.println("Luas Persegi Panjang= " + luasPersegiPanjang + ", Besar");
                    } else if (luasPersegiPanjang >= 500 && luasPersegiPanjang <= 1000) {
                        System.out.println("Luas Persegi Panjang= " + luasPersegiPanjang + ", Sedang");
                    } else if (luasPersegiPanjang < 500 && luasPersegiPanjang > 0) {
                        System.out.println("Luas Persegi Panjang= " + luasPersegiPanjang + ", Kecil");
                    } else if (luasPersegiPanjang < 0) {
                        System.out.println("Ukuran Tidak Valid");
                    } else {
                        System.out.println("Luas Persegi Panjang Terlalu Besar");
                    }
                    break;
                case 3:
                    System.out.println("Terima Kasih Telah Menggunakan Program Ini");
                    break; 
            
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }
         } else {
            System.out.println("Hayolo, Ini Program Buat Manusia Kok Kamu Coba Coba");
        }
        ns.close();
    }
}
