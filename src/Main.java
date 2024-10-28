public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("AZUS ", "AZUS", 800.00, 10, "Intel i5", 8);
        Laptop laptop2 = new Laptop("MacBock ", "Iphone", 1200.00, 15, "intel i7", 6);
        Celular celular1 = new Celular("Iphone 15", "Iphone", 900.00, 13, 3000, 64.0);
        Celular celular2 = new Celular("Galaxy S21", "Samsung", 750.00, 20, 5000, 160.0);


        Cliente cliente1 = new Cliente("Santiago Tenorio", "Santiago.pinzon-t@uniminuto.edu.co");
        Cliente cliente2 = new Cliente("Ana Garcia", "ana.g@gmail.com");
        Cliente cliente3 = new Cliente("Juan Perez", "juan.perez@gmail.com");
        Cliente cliente4 = new Cliente("Samantha Rodriguez", "Samantha.R@gmail.com");


        cliente1.comprarProducto(laptop2, 6);
        cliente1.comprarProducto(celular1, 4);

        cliente2.comprarProducto(laptop1, 2);
        cliente2.comprarProducto(celular2, 3);

        cliente3.comprarProducto(laptop1, 2);
        cliente3.comprarProducto(celular1, 1);

        cliente4.comprarProducto(laptop2, 5);
        cliente4.comprarProducto(celular1, 5);


        System.out.println("\nResumen de compras:");
        cliente1.mostrarCompra();
        cliente2.mostrarCompra();


        System.out.println("\nInventario actualizado:");
        laptop1.mostrarDetalles();
        celular1.mostrarDetalles();
    }
}
