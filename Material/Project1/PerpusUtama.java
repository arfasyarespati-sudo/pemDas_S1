package Material.Project1;

public class PerpusUtama {
    public static void main(String[] args) {
        Perpustakaan perpusNasional = new Perpustakaan();

        // 2. Buat objek-objek Buku
        Buku buku1 = new Buku("Laskar Pelangi", 120);
        Buku buku2 = new Buku("Bumi Manusia", 512);
        Buku buku3 = new Buku("Atomic Habits", 109);

        // 3. Tambahkan buku ke perpustakaan
        perpusNasional.tambahBuku(buku1);
        perpusNasional.tambahBuku(buku2);
        perpusNasional.tambahBuku(buku3);

        System.out.println(); // Kasih jarak

        // 4. Tampilkan semua buku (status awal)
        perpusNasional.tampilkanSemuaBuku();

        // 5. Simulasi Peminjaman
        System.out.println("\n===== SIMULASI PINJAM =====");
        perpusNasional.pinjamBuku("Laskar Pelangi");
        perpusNasional.pinjamBuku("Buku Yang Tidak Ada"); // Coba pinjam buku yg tidak ada
        perpusNasional.pinjamBuku("Laskar Pelangi"); // Coba pinjam buku yg sudah dipinjam

        System.out.println();

        // 6. Tampilkan status buku setelah dipinjam
        perpusNasional.tampilkanSemuaBuku();

        // 7. Simulasi Pengembalian
        System.out.println("\n===== SIMULASI KEMBALIKAN =====");
        perpusNasional.kembalikanBuku("Laskar Pelangi");
        perpusNasional.kembalikanBuku("Laskar Pelangi"); // Coba kembalikan yg sudah ada

        System.out.println();

        // 8. Tampilkan status buku setelah dikembalikan
        perpusNasional.tampilkanSemuaBuku();
    }
}
