import cat.ilg.businesslayer.entities.*;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Nota: Las coordenadas RGB de un color han de esta comprendidas entre %d y %d %n%n", Color.MIN_VALUE, Color.MAX_VALUE);
        Color co1 = new Color(Color.MAX_VALUE,125,25);
        System.out.printf("co1 -> r: %d | g: %d | b: %d %n", co1.getRed(), co1.getGreen(), co1.getBlue());
        System.out.printf("co1 -> %s%n", co1.toRGBString());
        System.out.printf("co1 -> %s%n", co1.toRGBString(true));
        System.out.printf("co1 -> hexadecimal %s%n", co1.toHexString(true));
        System.out.printf("co1 -> hexadecimal %s%n%n", co1.toHexString(false));

        Color co2 = new Color(120,Color.MAX_VALUE,120);
        System.out.printf("co2 -> r: %d | g: %d | b: %d %n", co2.getRed(), co2.getGreen(), co2.getBlue());
        System.out.printf("co2 -> %s%n", co2.toRGBString());
        System.out.printf("co2 -> %s%n", co2.toRGBString(true));
        System.out.printf("co2 -> hexadecimal %s%n", co2.toHexString());
        System.out.printf("co2 -> hexadecimal %s%n%n", co2.toHexString(false));

        Color co3 = new Color(Color.MAX_VALUE,Color.MAX_VALUE,Color.MAX_VALUE);
        System.out.printf("co3 -> r: %d | g: %d | b: %d %n", co3.getRed(), co3.getGreen(), co3.getBlue());
        System.out.printf("co3 -> %s%n", co3.toRGBString());
        System.out.printf("co3 -> %s%n", co3.toRGBString(true));
        System.out.printf("co3 -> hexadecimal %s%n", co3.toHexString());
        System.out.printf("co3 -> hexadecimal %s%n%n", co3.toHexString(false));

        Color co4 = Color.getRandom();
        System.out.printf("co4 -> r: %d | g: %d | b: %d %n", co4.getRed(), co4.getGreen(), co4.getBlue());
        System.out.printf("co4 -> %s%n", co4.toRGBString());
        System.out.printf("co4 -> %s%n", co4.toRGBString(true));
        System.out.printf("co4 -> hexadecimal %s%n", co4.toHexString());
        System.out.printf("co4 -> hexadecimal %s%n%n", co4.toHexString(false));

        Color co5 = Color.fromHexString("#FFFFFF");
        System.out.printf("co5 -> r: %d | g: %d | b: %d %n", co5.getRed(), co5.getGreen(), co5.getBlue());
        System.out.printf("co5 -> %s%n", co5.toRGBString());
        System.out.printf("co5 -> %s%n", co5.toRGBString(true));
        System.out.printf("co5 -> hexadecimal %s%n", co5.toHexString());
        System.out.printf("co5 -> hexadecimal %s%n%n", co5.toHexString(false));

        Color co6 = Color.fromHexString("#FFCA91");
        System.out.printf("co6 -> r: %d | g: %d | b: %d %n", co6.getRed(), co6.getGreen(), co6.getBlue());
        System.out.printf("co6 -> %s%n", co6.toRGBString());
        System.out.printf("co6  -> %s%n", co6.toRGBString(true));
        System.out.printf("co6 -> hexadecimal %s%n", co6.toHexString());
        System.out.printf("co6 -> hexadecimal %s%n%n", co6.toHexString(false));

        //Error controlado formato hexadecimal
        /*Color co7 = Color.fromHexString("#pepepe");
        System.out.printf("co7 -> r: %d | g: %d | b: %d %n%n", co7.getRed(), co7.getGreen(), co7.getBlue());*/

        Color co8 = new Color();
        System.out.printf("co8 -> r: %d | g: %d | b: %d %n", co8.getRed(), co8.getGreen(), co8.getBlue());
        System.out.printf("co8 -> %s%n", co8.toRGBString());
        System.out.printf("co8  -> %s%n", co8.toRGBString(true));
        System.out.printf("co8 -> hexadecimal %s%n", co8.toHexString());
        System.out.printf("co8 -> hexadecimal %s%n%n", co8.toHexString(false));

        AlphaColor ac1 = new AlphaColor(Color.MAX_VALUE,125,25, 0.5);
        System.out.printf("ac1 -> r: %d | g: %d | b: %d | a: %.2f %n", ac1.getRed(), ac1.getGreen(), ac1.getBlue(), ac1.getAlpha());
        System.out.printf("ac1 -> %s%n", ac1.toRGBString());
        System.out.printf("ac1 -> %s%n", ac1.toRGBString(true));
        System.out.printf("ac1 -> hexadecimal %s%n", ac1.toHexString());
        System.out.printf("ac1 -> hexadecimal %s%n%n", ac1.toHexString(false));

        AlphaColor ac2 = new AlphaColor(Color.MAX_VALUE,125,25);
        System.out.printf("ac2 -> r: %d | g: %d | b: %d | a: %.2f %n", ac2.getRed(), ac2.getGreen(), ac2.getBlue(), ac2.getAlpha());
        System.out.printf("ac2 -> %s%n", ac2.toRGBString());
        System.out.printf("ac2 -> %s%n", ac2.toRGBString(true));
        System.out.printf("ac2 -> hexadecimal %s%n", ac2.toHexString());
        System.out.printf("ac2 -> hexadecimal %s%n%n", ac2.toHexString(false));

        Square c1 = new Square(10.0, co1, co2);
        System.out.printf("c1 -> %s %n", c1.getDescription());
        System.out.printf("c1 -> color de fondo: %s %n", c1.getBackgroundColor().toHexString());
        System.out.printf("c1 -> color de línea: %s %n", c1.getForegroundColor().toHexString());
        System.out.printf("c1 -> side: %.2f %n", c1.getSide());
        System.out.printf("c1 -> area: %.2f %n", c1.getArea());
        System.out.printf("c1 -> perimeter: %.2f %n%n", c1.getPerimeter());

        Square c2 = new Square(25.8);
        System.out.printf("c2 -> %s %n", c2.getDescription());
        System.out.printf("c2 -> color de fondo: %s %n", c2.getBackgroundColor().toHexString());
        System.out.printf("c2 -> color de línea: %s %n", c2.getForegroundColor().toHexString());
        System.out.printf("c2 -> side: %.2f %n", c2.getSide());
        System.out.printf("c2 -> area: %.2f %n", c2.getArea());
        System.out.printf("c2 -> perimeter: %.2f %n%n", c2.getPerimeter());

        Square c3 = new Square();
        System.out.printf("c3 -> %s %n", c3.getDescription());
        System.out.printf("c3 -> color de fondo: %s %n", c3.getBackgroundColor().toHexString());
        System.out.printf("c3 -> color de línea: %s %n", c3.getForegroundColor().toHexString());
        System.out.printf("c3 -> side: %.2f %n", c3.getSide());
        System.out.printf("c3 -> area: %.2f %n", c3.getArea());
        System.out.printf("c3 -> perimeter: %.2f %n%n", c3.getPerimeter());

        Rectangle r1 = new Rectangle(2.5,5.8,co3,co4);
        System.out.printf("r1 -> %s %n", r1.getDescription());
        System.out.printf("r1 -> color de fondo: %s %n", r1.getBackgroundColor().toHexString());
        System.out.printf("r1 -> color de línea: %s %n", r1.getForegroundColor().toHexString());
        System.out.printf("r1 -> base: %.2f %n", r1.getBase());
        System.out.printf("r1 -> heigth: %.2f %n", r1.getHeight());
        System.out.printf("r1 -> area: %.2f %n", r1.getArea());
        System.out.printf("r1 -> perimeter: %.2f %n%n", r1.getPerimeter());

        Circle ci1 = new Circle(23.1, co1,co3);
        System.out.printf("ci1 -> %s %n", ci1.getDescription());
        System.out.printf("ci1 -> color de fondo: %s %n", ci1.getBackgroundColor().toHexString());
        System.out.printf("ci1 -> color de línea: %s %n", ci1.getForegroundColor().toHexString());
        System.out.printf("ci1 -> radius: %.2f %n", ci1.getRadius());
        System.out.printf("ci1 -> area: %.2f %n", ci1.getArea());
        System.out.printf("ci1 -> perimeter: %.2f %n%n", ci1.getPerimeter());

        Sphere sp1 = new Sphere(5.1, co3,co2);
        System.out.printf("sp1 -> %s %n", sp1.getDescription());
        System.out.printf("sp1 -> color de fondo: %s %n", sp1.getBackgroundColor().toHexString());
        System.out.printf("sp1 -> color de línea: %s %n", sp1.getForegroundColor().toHexString());
        System.out.printf("sp1 -> radius: %.2f %n", sp1.getRadius());
        System.out.printf("ci1 -> area: %.2f %n", sp1.getArea());
        System.out.printf("ci1 -> volume: %.2f %n%n", sp1.getVolume());

        System.out.printf("%s%n",  co1.toString());
        System.out.printf("%s %n",  c1.toString());

        System.out.printf("Estadisticas: %n");
        System.out.printf("------------------------ %n");
        System.out.printf("Colores creados: %d %n", Color.getCounter());
        System.out.printf("Cuadrados creados: %d %n", Square.getCounter());
        System.out.printf("Rectángulos creados: %d %n", Rectangle.getCounter());
        System.out.printf("Circulos creados: %d %n", Circle.getCounter());
        System.out.printf("Esferas creados: %d %n", Sphere.getCounter());
        System.out.printf("Total de figuras: %d %n", Shape.getCounter());
    }
}