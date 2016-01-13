package hackerrank.algorithms;
import java.util.Scanner;
/*
 Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts that Diksha wants from Taum: one is black and the other is white. To make her happy, Taum has to buy B number of black gifts and W number of white gifts.

The cost of each black gift is X units.
The cost of every white gift is Y units.
The cost of converting each black gift into white gift or vice versa is Z units.
Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts. 
 */

public class TaumAndBday {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			long numberOfBlackGifts = sc.nextInt();
			long numberOfWhiteGifts = sc.nextInt();
			
			long blackCost = sc.nextInt();
			long whiteCost = sc.nextInt();
			long convertCost = sc.nextInt();
			//determines if the difference between prices is smaller or equal than converting them
			if(Math.abs(whiteCost-blackCost)<=convertCost)
				System.out.println(numberOfBlackGifts * blackCost + numberOfWhiteGifts * whiteCost);
			else if (blackCost > whiteCost)
				System.out.println(
						whiteCost * numberOfWhiteGifts + (whiteCost + convertCost) * numberOfBlackGifts);
			else
				System.out.println(
						blackCost * numberOfBlackGifts + (blackCost + convertCost) * numberOfWhiteGifts);
				

			
			T--;
		}
	}
}
