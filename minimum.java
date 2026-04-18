import java.util.*;

public class minimum{
	 public static void takearray(int arr[]){
                Scanner sc = new Scanner(System.in);
                        for(int i = 0; i<arr.length; i++){
                                arr[i] = sc.nextInt();
                        }
        }
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		takearray(arr);

		int min = arr[0];
		for(int i = 0; i< arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
