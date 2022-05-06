/*1.write a program to find the number of and sum of all integer number that is greater
than 100 and less than 200 that are divisible is 7. 
*/
class divBy7Between100And200{

    public static void main(String args[]){
        int i,sum=0;
        System.out.println("requested numbers are : ");
        for(i=101;i<200;i++){
            if(i%7==0){
                System.out.print(" "+i+" ");
                sum+=i;
            } 
            
        } System.out.println();
        System.out.println("sum of requasted numbers are : "+sum);

    }
}