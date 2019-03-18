package Pattern;

public class FactoryDemo {
    public static void main(String[] args) {
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape shape = shapeFactory.getShape("CIRCLE");
//
//        shape.draw();
//        Shape shape2 = shapeFactory.getShape("RECTANGLE");
//
//        shape2.draw();
//        Shape shape3 = shapeFactory.getShape("SQUARE");
//
//        shape3.draw();


//        Rectangle rect = (Rectangle) ShapeFactory.getClass(Rectangle.class);
//        rect.draw();
//        Square square = (Square) ShapeFactory.getClass(Square.class);
//        square.draw();
//        Circle circle = (Circle) ShapeFactory.getClass(Circle.class);
//        circle.draw();

        Rectangle rect = ShapeFactory.getClass(Rectangle.class);
        rect.draw();

        Square square = ShapeFactory.getClass(Square.class);
        square.draw();

        Circle circle = ShapeFactory.getClass(Circle.class);
        circle.draw();


    }
}
