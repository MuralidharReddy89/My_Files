// to remove duplicate elements in array...
import java.util.*;
class RemoveDuplicate{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array:");
        int size=sc.nextInt();
        int[] a=new int[size];
        HashSet<Integer> hs=new HashSet<>();
        System.out.println("read elements from user:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length;i++){
            hs.add(a[i]);
        }
        System.out.println("display removed duplicate elements in array:");
        for(int no:hs){
            System.out.print("["+no+"]");
        }

    }
}