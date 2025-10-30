package Material.Project1;

public class Buku {

    private String judul;
    private int halaman;
    private boolean tersedia;

    public Buku(String judul, int halaman) {
        this.judul = judul;
        this.halaman = halaman;
        this.tersedia = true;
    }

    public void pinjam() {
        if (this.tersedia) {
            this.tersedia = false;
            System.out.println("Buku diambil " + this.judul);
        } else {
            System.out.println("Buku ini tidak tersedia..");

        }
    }

    public void kembalikan() {
        if (this.tersedia == false) {
            this.tersedia = true;
            System.out.println("Buku dikembalikan..");
        } else {
            System.out.println("Buku ada di rak perpustakaan..");
        }

    }

    public void informasi() {
        System.out.println("Judul Buku: " + this.judul);
        System.out.println("Halaman Buku: " + this.halaman);
        System.out.println("Ketersediaan Buku: " + this.tersedia);
    }

    public String getJudul() {
        return this.judul;
    }
}
