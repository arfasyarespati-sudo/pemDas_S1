package Material.ProjectCar;

public class Main {
  public static void main(String[] args) {
    Second mobile = new Second("Mobil");
    Second motore = new Second("Motor");

    System.out.println("--- Status Kendaraan (Sistem Sederhana) ---");
    mobile.infomobil();
    motore.infomotor();
    
   System.out.println();

    mobile.access();
    motore.access();

  }
  
}

