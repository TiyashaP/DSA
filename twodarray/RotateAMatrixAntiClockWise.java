package twodarray;

public class RotateAMatrixAntiClockWise {
    public static void inplaceRotate(int[][] matrix, int n) {
        int rows=n;
        int columns=n;
        int startRow=0;
        int startColumn=0;
        int endRow=rows-1;
        int endColumn=columns-1;
        while(startRow<endRow && startColumn<endColumn){
            for(int offset=0;offset<=endColumn-startColumn-1;offset++)
            {
                int temp=matrix[startRow][startColumn+offset];
                matrix[startRow][startColumn+offset]=matrix[startRow+offset][endColumn];
                matrix[startRow+offset][endColumn]=matrix[endRow][endColumn-offset];
                matrix[endRow][endColumn-offset]= matrix[endRow-offset][startColumn];
                matrix[endRow-offset][startColumn]=temp;

            }
            startColumn++;
            startRow++;
            endRow--;
            endColumn--;
        }
    }

}
