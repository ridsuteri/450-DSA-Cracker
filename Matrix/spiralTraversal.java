class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {   
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(r == 0){
            ans.add(null);
            return ans;
        }
        
      int hs=0;
      int vs=0;
      int counter=0;
      int numElements = r*c;

      while(counter<numElements)
      {
        //forward row printing
          for(int i=hs;counter < numElements && i < c;i++)
          {
            ans.add(matrix[vs][i]);
            ++counter;
          }
              vs++;

        //downward column printing
          for(int i=vs;counter < numElements && i < r;i++)
          {
            ans.add(matrix[i][c-1]);
            ++counter;
          }
              c--;

        //backward row printing
          for(int i=c-1; counter < numElements && i >= hs ;i--)
          {
            ans.add(matrix[r-1][i]);
            ++counter;
          }
              r--;

        //upward column printing
          for(int i=r-1; counter < numElements && i >= vs ;i--)
          {
            ans.add(matrix[i][hs]);
            ++counter;
          }
        hs++;
      }
      return  ans;

      }
  }
