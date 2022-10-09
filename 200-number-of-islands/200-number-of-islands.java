class Solution {
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        boolean[][] visited=new boolean[rows][columns];
        int count=0;
        for(int i=0;i<rows;i++)
            for(int j=0;j<columns;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                { dfsRec(i,j,visited,grid,rows,columns);
                  count++;
                }
            }
        return count;
        
    }
    
    public static void dfsRec(int i,int j,boolean[][] visited,char[][] grid,int rows,int columns) {
        visited[i][j]=true;
        if(i+1<rows && !visited[i+1][j] && grid[i+1][j]=='1')
        {
             dfsRec(i+1,j,visited,grid,rows,columns);
        }
        if(j+1<columns && !visited[i][j+1] && grid[i][j+1]=='1')
        {
            dfsRec(i,j+1,visited,grid,rows,columns);
        }
        
        if(i-1>=0 && !visited[i-1][j] && grid[i-1][j]=='1')
        {
             dfsRec(i-1,j,visited,grid,rows,columns);
        }
        if(j-1>=0 && !visited[i][j-1] && grid[i][j-1]=='1')
        {
             dfsRec(i,j-1,visited,grid,rows,columns);
        }
        
    }
}