public abstract class Producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadStock;

    public Producto(String nombre, String marca, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public abstract void mostrarDetalles();

    public void reducirStock(int cantidad) {
        if (cantidad <= cantidadStock) {
            cantidadStock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public double getPrecio() {
        return precio;
    }
}
