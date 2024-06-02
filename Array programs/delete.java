// to delete a element in a an array
import java.util.*;
public class delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter deleted number:");
        int del=sc.nextInt();
        System.out.println("read elements from user:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length;i++){
            if(a[i]==del){
                for(int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                break;
            }
        }
        System.out.println("display deleted element in array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
