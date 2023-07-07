package General;
import java.util.*;

class print {

static void findJumps(long N, long X){
        
        // Your code goes here
           long jumpsFromIndia = (X - 1) / 2;
           long jumpsFromSrilanka;
           if(N%2==0){
               jumpsFromSrilanka = ((N - X) / 2)+1;
           }else{
               jumpsFromSrilanka = (N - X) / 2;
           }
        
        long minJumps = Math.min(jumpsFromIndia, jumpsFromSrilanka);
        System.out.println(minJumps);
    }
    
}

//{ Driver Code Starts.

class GfG{
    
    // Driver Code
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        // Testcase Input
        int t = sc.nextInt();
        
        // Iterating through all testcase input
        while(t-- > 0){
            
            long N = sc.nextLong();
            long X = sc.nextLong();
            
            print g = new print();
            
            g.findJumps(N, X);
            
        }
        
    }
    
}
// } Driver Code Ends