import java.util.Random;
import java.util.Scanner;

public class kaulins {
	static void mestKaulinu(int reiz) {
		int sk, reizes, lielakais = 0;
		Random rand =  new Random();
		for(int i=0; i<reiz; i++) {
			sk = rand.nextInt(6)+1;
			System.out.println("Skaitlis uzkrita: " +sk);
			if(lielakais<sk)
				lielakais = sk;
		}
		System.out.println("Lielākais skaitlis no visiem izmestajiem: "+lielakais);
	}
	//sveiki

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int reizes;
		do {
		System.out.println("Cik reizes mest kaulinu? ");
		reizes = scan.nextInt();
		}while(reizes < 1);
		scan.close();
		mestKaulinu(reizes);
	}
}
