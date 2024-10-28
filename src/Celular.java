public class Celular extends Producto implements Vendible {
    private int capacidadBateria;
    private double camaraResolucion;

    public Celular(String nombre, String marca, double precio, int cantidadStock, int capacidadBateria, double camaraResolucion) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }


    public void mostrarDetalles() {
        System.out.println("Celular: " + nombre + ", Marca: " + marca + ", Precio: $" + precio + ", Stock: " + cantidadStock +
                ", Batería: " + capacidadBateria + "mAh, Cámara: " + camaraResolucion + "MP");
    }


    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.9;
        }
        return total;
    }
}

