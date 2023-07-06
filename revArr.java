class revArr{
public static void main(String[] args){
       int[] arr= {1,2,3,4,5};
       arrRev(arr);
    }

    static void arrRev(int[] n){
        
        for(int i=0;i<n.length/2;i++){
           int other = n.length-i-1;
           int temp = n[i];
           n[i]=n[other];
           n[other]=temp;
        }

        for(int k=0;k<n.length;k++){
           System.out.println(n[k]);
        }
}
}       