import java.util.*;
 class duplicate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array:");
        int n= sc.nextInt();
        int[] a= new int[n];
        System.out.println("read array values form user:");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("display duplicate values:");
        for(int i=0;i<a.length;i++){
            for(int j=i+1; j<a.length; j++){
                if((a[i]==a[j]) && (i!=j)){
                    System.out.print(a[j]+",");
                }
            }
        }
    }
 }