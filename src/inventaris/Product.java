package inventaris;

/**
 * Kelas ini merepresentasikan sebuah produk dengan nama dan harga.
 *
 */
public class Product {
    private String name;
    private double price;

    /**
     * Membuat objek Product baru.
     *
     * @param name nama produk
     * @param price harga produk
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Mengambil nama produk.
     *
     * @return nama produk
     */
    public String getName() {
        return name;
    }

    /**
     * Mengambil harga produk.
     *
     * @return harga produk
     */
    public double getPrice() {
        return price;
    }

    /**
     * Mengembalikan representasi string dari produk.
     *
     * @return representasi produk dalam format teks
     */
    @Override
    public String toString() {
        return name + " - Rp" + price;
    }
}
