import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados = new ArrayList<>();

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadStock() >= cantidad) {
            producto.reducirStock(cantidad);
            productosComprados.add(producto);
            double costoTotal = ((Vendible) producto).calcularPrecioVenta(cantidad);
            System.out.println("Compra realizada: " + producto.nombre + " x" + cantidad +
                    ", Costo Total: $" + costoTotal);
        } else {
            System.out.println("No hay suficiente stock para la compra de " + producto.nombre);
        }
    }

    public void mostrarCompra() {
        System.out.println("Cliente: " + nombre + " (" + correo + ")");
        System.out.println("Productos comprados:");
        for (Producto producto : productosComprados) {
            producto.mostrarDetalles();
        }
    }
}

