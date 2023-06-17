package solid;

import solid.srp.Point;
import solid.srp.Square;
import solid.srp.SquareDraw;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(new Point(1,1), 5);
        SquareDraw squareDraw = new SquareDraw(side);
        squareDraw.draw();
        System.out.printf("\nПлощадь фигуры: %d \n", square.getArea());
        square.setSide(square.getSide() * 2);
        Square square2 = new Square(new Point(10, 10),10);
        System.out.printf("\nПлощадь фигуры: %d \n", square2.getArea());
        squareDraw.setSide(3);
        squareDraw.draw();


    }
}
