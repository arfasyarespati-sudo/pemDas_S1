import java.util.Scanner;

//batas kerja maks = 50 - 60 jam/minggu
//upah = 5000/jam
//lebih dari maks = lembur = 6000/jam
//kurang dari min = denda = -1000/jam

public class JamKerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah jam kerja per minggu adalah? ");
        int jjk = input.nextInt();

        int upahj = 5000;
        int lemburj = 6000;
        int dendaj = 1000;
        int maks = 60;
        int min = 50;

        int upah, lembur = 0, denda = 0, total;

        if (jjk > maks) {
            upah = maks * upahj;
            lembur = (jjk - maks) * lemburj;
        } else
            upah = jjk * upahj;

        if (jjk < min)
            denda = (min - jjk) * dendaj;

        total = upah + lembur - denda;

        System.out.println("Jam kerja     : " + jjk);
        System.out.println("Upah   = " + "Rp. " + upah);
        System.out.println("Lembur = " + "Rp. " + lembur);
        System.out.println("Denda  = " + "Rp. " + denda);
        System.out.println("--------------------");
        System.out.println("Total  = " + "Rp. " + total);

        input.close();

    }
}
