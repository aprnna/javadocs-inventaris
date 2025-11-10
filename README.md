# 📘 Dokumentasi Proyek Java dengan JavaDocs

## 🧩 Deskripsi Proyek
Proyek ini merupakan tugas untuk mendokumentasikan kode Java menggunakan **JavaDocs**.  
Tujuan utama dari proyek ini adalah menghasilkan dokumentasi yang **jelas**, **terstruktur**, dan **mudah dipahami** untuk membantu proses **pemeliharaan**, **pengembangan**, serta **kolaborasi tim** di masa depan.

Proyek ini terdiri dari tiga kelas utama:
- `Product` — merepresentasikan data produk.
- `Inventory` — mengelola daftar produk dalam inventaris.
- `Main` — menjalankan program utama.

## 📂 Struktur Proyek
- `src/` — main code.
- `docs/` — Dokumentasi HTML yang dihasilkan oleh JavaDocs.

# ⚙️ Cara Menjalankan Program
1. Pastikan kamu sudah memiliki JDK (Java Development Kit) terinstal. 
2. Buka terminal di folder proyek. 
3. Jalankan perintah berikut:
```bash
javac src/inventaris/*.java
java src.inventory.Main
```

# 📄 Cara Membuat Dokumentasi JavaDocs
Jalankan perintah berikut untuk menghasilkan dokumentasi HTML:
```bash
javadoc -d docs src/inventaris/*.java
```

# Link Javadocs
https://aprnna.github.io/javadocs-inventaris/inventaris/package-summary.html