
// to find a first duplicate element in array....
import java.util.*;
public class firstduplicate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array:");
        int n= sc.nextInt();
        int[] a= new int[n];
        int tmp=0;
        System.out.println("read array values form user:");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("display first duplicate values:");
        for(int i=0;i<a.length;i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]+",");
                    tmp=tmp+1;
                    break;
                }
                if(tmp>0){
                    break;
                }
            }

        }
    }
 }
