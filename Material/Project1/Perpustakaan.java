package Material.Project1;

import java.util.ArrayList; // Kita butuh ini untuk menyimpan daftar buku

//Blueprint untuk Perpustakaan
public class Perpustakaan {
    // Atribut: Perpustakaan 'memiliki' daftar buku
    private ArrayList<Buku> koleksiBuku;

    // Constructor
    public Perpustakaan() {
        this.koleksiBuku = new ArrayList<>(); // Inisialisasi daftar kosong
    }

    // Method untuk menambah buku baru ke koleksi
    public void tambahBuku(Buku bukuBaru) {
        this.koleksiBuku.add(bukuBaru);
        System.out.println("Buku '" + bukuBaru.getJudul() + "' ditambahkan ke perpustakaan.");
    }

    // Method untuk menampilkan semua buku di koleksi
    public void tampilkanSemuaBuku() {
        System.out.println("\n===== DAFTAR BUKU DI PERPUSTAKAAN =====");
        for (Buku buku : this.koleksiBuku) {
            buku.informasi();
        }
    }

    // Method untuk mencari buku berdasarkan judul
    public Buku cariBuku(String judul) {
        for (Buku buku : this.koleksiBuku) {
            // Gunakan equalsIgnoreCase untuk pencarian yang tidak case-sensitive
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku; // Kembalikan objek buku jika ditemukan
            }
        }
        return null; // Kembalikan null jika tidak ditemukan
    }

    // Method untuk memproses peminjaman
    public void pinjamBuku(String judul) {
        Buku bukuDitemukan = cariBuku(judul);
        if (bukuDitemukan != null) {
            bukuDitemukan.pinjam(); // Panggil method dari objek Buku
        } else {
            System.out.println("Buku dengan judul '" + judul + "' tidak ditemukan.");
        }
    }

    // Method untuk memproses pengembalian
    public void kembalikanBuku(String judul) {
        Buku bukuDitemukan = cariBuku(judul);
        if (bukuDitemukan != null) {
            bukuDitemukan.kembalikan(); // Panggil method dari objek Buku
        } else {
            System.out.println("Buku dengan judul '" + judul + "' tidak ditemukan.");
        }
    }
}
