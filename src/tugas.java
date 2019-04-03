import java.util.Scanner;

public class tugas {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Input kecepatan : ");
        int v = input.nextInt();
        System.out.println("Input jarak : ");
        int s = input.nextInt();
        int jarak = s;
        int t = 0;
        for ( ; s > 0; ){
            s = s - v;
            t++;

        }
        System.out.println("Maka waktu : " + t);
        t = 1;
        for (int i = v ; i < jarak; i+=v)
        {
            //System.out.println("Maka waktu : " + t);
            t++;
        }
        System.out.println("Maka waktu : " + t);
    }
}
