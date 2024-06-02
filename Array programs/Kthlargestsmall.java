// to find Kth largest/smallest element in array...
import java.util.*;
public class Kthlargestsmall {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array:");
        int n= sc.nextInt();
        int[] a= new int[n];
        int tmp;
        System.out.println("enter kth element :");
        int k=sc.nextInt();
        System.out.println("read array values form user:");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("display kth lagrest element in an array:");
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]<a[j]){          // we find kth smallest number we cange the symbol (> or greaterthan)
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
            if(i==k-1){
                System.out.print(a[i]+"");
            }
        }

    }
    
}
