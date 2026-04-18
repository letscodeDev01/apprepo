import java.util.*;
public class pattern{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
		if(N>1){
			for(int i = 0; i<N; i++){
				for(int j = 0; j<N-i; j++){
					if(i==0){
						System.out.print("*");
					}else{
						if(j==0 || j == (N-i-1)){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}

