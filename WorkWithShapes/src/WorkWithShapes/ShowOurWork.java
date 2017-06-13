package WorkWithShapes;

import java.util.ArrayList;

public class ShowOurWork {

	public static void main(String[] args){
		Circle circle = new Circle();
		Triangel triangle = new Triangel();
		Square square = new Square();
		
		circle.setRadius(10);
		circle.setArea((int)(Math.PI*circle.getRadius()*circle.getRadius()));
		
		triangle.setBaseLine(15);
		triangle.setHeight(7);
		triangle.setArea((triangle.getBaseLine()*triangle.getHeight())/2);
		
		square.setSide(15);
		square.setArea(square.getSide()*square.getSide());
		
		ArrayList<Shape> listofShapes = new ArrayList<>();
		listofShapes.add(square);
		listofShapes.add(triangle);
		listofShapes.add(circle);
		
		
		for(int i=0; i<listofShapes.size(); i++){
			System.out.println("Aria of shapes is - " + listofShapes.get(i).getArea());
		}
		
	}
	
		

	
}
