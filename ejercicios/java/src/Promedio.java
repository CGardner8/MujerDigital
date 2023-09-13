// Calcular el promedio de un arreglo de números.
public class Promedio {
    static int[] valor = {100, 80, 90, 95, 75, 50};
    public static float promedio() {
        int suma = 0;
        for (int i = 0; i < valor.length; i++){
            suma = suma + valor[i];
        }
        float promedio = suma / valor.length;
        return promedio;
    }
}
