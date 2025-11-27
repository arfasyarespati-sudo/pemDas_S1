package Material.ProjectGame;

public class RoleChar {

    int hp;
    int dmg;
    int mana;
    String nama;
    String role;

    public RoleChar(String nama, String role) {
        this.nama = nama;
        this.role = role;

        if (role.equals("Warrior")) {
            this.hp = 2000;
            this.dmg = 9000;
            this.mana = 100;
        } else if (role.equals("Mage")) {
            this.hp = 800;
            this.dmg = 7500;
            this.mana = 5000;
        } else if (role.equals("Tank")) {
            this.hp = 10000;
            this.dmg = 4000;
            this.mana = 500;
        } else {
            System.out.println("Role tak dikenali..");
        }

    }

    public void infokan() {
        System.out.println("=================");
        System.out.println("Nama  : " + this.nama);
        System.out.println("Role  : " + this.role);
        System.out.println("Damage: " + this.dmg);
        System.out.println("Health: " + this.hp);
        System.out.println("Mana  : " + this.mana);
    }
}
