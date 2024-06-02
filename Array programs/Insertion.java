// to insert element in an array...
import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("enter the position of element:");
        int pos=sc.nextInt();
        System.out.println("enter inserted element:");
        int ele=sc.nextInt();
        System.out.println("read elements from user:");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        for(int i=a.length-1;i<pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=ele;
        System.out.println("display inserted element in array:");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+",");
        }
    }
}
