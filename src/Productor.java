public class Productor extends Thread {
    private Almacen almacen;

    public Productor(Almacen almacen) {
        this.almacen = almacen;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            char producto = generarProducto();
            System.out.println("Productor produce: " + producto);
            almacen.producir(producto);
        }
    }

    private char generarProducto() {
        // Genera un producto (puede ser aleatorio, en este caso es simplificado)
        return (char) ('A' + (int) (Math.random() * 26));
    }
}
