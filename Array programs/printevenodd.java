import java.util.ArrayList;
import java.util.Scanner;
class printevenodd {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array:");
        int n= sc.nextInt();
        int[] a= new int[n];
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        System.out.println("read array values form user:");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Display even and odd numbers in an array:");
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                al1.add(a[i]);
            }else{
                al2.add(a[i]);
        }
        int total=0;
        System.out.println("display even numbers:");
        for(int no:al1){
            System.out.println(no+" ");
            total=total+no;
        }
        System.out.println("size of al1:"+al1.size());
        System.out.println("sum of even numbers:"+total);
        int total1=0;
        System.out.println("display odd numbers:");
        for(int no: al2){
            System.out.println(no+" ");
            total1=total1+no;
        }
        System.out.println("size of al2:"+al2.size());
        System.out.println("sum of odd numbers:"+total1);
    }
}
} 
