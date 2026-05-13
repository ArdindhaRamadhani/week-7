public class main {
    public static void main(String[] args) {
        Produk p1 = new Elektronik("Samsung", 100000, 5, 2);
        Produk p2 = new Makanan("Bakso", 1000, 100, 3);

        p1.tampilInfo();
        kasir.tampilIndentitas();
        kasir.prosesBelanja(p1, 3);

        system.out.println();
        system.out.println();
        p2.tampilInfo();
        kasir.tampilIndentitas();
    }
}