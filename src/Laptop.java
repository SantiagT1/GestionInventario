public class Laptop extends Producto implements Vendible {
    private String procesador;
    private int memoriaRAM;

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, int memoriaRAM) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }


    public void mostrarDetalles() {
        System.out.println("Laptop: " + nombre + ", Marca: " + marca + ", Precio: $" + precio + ", Stock: " + cantidadStock +
                ", Procesador: " + procesador + ", RAM: " + memoriaRAM + "GB");
    }


    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.9;
        }
        return total;
    }
}