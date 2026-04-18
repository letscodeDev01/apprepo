import java.util.*;
 public class rainFall{

	 public static void main(String [] args){
		 Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 int sum = 0;
                   int arr[] = new int[N];
		 for(int i = 0; i<arr.length; i++){
			 arr[i] = sc.nextInt();
			 sum = sum + arr[i];
		 }
		 int avg  = (sum/arr.length);
		 System.out.println(avg);
	 }
 }

