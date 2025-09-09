public class testing { // public class = dapat diakses kelas lain bersifat public

    public static void main(String[] args) { // static = dipanggil tanpa membuat objek, void tidak mengembalikan nilai
        System.out.println("Selamat pagi"); // output pertama print line
        System.out.println("Semuanya"); // output kedua print biasa

        String a = "Halo nama aku";
        String b = "Arfa";
        String c = "Umur aku";
        int d = 18;

        System.out.println(a + " " + b + " " + c + " " + d);
        int x = 1, y = 2, z = 3;
        System.out.print("Enam" + " " + "=" + " " + (x + y + z));

        System.out.println(" ");
        System.out.println(" ");

        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name : " + studentName);
        System.out.println("Student id   : " + studentID);
        System.out.println("Student age  : " + studentAge);
        System.out.println("Student fee  : " + studentFee);
        System.out.println("Student grade: " + studentGrade);

    }

}