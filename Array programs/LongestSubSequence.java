// to find longest sub sequence in array a1-[3,9,1,10,4,20,2]
import java.util.HashSet;
import java.util.Scanner;

// to find longest sub sequence in array...
public class LongestSubSequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        HashSet<Integer> hs= new HashSet<>();
        System.out.println("read elements from user:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("display hashSet list:");
        for(int i=0; i<a.length;i++){
            hs.add(a[i]);
        }
        int longleng=0;
        System.out.println("Display longest sub sequence in array");
        for(int i=0;i<a.length;i++){
            if(!hs.contains(a[i]-1)){
                int no=a[i];
                while(hs.contains(no)){
                    no++;
                }
                if(longleng<no-a[i]){
                    longleng=no-a[i];
                }
            }
        }
        System.out.println(longleng);
    }
}
