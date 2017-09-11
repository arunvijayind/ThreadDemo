package fruitMarket;

import java.util.Random;

public class Consumer extends Thread {	

	private Market market;

	public Consumer (Market market) {
		this.market = market;
	}

	public void run () {
		while (true) {
			System.out.println ("Hungry~~~Must eat~~~");
			Random random = new Random();

			try {
				Thread.sleep(random.nextInt(1000));		
				int fruittype = random.nextInt(4);			
				switch (fruittype) {
				case 0: 
					market.consumeApple();
					System.out.println ("One apple in the tummy ...");
					break;
				case 1: 
					market.consumeOrange();
					System.out.println ("One orange in the tummy ...");
					break;
				case 2: 
					market.consumeGrape();;
					System.out.println ("One grape in the tummy ...");
					break;
				default: 
					market.consumeWatermelon();			
					System.out.println ("One watermelon in the tummy ...");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Why~~~CAN'T~~~EAT~~~");
			}
		}
	}
}
