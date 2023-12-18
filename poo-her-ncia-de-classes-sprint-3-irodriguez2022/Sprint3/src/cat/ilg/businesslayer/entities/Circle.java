package cat.ilg.businesslayer.entities;

public class Circle extends Shape{

    private double radius;
    private static int counter = 0;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getCounter(){
        return counter;
    }

    public Circle(double radius, Color backgroundColor, Color foregroundColor){
        super(backgroundColor, foregroundColor);
        this.setRadius(radius);
        counter++;
    }

    public Circle(double radius){
        this(radius,new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE));
    }
    public Circle(){
        this(DEFAULT_SIZE);
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String getDescription() {
        return String.format("Soy un circulo de radio %.2f (color de fondo: %s i color de línea: %s)", this.getRadius(), this.getBackgroundColor().toHexString(), this.getForegroundColor().toHexString());
    }
}
