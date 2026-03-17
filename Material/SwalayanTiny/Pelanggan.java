package Material.SwalayanTiny;

class Pelanggan {
    private double saldo;
    private String nomorPelanggan;
    private String nama;
    private String pass;
    private int decline = 0;
    private boolean block = false;

    public Pelanggan(String nama, String nomorPelanggan, double saldo, String pass) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
        this.saldo = saldo;
        this.pass = pass;
    }

    private boolean valid(String trueno, String truepass) {
        if (block) {
            System.out.println("Akun terblokir..");
            return false;
        }

        if (this.nomorPelanggan.equals(trueno) && this.pass.equals(truepass)) {
            decline = 0;
            return true;
        }
        decline++;
        System.out.println("Pass/Nomor salah..  Percobaan: " + decline);

        if (decline >= 3) {
            block = true;
            System.out.println("Akun terblokir 3x Salah...");
        }
        return false;
    }

    public void topUp(String no, String p, double jml) {
        if (valid(no, p)) {
            saldo += jml;
            System.out.println("Isi saldo berhasil. Saldo: " + saldo);
        }
    }

    public void beli(String no, String p, double tagihan) {
        if (!valid(no, p))
            return;

        double cb = 0;
        String tipe = nomorPelanggan.substring(0, 2);
        if (tipe.equals("38") && tagihan > 1000000)
            cb = tagihan * 0.05;
        else if (tipe.equals("56"))
            cb = tagihan * (tagihan > 1000000 ? 0.07 : 0.02);
        else if (tipe.equals("74"))
            cb = tagihan * (tagihan > 1000000 ? 0.10 : 0.05);

        double totalSisa = saldo - tagihan + cb;

        if (totalSisa < 10000) {
            System.out.println("Gagal: Saldo setelah transaksi kurang dari 10rb!");
        } else {
            saldo = totalSisa;
            System.out.println("Berhasil! Sisa Saldo: " + saldo + " (Cashback: " + cb + ")");
        }
    }
}
