import java.util.Scanner ;
public class tugas1Totalpenjualantiket10 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaTiket = 50000          ;
        int totalTiket = 0              ;
        int i = 0                       ;
        int Jumlahpelanggan             ;
        double Diskon                   ;
        double totalHarga               ;
        double Totalpenjualantiket= 0   ;

        System.out.println("         ");
        System.out.print("Masukkan jumlah Pelanggan : ");
        Jumlahpelanggan= sc.nextInt();


        while ( i < Jumlahpelanggan) {
            System.out.print("jumlah tiket pelanggan "+ (i+1)+" : ");
            totalTiket = sc.nextInt();

            if(totalTiket < 0){
                System.out.println("input jumlah tiket tidak valid ,input ulang.");
                continue;
            }

            if (totalTiket > 4 && totalTiket < 10) {
                Diskon = 0.10 ;
            } else if (totalTiket > 10 ){
                Diskon = 0.15 ;
            } else {
                Diskon = 0 ;
            }

            totalHarga = (hargaTiket * totalTiket) - (Diskon*hargaTiket * totalTiket) ;
            System.out.println("Total Bayar Pelanggan " + (i+1) + ": Rp." + totalHarga ) ;

            Totalpenjualantiket = Totalpenjualantiket +  totalHarga ;
            i++ ;
        }
        System.out.println("         ");
        System.out.println("Total tiket terjual : Rp." + Totalpenjualantiket );
        System.out.println("     ");
        sc.close () ;

    }

}
