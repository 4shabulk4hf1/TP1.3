import java.util.Scanner;

class TP1 {
    private static String Masukan_nama_barang_yang_mau_ditambah;

    public static void main(String args[]) {

        String nama;
        String Masukan_nama_barang_yang_mau_ditambah;
        int Masukan_jumlah_barang_yang_mau_ditambah;
        double Masukan_harga_beli_untuk_barang_tersebut;
        double Masukan_harga_jual_untuk_barang_tersebut;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama anda: ");
        nama = input.nextLine();

        System.out.println("Stok Gudang Input Barang");
        System.out.println("###############################");
        System.out.println();

        System.out.println("Selamat Datang " + nama);

        System.out.print("Masukan  nama barang yang mau ditambah: ");
        Masukan_nama_barang_yang_mau_ditambah = input.nextLine();

        System.out.print("Masukan  jumlah barang yang mau ditambah: ");
        Masukan_jumlah_barang_yang_mau_ditambah = input.nextInt();

        System.out.print("Masukan  harga beli untuk barang tersebut: ");
        Masukan_harga_beli_untuk_barang_tersebut = input.nextDouble();

        System.out.print("Masukan  harga jual untuk barang tersebut: ");
        Masukan_harga_jual_untuk_barang_tersebut = input.nextDouble();

        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################");
        System.out.println();

        System.out.println("Nama Barang     : " + Masukan_nama_barang_yang_mau_ditambah);
        System.out.println("Jumlah Barang   : " + Masukan_jumlah_barang_yang_mau_ditambah);
        System.out.println("Harga Beli      : Rp " + Masukan_harga_beli_untuk_barang_tersebut);
        System.out.println("Harga Jual      : Rp " + Masukan_harga_jual_untuk_barang_tersebut);

    }
}