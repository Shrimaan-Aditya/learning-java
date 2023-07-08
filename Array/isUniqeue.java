class isUniqeue {
    public static boolean unique(int[] n){
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]==n[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] array = {15, 8, 4, 13, 5, 11, 7, 20, 3, 66};
        System.out.println(unique(array));
    }
}
