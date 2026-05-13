public class Elektronik extends Produk {

    private int masaGaransi;

    public Elektronik(String nama, double harga, int stok, int masaGaransi) {
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
    }

    @Override
    public double hitungHargaAkhir(int jmlBeli) {
        System.out.println("Total Harga= " + hitungTotalHarga(jmlBeli));
        return hitungTotalHarga(jmlBeli) * 0.85;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Masa Garansi: " + masaGaransi + "Tahun");
    }
}