package cat.ilg.businesslayer.entities;

public class Square extends Shape{

    private double side;
    private static int counter = 0;

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if (side <= MINIMUM_SIZE){
            throw new IllegalArgumentException(String.format("Valor %f no valido para el lado de un cuadrado", side));
        }
        this.side = side;
    }

    public static int getCounter(){
        return counter;
    }

    /** Constructores */
    public Square(double side, Color backgroundColor, Color foregroundColor){
        super(backgroundColor, foregroundColor);
        this.setSide(side);
        counter++;
    }

    public Square(double side){
        this(side,new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE));
    }
    public Square(){
        this(DEFAULT_SIZE);
    }

    @Override
    public double getArea(){
        return Math.pow(getSide(), 2);
    }

    public double getPerimeter(){
        return getSide() * 4;
    }

    @Override
    public String getDescription(){
        return String.format("Soy un cuadrado de lado %.2f (color de fondo: %s i color de línea: %s)", this.getSide(), this.getBackgroundColor().toHexString(), this.getForegroundColor().toHexString());
    }

    /** Sobreescritura de métodos*/
    @Override
    public String toString(){
        return String.format("Cuadrado:%n--------------------%n-Lado: %.2f unidades%n-Color de fondo: %s%n-Color de línea: %s%n", this.getSide(), this.getBackgroundColor().toHexString(), this.getForegroundColor().toHexString());
    }
}
