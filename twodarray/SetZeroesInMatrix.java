package twodarray;

public class SetZeroesInMatrix {

        public static void setZeroes(int[][] matrix) {
            int rows=matrix.length;
            int column=1;
            int columns=matrix[0].length;
            for(int i=0;i<rows;i++)
            { if(matrix[i][0]==0)
                column=0;
                /*We are iterating from the 1st column only because if there is any zero in the 1st column we are saving it
                in the column variable*/
                for(int j=1;j<columns;j++)
                {
                    if(matrix[i][j]==0)
                    {
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                    }
                }
            }


            for(int i=rows-1;i>=0;i--)
            {
                  /*We are not iterating  1st column only because if there is any zero in
                   the 1st column we are saving it
                in the column variable and so updating the variable likewise*/
                for(int j=columns-1;j>=0;j--)
                {
                    if (matrix[i][0]==0 || matrix[0][j]==0)
                    {
                        matrix[i][j]=0;
                    }
                }
                if(column==0)
                    matrix[i][0]=0;

            }
        }
    }

