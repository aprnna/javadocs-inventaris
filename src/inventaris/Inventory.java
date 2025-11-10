package inventaris;
import java.util.ArrayList;
import java.util.List;

/**
 * Kelas ini mengelola daftar produk yang ada di dalam inventaris.
 * Menyediakan fungsi untuk menambahkan dan menampilkan produk.
 *
 */
public class Inventory {
    private List<Product> products = new ArrayList<>();

    /**
     * Menambahkan produk ke dalam daftar inventaris.
     *
     * @param product produk yang akan ditambahkan
     * @throws IllegalArgumentException jika produk bernilai null
     */
    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Produk tidak boleh null");
        }
        products.add(product);
    }

    /**
     * Menampilkan seluruh produk dalam inventaris.
     */
    public void displayAllProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
