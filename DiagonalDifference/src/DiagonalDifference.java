import java.util.Scanner;

public class DiagonalDifference {
    private int size;
    private int[][] arr;
    //Verilen kare matrisin köşegen toplamlarının mutlak farkı

    public void matrixPrinting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matris boyu girin : ");
        size = scanner.nextInt();
        arr = new int[size][size];
        System.out.println(size*size + " adet matris elemanı girin :");
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
    }
    public int calculateDiagonalDifference(){
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        int size = arr.length;
        for (int i = 0; i < size ; i++){
            diagonalSum1 += arr[i][i];
            diagonalSum2 += arr[i][size - i - 1];
        }
        return Math.abs(diagonalSum1 - diagonalSum2);
    }

}
