import java.util.*;

public class absolute{
	public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
	  int T = sc.nextInt();
	  for(int i = 0; i<T; i++){
		  int N = sc.nextInt();
		  int A[] = new int[N];
		  for(int j = 0; j<A.length; j++){
			  A[j] = sc.nextInt();
		  }
		  int c=0, p=0;
		  for(int k = 0; k<A.length; k++){
			  if(A[k]%2 == 0){
				  c++;
			  }else{
				  p++;
			  }
		  }
		  System.out.println(Math.abs(c-p));
	  }
	}
}

