public class singleDiAryInsert {
    int[] arr=null;

    public singleDiAryInsert(int arraySize){
        arr = new int[arraySize];
        for(int i=0; i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueArray){
        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=valueArray;
                System.out.println("Sucessfully value is asigned");
            }
            else{
                System.out.println("Already value is asigned");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Unexpected location,location is out of boundary");
        }
    }

    
}
