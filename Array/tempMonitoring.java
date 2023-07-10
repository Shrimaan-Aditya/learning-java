import java.util.Scanner;

class tempMonitoring {
    
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Days");
        int noOfDays = sc.nextInt();
         int[] hTemp =new int[noOfDays];
        int avg = 0;
        int count = 0;
        for(int i=0;i<noOfDays;i++){
            System.out.print("Enter the highest temp. of Day "+(i+1)+": ");
            hTemp[i]=sc.nextInt();
            avg=(avg+hTemp[i]);
        }
        avg=avg/noOfDays;
        for(int j=0;j<noOfDays;j++){
        if(hTemp[j]>avg){
                count++;
            }
        }
        System.out.print("Average Tempertature : "+avg+" and "+count+" Days Temperature was Higher then Average");
        sc.close();

    }
}
