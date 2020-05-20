package swen221.shapes;

public class Rectangle implements Shape{
	private int x, y;
	private int width, height;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle(int x, int y, int width, int height) {
		if(x >= 0) {
			setX(x);
		}
		if(y >= 0) {
			setY(y);
		}
		if(width > 0) {
			setWidth(width);
		}
		if(height > 0) {
			setHeight(height);
		}
	}
	
	public void fillShape(Shape shape, Color color, Canvas canvas) {
		
		shape = boundingBox();
		
		for(int i = x; i <= x + width; i++) {
			for(int j = y; j <= y + height; j++) {
				canvas.draw(i, j, color);
			}
		}
		
	}
	
	public void drawShape(Shape shape, Color color, Canvas canvas) {
		
		shape = boundingBox();
		
		for(int i = x; i <= x + width; i++) {
			for(int j = y; j <= y + height; j++) {
				if(i > x && i < x + width && j > y && j < y + height)  {
					continue;
				}
				canvas.draw(i, j, color);
			}
		}
		
	}
	
	public Rectangle boundingBox() {

		int X = x, Y = y, W = width, H = height;
		return new Rectangle(X, Y, W, H);
	}
	
	public boolean contains(int x, int y) {
		if(this.x == x && this.y == y) return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		//do: fill [50, 50, 100, 100] #000000
		Canvas m = new Canvas();
		Color c = new Color("#000000");
		Shape sh = new Rectangle(50, 50, 100, 100);
		((Rectangle) sh).fillShape(sh, c, m);
		m.show();
		
		//do: draw [50, 50, 100, 100] #000000
		Canvas m1 = new Canvas();
		((Rectangle) sh).drawShape(sh, c, m1);
		m1.show();
	}

}
