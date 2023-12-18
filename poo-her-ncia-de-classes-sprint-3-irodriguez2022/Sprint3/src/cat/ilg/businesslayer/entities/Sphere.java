package cat.ilg.businesslayer.entities;

public class Sphere extends Shape{

    private double radius;

    private static int counter = 0;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= MINIMUM_SIZE){
            throw new IllegalArgumentException(String.format("Valor %f no valido para el radio de una esfera", radius));
        }
        this.radius = radius;
    }

    public static int getCounter(){
        return counter;
    }

    public Sphere(double radius, Color backgroundColor, Color foregroundColor){
        super(backgroundColor, foregroundColor);
        this.setRadius(radius);
        counter++;
    }

    public Sphere(double radius){
        this(radius,new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE));
    }

    public Sphere(){
        this(DEFAULT_SIZE);
    }

    public double getVolume(){
        return 4d/3 * Math.PI * Math.pow(getRadius(), 3);
    }
    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String getDescription() {
        return String.format("Soy una esfera de radio %.2f (color de fondo: %s i color de línea: %s)", this.getRadius(), this.getBackgroundColor().toHexString(), this.getForegroundColor().toHexString());
    }
}
