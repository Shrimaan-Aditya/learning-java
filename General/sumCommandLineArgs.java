package General;

/*
 * Sum the Arguments using Command Lines
 */

class sumCommandLineArgs {
    public static void main(String[] args){
        int sum = 0;
        //double sum = 0;
		for(String x:args){
            //This If Statement helps to filter the non-number or skip the when any thing come except numbers
            if(x.matches("[0-9\\.]+")){ 
            //sum =sum + Double.parseDouble(x); // This help to sum double type args
            sum+=Integer.parseInt(x);
            }
			
		}
        System.out.println(sum);
	}
}
