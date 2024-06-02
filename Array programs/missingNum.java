// to find a missing number in array
import java.util.*;
class missingNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] a= new int[size];

        int expnoele=a.length+1;
        int total_sum= expnoele*(expnoele+1)/2;
        int sum=0;
        System.out.println("read array values from user:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
            sum=sum+a[i];
        }
        System.out.println("missing number is:"+(total_sum-sum));
    }
}