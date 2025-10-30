package Material;

public class OOP1 extends OOP {

    public static void main(String[] args) {

        Action();

        OOP1 Name = new OOP1();
        OOP1 Speed = new OOP1();
        OOP1 Height = new OOP1();
        OOP1 Type = new OOP1();
        OOP1 Does = new OOP1();

        System.out.println(Name.n);
        System.out.println(Speed.s + " m/s");
        System.out.println(Height.x + " cm");
        System.out.println(Type.t);

        Does.dunk();
        System.out.print("2 Points Scored!");
        System.out.println();

        Speed.shoot();
        System.out.println("3 Points Scored!");

    }
}
