package inventaris;

/**
 * Kelas utama yang menjalankan program.
 * Membuat beberapa produk dan menampilkannya menggunakan Inventory.
 *
 * @author Apriana
 * @version 1.0
 */
public class Main {
    /**
     * Metode utama program.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product("Laptop", 7500000);
        Product p2 = new Product("Mouse", 150000);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.displayAllProducts();
    }
}