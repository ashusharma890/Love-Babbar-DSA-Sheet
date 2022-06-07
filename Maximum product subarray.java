// code start

// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
         long prod = 1,Prod1 = arr[0],Prod2 = arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            prod = 1;
        }else{
            prod = prod* arr[i];
            Prod1 = Math.max(prod,Prod1);
        }
    }
    prod = 1;
    for(int i=n-1;i>=0;i--){
        if(arr[i]==0){
            prod = 1;
        }else{
            prod = prod* arr[i];
            Prod2 = Math.max(prod,Prod2);
        }
    }
    return Math.max(Prod1,Prod2);
    }
}

// code end

