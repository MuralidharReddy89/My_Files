import java.util.*;

class MinandMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array:");
        int size=sc.nextInt();
        int[] a=new int[size];
        int max=a[0];
        int min=a[0];
        System.out.println("read elements from user:");//user input system
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("display maximum element in an array:");//it will display the max element alogrithm
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
        System.out.println("display minimum element in an array:");//
        for(int i=0; i<a.length; i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);

    }
}