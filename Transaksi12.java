public class Transaksi12 {

    Barang12[] pembelians;

    Transaksi12(Barang12[] pembelians) {
        this.pembelians = pembelians;
    }

    void TampilkanBarang(){
        System.out.println("Daftar Barang Toko: ");
        for (Barang12 barang12 : pembelians) {
            barang04.TampilkanBarang();
        }
    }

    void TampilkanBeli(){
        System.out.println("Daftar Barang Yang Dibeli: ");
        for (Barang12 barang12 : pembelians) {
            barang04.TampilkanBarang();
        }
    }

    void Pembelian(String pembelian){
        for (Barang12 barang12 : pembelians) {
            if (barang12.kode.equals(pembelian)) {
                System.out.println("Pembelian Barang Berhasil");
                barang04.TampilkanBarang();
            }else{
                break;
            }
        }
    }
}