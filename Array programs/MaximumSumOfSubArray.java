// to find a maximum sum of sub array  a-[4,-2,-3,4,-1,-2,1,5,-3]
import java.util.*;
public class MaximumSumOfSubArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int s=sc.nextInt();
        int[] a=new int[s];
        int max_so_for=Integer.MIN_VALUE;
        int max_ending=0;
        int s1=0;
        int start=0;
        int end=0;
        System.out.println("read values from user:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("display maximum sum of sub array:");
        for(int i=0;i<a.length;i++){
            max_ending=max_ending+a[i];
            if(max_so_for<max_ending){
                max_so_for=max_ending;
                start=s1;end=i;
            }
            if(max_ending<0){
                max_ending=0;
                s1=i+1;
            }
        }
        System.out.println(max_so_for);
        System.out.println("starting index position of sub array:"+start);
        System.out.println("ending index position of sub array:"+end);
    }
}
