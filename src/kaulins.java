import java.util.Random;
import java.util.Scanner;

public class kaulins {
	static void mestKaulinu(int reiz) {
		int sk, reizes;
		Random rand =  new Random();
		for(int i=0; i<reiz; i++) {
			sk = rand.nextInt(6)+1;
			System.out.println("Skaitlis uzkrita: " +sk);
		}
	}
	//sveiki

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kaulinu? ");
		int reizes = scan.nextInt();
		scan.close();
		mestKaulinu(reizes);
	}
}
