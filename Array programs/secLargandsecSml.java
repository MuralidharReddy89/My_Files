import java.util.*;
public class secLargandsecSml {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a=new int[n];
        int temp;
        System.out.println("read elements from user:");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Display second largest element in an array:");
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){                 // for seconsd lagrest element we use lessthan symbol(< 
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==1){
                break;
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("second smalest element in an array:"+a[1]);

    }
    
}
