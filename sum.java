import java.util.*;
public class sum{

	  public static void sumArray(int arr[]){
		  int sum1 = 0;
		  for(int i = 0; i<arr.length; i++){
			  sum1 +=arr[i];
		  }
		  double avg = (double)sum1/arr.length;
		  System.out.println(avg);
	  }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int arr[] = new int[N];
		for(int i = 0 ; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
                       sumArray(arr);

	}
}

