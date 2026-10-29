import java.util.Scanner;

public class KafeDoWhile10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi              ;
        int teh               ;
        int roti              ;
        String Namapelanggan ;
        int HargaKopi = 12000 ;
        int HargaTeh = 7000   ;
        int HargaRoti = 20000 ;
        int TotalHarga ;

        do{
            System.out.print("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar):");
            Namapelanggan = sc.nextLine();
            if (Namapelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
                
            }
            System.out.print("Jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh : ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti : ");
            roti = sc.nextInt();
            TotalHarga = (kopi*HargaKopi) + (teh*HargaTeh) + (roti*HargaRoti);
            System.out.println("Total yg harus dibayar : Rp." + TotalHarga);
            sc.nextInt();

        } while (true) ;

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}