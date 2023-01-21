class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> output = new ArrayList<List<Integer>>();
	    if (numRows <= 0)  return output;
	    ArrayList<Integer> prev = new ArrayList<Integer>();
	    prev.add(1);
	    output.add(prev);
	    for (int i = 2; i <= numRows; i++) {
		    ArrayList<Integer> curr = new ArrayList<Integer>();
		    curr.add(1);    //first
           
		    for (int j = 0; j < prev.size() - 1; j++) {
			    curr.add(prev.get(j) + prev.get(j + 1));    //middle
		    }
           
		    curr.add(1); 
		    output.add(curr);
		    prev = curr;
	    }
	    return output;      
    }
}


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>>res= new ArrayList<>();
        
       for(int i=0;i<n;i++)
       {
           ArrayList<Long>in=new ArrayList<>();
           for(int j=0;j<=i;j++)
           {
               if(j==0||j==i)
               {
                   in.add(new Long(1));
               }
               else
               {
                   Long num=res.get(i-1).get(j-1)+res.get(i-1).get(j);
                   in.add(num);
               }
               
           }
           
           res.add(in);
           
       }
        return res;
        
    }
}
