import java.util.Scanner;
public class SecondLargest {
        
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                }
                int fLargest = Integer.MIN_VALUE;
                int sLargest = Integer.MIN_VALUE;
                for(int i=0;i<n;i++){
                        if(arr[i]>fLargest){
                                sLargest = fLargest;
                                fLargest = arr[i];
                        }else if(arr[i]>sLargest){
                                sLargest = arr[i];
                        }
                }
                if(n<2) System.out.println(-1);
                else System.out.println(sLargest);
        }
    
}
