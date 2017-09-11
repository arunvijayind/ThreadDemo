package fruitMarket;

public class FruitMarket {
	public static void main(String args[]){ 

		int noFarmers = 1;
		int noConsumers = 2;

		Market market = new Market();

		for (int i = 0; i < noFarmers; i++) {
			new Farmer (market).start();
		}

		for (int i = 0; i < noConsumers; i++) {
			new Consumer (market).start();
		}
	}
}


