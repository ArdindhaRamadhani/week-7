public class Makanan extends Produk {
    private int kadaluarsa;

    public Makanan(String nama, double harga, int stok, int kadaluarsa) {
        super(nama, harga, stok);
        this.kadaluarsa = kadaluarsa;
    }

    @Override
    public double hitungHargaAkhir(int jmlBeli) {
        System.out.println("Total Harga= " + hitungTotalHarga(jmlBeli));
        return hitungTotalHarga(jmlBeli) * 0.95;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Masa Kaduluarsa: " + kadaluarsa + " Hari");
    }
}