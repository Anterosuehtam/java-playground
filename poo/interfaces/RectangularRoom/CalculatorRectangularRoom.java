package poo.interfaces.RectangularRoom;

public class CalculatorRectangularRoom implements GeometricCalc{
    @Override
    public double calcularArea(double height, double width) {
        return height * width;
    }

    @Override
    public double calcularPerimetro(double height, double width) {
        return (height * height) + (width * width);
    }
}
