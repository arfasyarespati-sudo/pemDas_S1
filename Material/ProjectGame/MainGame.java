package Material.ProjectGame;

public class MainGame {
    public static void main(String[] args) {
        RoleChar first = new RoleChar("Orc", "Warrior");
        RoleChar second = new RoleChar("Mammoth", "Mage");
        RoleChar third = new RoleChar("Nana", "Tank");

        System.out.println();
        System.out.println("== Information ==");
        first.infokan();
        second.infokan();
        third.infokan();

    }
}
