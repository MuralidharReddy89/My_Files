// to find a common element in an two arrays a1-[4,3,7,9,2] a2-[5,1,4,8,3]...

import java.util.Scanner;

public class CommonElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n= sc.nextInt();
        int[] a1=new int[n];
        int[] a2=new int[n];
        System.out.println("read elemnts from user in an array1:");
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("read elements from user in array2:");
        for(int j=0; j<a2.length; j++){
            a2[j]=sc.nextInt();
        }
        System.out.println("Display common elements in two arrays:");
        for(int i=0; i<a1.length; i++){
            for(int j=0; j<a2.length; j++){
                if(a1[i]==a2[j]){
                    System.out.println(a1[i]+" ");
                }
            }
        }
        
    }
}
