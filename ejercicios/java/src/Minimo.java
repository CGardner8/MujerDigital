public class Minimo {
    static int numero[] = {54, 90, 32};
    public static int minimo () {
        int menor = numero[0];
        for (int x = 1; x < numero.length; x++) {
            int minimo = numero[x];
            if (minimo < menor) {
                menor = minimo;
            }
        }
        return menor;
    }
}
