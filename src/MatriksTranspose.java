import java.util.Scanner;

public class MatriksTranspose {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        int baris = input.nextInt();
        int kolom = input.nextInt();

        int [][] array = new int[baris][kolom];
        int [][] array2 = new int[kolom][baris];

        for (int i = 0 ; i < array.length; i++) {

            for (int j=0; j<array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }

        for (int i = 0 ; i < array.length; i++) {

            for (int j=0; j<array[i].length; j++) {
                array2[j][i] = array[i][j];
            }
        }

        for (int i = 0 ; i < array.length; i++) {

            for (int j=0; j<array[i].length; j++) {
                System.out.print("\t"+array[i][j]);
            }
            System.out.println();
        }

        for (int i = 0 ; i < array2.length; i++) {

            for (int j=0; j<array2[i].length; j++) {
                System.out.print("\t"+array2[i][j]);
            }
            System.out.println();
        }
    }
}

/*
    1 / 2
    array mahasiswa
    iqbal, budi, andi

    array 2 nilai
    0 : 100 90 70
    1 : 90 100 100
    2 : 100 100 100
    mhdiqbalpradipta@gmail.com

 */