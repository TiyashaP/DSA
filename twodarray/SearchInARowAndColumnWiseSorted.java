package twodarray;

public class SearchInARowAndColumnWiseSorted {

     class Pair{
     int x; int y;

     Pair(int x, int y){
     this.x = x;
     this.y = y;
     }
     }


    public  Pair search(int [][] matrix, int x) {
        int totalRows=matrix.length;
        int totalColumns=matrix[0].length;
        int startRow=0;
        int startColumn=totalColumns-1;
        Pair pair=null;
        while(startRow>=0 && startColumn>=0 && startRow<totalRows && startColumn<totalColumns){
            if(matrix[startRow][startColumn]==x)
            {
                pair=new Pair(startRow,startColumn);
                break;
            }
            else if(matrix[startRow][startColumn]>x)
            {
                startColumn--;
            }
            else{
                startRow++;
            }
        }
        if(null==pair)
        {
            pair=new Pair(-1,-1);
        }
        return pair;
    }


    }


