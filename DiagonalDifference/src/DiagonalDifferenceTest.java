public class DiagonalDifferenceTest {
    public static void main(String[] args) {
        DiagonalDifference diagonalDifference = new DiagonalDifference();
        diagonalDifference.matrixPrinting();
        int result = diagonalDifference.calculateDiagonalDifference();
        System.out.println("Verilen matrisin köşegenlerinin mutlak farkı :  " + result);
    }
}
