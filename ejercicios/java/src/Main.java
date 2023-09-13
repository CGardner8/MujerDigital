
public class Main {
    public static void main(String[] args) {
        double area = Area.area(5);
        System.out.println(area);

        Positivo.evaluarSigno (-10);
        Positivo.evaluarSigno (0);
        Positivo.evaluarSigno (256);

        Par.parImpar (8);
        Par.parImpar (11);

        System.out.println ("El promedio es: " + Promedio.promedio());
    }
}