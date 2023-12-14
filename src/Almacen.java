public class Almacen {
    private char[] buffer = new char[6];
    private int contador = 0;

    public synchronized void producir(char producto) {
        try {
            // Espera si el búfer está lleno
            while (contador == buffer.length) {
                wait();
            }

            // Agrega el producto al búfer
            buffer[contador] = producto;
            contador++;

            // Notifica al consumidor que hay datos disponibles
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized char consumir() {
        char producto = 0;
        try {
            // Espera si el búfer está vacío
            while (contador == 0) {
                wait();
            }

            // Consume el producto del búfer
            contador--;
            producto = buffer[contador];

            // Notifica al productor que hay espacio disponible
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return producto;
    }
}