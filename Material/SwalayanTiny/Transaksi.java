package Material.SwalayanTiny;

public class Transaksi {
    public static void main(String[] args) {
        System.out.println();
        Pelanggan Silver = new Pelanggan("Jason", "3811111111", 50000, "123");
        Pelanggan Gold = new Pelanggan("Habibi", "5622222222", 50000, "123");
        Pelanggan Platinum = new Pelanggan("Arfasya", "7433333333", 50000, "123");

        System.out.println("=== TopUp ===");
        Platinum.topUp("7433333333", "123", 2000000);
        System.out.println();

        System.out.println("=== Pembelian Cashback ===");
        System.out.println("-> Transaksi Platinum (> 1 Juta):");
        Platinum.beli("7433333333", "123", 1500000);

        System.out.println("-> Transaksi Gold (< 1 Juta):");
        Gold.beli("5622222222", "123", 20000);
        System.out.println();

        System.out.println("=== Sisa Saldo dibawah 10RB ===");
        Silver.beli("3811111111", "123", 45000);
        System.out.println();

        System.out.println("=== Pass 3x Salah & Block===");
        Platinum.topUp("7433333333", "SALAH", 10000);
        Platinum.topUp("7433333333", "SALAH", 10000);
        Platinum.topUp("7433333333", "SALAH", 10000);
        System.out.println();

        System.out.println("=== After Block Transaction===");
        Platinum.beli("7433333333", "123", 50000);
    }
}
