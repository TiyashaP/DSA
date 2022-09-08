package twodarray;

class SetMatrixZeroes{
    public static void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int startRow=0;

        while(startRow<rows)
        {
            int startColumn=0;
            while(startColumn<columns)
            {
                if(matrix[startRow][startColumn]==0)
                {
                    int indexRowTop=startRow-1;
                    int indexRowBottom=startRow+1;
                    int indexColumnLeft=startColumn-1;
                    int indexColumnRight=startColumn+1;
                    while(indexColumnLeft>=0)
                    { matrix[startRow][indexColumnLeft]=-1;
                        indexColumnLeft--;
                    }
                    while(indexColumnRight<columns)
                    { matrix[startRow][indexColumnRight]=-1;
                        indexColumnRight++;
                    }
                    while(indexRowTop>=0)
                    { matrix[indexRowTop][startColumn]=-1;
                        indexRowTop--;
                    }
                    while(indexRowBottom<rows)
                    { matrix[indexRowBottom][startColumn]=-1;
                        indexRowBottom++;
                    }



                }
                startColumn++;
            }
            startRow++;

        }
        for (int i=0;i<rows;i++)
            for (int j=0;j<columns;j++)
                if(matrix[i][j]==-1)
                {
                    matrix[i][j]=0;
                }

    }

    public static void main(String[] args) {
        setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
}