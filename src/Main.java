import shape.*;
public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.render();
        Circle circle = new Circle();
        circle.render();
        Shape squareShape = new Square();
        squareShape.render();
        Shape circleShape = new Circle();
        circleShape.render();
    }
}
