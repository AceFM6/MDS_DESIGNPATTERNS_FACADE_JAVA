package com.tactfactory.designpatternniveau1.facade.model;


public class ShapeMaker implements Facade{

	public static final Facade CIRCLE = new Circle();
	public static final Facade RECTANGLE = new Rectangle();
	public static final Facade SQUARE = new Square();
	
	public Facade facade;


    public ShapeMaker(Facade facade) {
        this.facade = facade;
    }
    public ShapeMaker() {

    }

	@Override
	public void draw() {
        facade.draw();
    }

	public void drawCircle() {
		CIRCLE.draw();
		
	}

	public void drawRectangle() {
		RECTANGLE.draw();
		
	}
	
	public void draw(Facade facade) {
        facade.draw();
    }

	public void drawSquare() {
		SQUARE.draw();
		
	}

	

}
