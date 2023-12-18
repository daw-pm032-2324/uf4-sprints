package cat.ilg.businesslayer.entities;

import java.util.Random;

public class Color {

    /**Atributos*/
    private int red;
    private int green;
    private int blue;
    public static final int MAX_VALUE = 255;
    public static final int MIN_VALUE = 0;
    private static int counter = 0;

    /**Getter i Setters*/
    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        if(red < MIN_VALUE || red > MAX_VALUE){
             throw new IllegalArgumentException(String.format("Valor %d no válido para la coordenada R. Valores válidos: %d - %d", red, MIN_VALUE, MAX_VALUE));
        }
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        if(green < MIN_VALUE || green > MAX_VALUE){
            throw new IllegalArgumentException(String.format("Valor %d no válido para la coordenada G. Valores válidos: %d - %d", green, MIN_VALUE, MAX_VALUE));
        }
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        if(blue < MIN_VALUE || blue > MAX_VALUE){
            throw new IllegalArgumentException(String.format("Valor %d no válido para la coordenada B. Valores válidos: %d - %d", blue, MIN_VALUE, MAX_VALUE));
        }
        this.blue = blue;
    }

    /**Constructores */
    public Color(int red, int green, int blue){
        counter++;
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
    }

    public Color(){
        this(MAX_VALUE,MAX_VALUE,MAX_VALUE);
    }

    /**Métodos estáticos o de clase*/
    public static int getCounter(){
        return counter;
    }

    public static Color getRandom(){
        Random rnd = new Random();
        return new Color(rnd.nextInt(MAX_VALUE + 1),rnd.nextInt(MAX_VALUE + 1),rnd.nextInt(MAX_VALUE + 1));
    }

    public static Color fromHexString(String color){
        if(color == null){
            throw new NullPointerException("Es obligatorio indicar una cadena de texto");
        }
        if(!color.matches("^#[0-9A-F-a-f]{6}$")){
            throw  new IllegalArgumentException(String.format("El texto %s no tiene formato de color en hexadecimal", color));
        }
        return new Color(Integer.parseInt(color.substring(1,3), 16),Integer.parseInt(color.substring(3,5), 16),Integer.parseInt(color.substring(5,7), 16));
    }

    /** Métodos de instancia u objecto*/
    public String toRGBString(Boolean upper){
        return String.format(upper ? "RGB(%d, %d, %d)" : "rgb(%d, %d, %d)", this.getRed(), this.getGreen(), this.getBlue());
    }

    public String toRGBString(){
        return toRGBString(false);
    }

    public String toHexString(Boolean upper){
        return String.format(upper ? "#%02X%02X%02X" : "#%02x%02x%02x", this.getRed(), this.getGreen(), this.getBlue());
    }

    public String toHexString(){
        return toHexString(true);
    }

    /** Sobreescritura de métodos heredados */
    @Override
    public String toString(){
        return String.format("Color: %n--------------------%n-RBG: %s %n-Hex: %s %n", toRGBString(), toHexString());
    }
}
