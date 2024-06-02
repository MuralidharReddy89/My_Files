import java.util.*;
class simple{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String result=display(n);
        System.out.println(result);
    }
   public static String display(int n){
    int sum=0;
    while(n>0){
        int digit=n%10;
        sum = sum+digit;
        n=n/10;
    }
    if(sum<10){
        return "sum:"+sum;
    }else{
        return "you enterted wrong number";
    }            

   }
}