package Material.JavaPem;

public class pekanmain {
     public static void main(String[] args) {
          // pembuatan objek
          Segitiga segi1 = new Segitiga(10, 10);
          Segitiga segi2 = new Segitiga(6, 10);
          Segitiga segi3 = new Segitiga(8, 10);

          // reference
          segi2 = segi1; // segi2 merujuk ke segi 1
          segi2.alas = 20; // alas segi2 adalah alas segi 1
          segi1.alas = 40; // alas segi1 adalah alas segi 2

          // primitive
          int x = 10;
          int y = 20;
          int z = 30;

          x = y;
          y = 50;
          System.out.println("x: " + x);
          System.out.println("y: " + y);
          System.out.println("z: " + z);

          System.out.println(segi1.hitungLuas());
          System.out.println(segi2.hitungLuas());
          System.out.println(segi3.hitungLuas());

     }
}
