1. **2 d arrays:**
[WavePrint Problem](https://www.codingninjas.com/codestudio/problems/print-like-a-wave_893268?utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_6)
[Solution](https://github.com/TiyashaP/DSA/blob/main/twodarray/WavePrint.java)
Approach: In this pblm every even column is printed from top to bottom(i.e. minRow to maxrow)
and every odd row is printed from bottom to top.

[Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
[Solution](https://github.com/TiyashaP/DSA/blob/main/twodarray/SpiralMatrix.java)
![img.png](img.png)
Approach: Steps:
We create a list equal to the size of the 2d array
We initialise startRow,startColumn,endRow,endColumn
Till we achieve desired count we repeat following steps
Add/print the start row,update start row after print/add,update count
Add/print the endColumn,update endColumn after print/add,update count
Add/print the endRow ,update endRow after print/add,update count
Add/print the startColumn,update startColumn after print/add,update count

