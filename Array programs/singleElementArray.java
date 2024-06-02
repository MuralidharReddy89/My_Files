// to find single time repeated element in an array....
import java.util.*;
class singleElementArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array:");
        int n= sc.nextInt();
        int[] a= new int[n];
        int res=0;
        System.out.println("read array values form user:");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Display single time repeated element:");
        for(int i=0; i<a.length; i++){
            res=res^a[i];
        }
        System.out.println(res);
    }
}