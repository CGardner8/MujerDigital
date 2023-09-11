//Verificar si un número es positivo, negativo o cero.
public class Positivo {
    public static void evaluarSigno(int numero){
        if (numero > 0){
            System.out.println("El número " + numero + " es positivo.");
        }
        else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        }
        else {
            System.out.println("El número es cero.");
        }
    }
}
