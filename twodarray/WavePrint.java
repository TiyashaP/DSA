package twodarray;

public class WavePrint {

        public static int[] wavePrint(int arr[][], int nRows, int mCols) {
            int arrNew[] =new int[nRows*mCols];
            int startarr=0;
            for(int col=0;col<mCols;col++)
            {
                if(col%2==0)
                {

                    for(int row=0;row<nRows;row++)
                    {
                        arrNew[startarr]=arr[row][col];
                        startarr++;
                    }
                }
                else{
                    for(int row=nRows-1;row>=0;row--)
                    {
                        arrNew[startarr]=arr[row][col];
                        startarr++;
                    }
                }
            }
            return arrNew;
        }
    }

