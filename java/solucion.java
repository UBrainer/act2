public class SumaPrimos {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        long suma = 0;
        int contador = 0;
        for (long i = 2; contador < 900000; i++) {
            boolean primo = true;
            for (long j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                suma += i;
                contador++;
            }
        }

        boolean sumaEsPrimo = true;
        for (long i = 2; i * i <= suma; i++) {
            if (suma % i == 0) {
                sumaEsPrimo = false;
                break;
            }
        }

        long fin = System.currentTimeMillis();
        System.out.println("La suma de los primeros 900,000 primos es: " + suma);
        System.out.println("La suma es prima: " + (sumaEsPrimo ? "Si" : "No"));
        System.out.println("Tiempo: " + (fin - inicio) / 1000.0 + " segundos");
    }
}
