//Verificar si un número es par o impar.
public class Par {
    public static void parImpar(int numero) {
        int residual = numero % 2;
        if (residual == 0) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
    }
}
