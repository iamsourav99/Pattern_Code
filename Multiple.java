import java.util.*;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Type any number:");
		int N=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(N +" x "+ i+" = "+(N*i));
		}
		sc.close();

	}

}
 