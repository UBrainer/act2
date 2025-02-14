public class SumaPrimos {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        long suma = 0;
        int contador = 0;
        for (long i = 2; contador < 9000; i++) {
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

        long fin = System.currentTimeMillis();
        System.out.println((fin - inicio) / 1000.0);
    }
}
