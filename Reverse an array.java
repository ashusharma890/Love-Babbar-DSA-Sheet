// code start

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        int  n=sc.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
        revandprint(arr,n);
    }
    }
       static void revandprint(int[] arr, int n){
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        Collections.reverse(list);
        int[] res= new int[arr.length];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}

// code end

