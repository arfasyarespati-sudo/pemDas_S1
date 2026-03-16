package Material.JavaPem;

class Segitiga {
    double alas;
    double tinggi;
    String nama;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
