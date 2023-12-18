package cat.ilg.businesslayer.entities;

public abstract class Shape {

    private Color backgroundColor;
    private Color foregroundColor;
    private static int counter = 0;
    public static final double DEFAULT_SIZE = 1.0;
    public static final double MINIMUM_SIZE = 0.0;

    public Shape(Color backgroundColor, Color foregroundColor) {
        counter++;
        this.setBackgroundColor(backgroundColor);
        this.setForegroundColor(foregroundColor);
    }
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        if (backgroundColor == null){
            throw new NullPointerException("Es obligatorio indicar el color de fondo");
        }
        this.backgroundColor = backgroundColor;
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        if (foregroundColor == null){
            throw new NullPointerException("Es obligatorio indicar el color de línea");
        }
        this.foregroundColor = foregroundColor;
    }

    public static int getCounter(){
        return counter;
    }

    /** Métodos de instancia u objeto */

    public abstract double getArea();
    public abstract String getDescription();

}
