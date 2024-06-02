import java.util.*;
class problem1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int N=sc.nextInt();
        System.out.println("Enter k value:");
        int k=sc.nextInt();
        int nums[]=new int[N];
        System.out.println("Enter user values:");
        for(int i=0;i<N;i++){
            nums[i]=sc.nextInt();
        }
        int ans[]=rotate(nums,k,N);
        System.out.println("display rotated array:");
        for(int i=0;i<N;i++){
            System.out.println(ans[i]);
        }
    }
    static int[] rotate(int Array[], int K , int n){
        if(K>n){
            K=K%n;
        }
        int ans[]=new int[n];
        for(int i=0;i<K;i++){
            ans[i]=Array[n-K+i];
        }
        int index=0;
        for(int i=K;i<n;i++){
            ans[i]=Array[index++];
        }
        return ans;
    }
}