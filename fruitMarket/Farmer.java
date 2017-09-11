package fruitMarket;

import java.util.Random;

public class Farmer extends Thread {

	private Market market;

	public Farmer (Market market) {
		this.market = market;
	}

	public void run () {
		while (true) {
			System.out.println ("Growing...");
			Random random = new Random();
			try {
				Thread.sleep(random.nextInt(1000));		
				int fruittype = random.nextInt(4);	

				switch (fruittype) {
				case 0: 
					market.produceApple(new Apple());
					System.out.println ("One apple on the market ...");
					break;
				case 1: 
					market.produceOrange(new Orange());
					System.out.println ("One orange on the market ...");
					break;
				case 2: 
					market.produceGrape(new Grape());
					System.out.println ("One grape on the market ...");
					break;
				default: 
					market.produceWatermelon(new Watermelon());			
					System.out.println ("One watermelon on the market ...");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
