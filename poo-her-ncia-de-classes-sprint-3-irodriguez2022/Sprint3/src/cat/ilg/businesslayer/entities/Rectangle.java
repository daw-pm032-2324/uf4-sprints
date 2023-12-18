package cat.ilg.businesslayer.entities;

public class Rectangle extends Shape{

    private double base;
    private double height;
    private static int counter = 0;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= MINIMUM_SIZE){
            throw new IllegalArgumentException(String.format("Valor %f no valido para la base de un rectangulo", base));
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= MINIMUM_SIZE){
            throw new IllegalArgumentException(String.format("Valor %f no valido para la altura de un rectangulo", height));
        }
        this.height = height;
    }

    public static int getCounter(){
        return counter;
    }

    public Rectangle(double base, double height, Color backgroundColor, Color foregroundColor){
        super(backgroundColor, foregroundColor);
        this.setBase(base);
        this.setHeight(height);
        counter++;
    }

    public Rectangle(double base, double height){
        this(base, height, new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE));
    }
    public Rectangle(){
        this(DEFAULT_SIZE,DEFAULT_SIZE);
    }

    @Override
    public double getArea(){
        return getBase() * getHeight();
    }

    public double getPerimeter(){
        return (getBase() * 2) + (getHeight() * 2);
    }

    @Override
    public String getDescription() {
        return String.format("Soy un rectangulo de base %.2f y de altura  %.2f (color de fondo: %s i color de línea: %s)", this.getBase(), this.getHeight(), this.getBackgroundColor().toHexString(), this.getForegroundColor().toHexString());
    }
}
