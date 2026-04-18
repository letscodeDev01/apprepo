import java.util.*;
public class testCase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

			int T = sc.nextInt();
			for(int i = 0; i<T; i++){

                     int N = sc.nextInt();
                     int B = sc.nextInt();
		     int arr[] = new int[N];
                      for(int k = 0; k< arr.length; k++){
			      arr[i] = sc.nextInt();
		      }
		      int c = 0;
		      for(int j = 0; j<arr.length; j++){
			      if(arr[j] == B){
                                   c++;
			      }
		      }
		      if(c == 0){
			      System.out.println("0");
		      }
		      else{
			      System.out.println("1");
		      }
			}
		}
	}

