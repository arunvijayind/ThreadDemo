package fruitMarket;

public class Market {

	private BufferFixed appleQ = new BufferFixed (5);
	private BufferFixed orangeQ = new BufferFixed (5);
	private BufferFixed grapeQ = new BufferFixed (6);
	private BufferFixed watermelonQ = new BufferFixed (6);

	public void produceApple(Apple apple) throws Exception {
		appleQ.addItem(apple);
	}

	public void produceOrange(Orange orange) throws Exception {
		orangeQ.addItem(orange);
	}

	public void produceGrape(Grape grape) throws Exception {
		grapeQ.addItem(grape);
	}

	public void produceWatermelon(Watermelon watermelon) throws Exception {
		watermelonQ.addItem(watermelon);
	}

	public void consumeApple() throws Exception {
		appleQ.removeItem();
	}

	public void consumeOrange() throws Exception {
		orangeQ.removeItem();
	}

	public void consumeGrape() throws Exception {
		grapeQ.removeItem();
	}

	public void consumeWatermelon() throws Exception {
		watermelonQ.removeItem();
	}
}

class Apple {

}

class Orange {

}

class Grape {

}

class Watermelon {

}
