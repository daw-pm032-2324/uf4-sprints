package cat.ilg.businesslayer.entities;

public class AlphaColor extends Color{

    /** Atributos */
    private double alpha;
    public static final double MAX_ALPHA = 1.0;
    public static final double MIN_ALPHA = 0.0;

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        if(alpha < MIN_ALPHA || alpha > MAX_ALPHA){
            throw new IllegalArgumentException(String.format("Valor %.2f no valido como transparencia. (Rango: %.2f - %.2f)", alpha, MIN_ALPHA, MAX_ALPHA));
        }
        this.alpha = alpha;
    }

    /** Constructores */
    public AlphaColor(int red, int green, int blue, double alpha){
        super(red,green,blue);
        this.setAlpha(alpha);
    }

    public AlphaColor(int red, int green, int blue){
        this(red, green, blue, MIN_ALPHA);
    }

    /** Sobreescritura de métodos */

    @Override
    public String toRGBString(Boolean upper){
        return String.format("%s alpha: %.2f", super.toRGBString(upper), this.getAlpha());
    }

    @Override
    public String toHexString(Boolean upper){
        return String.format("%s alpha: %.2f", super.toHexString(upper), this.getAlpha());
    }
}
