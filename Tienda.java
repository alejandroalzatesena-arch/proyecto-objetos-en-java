public class Tienda {

    public static void main(String[] args) {
        //creamos productos para la tienda
        //manzana es del tipo Producto o es una instancia de
        //Producto
        Producto manzana = new Producto("Manzana", 0.50);
        Producto leche = new Producto("Leche", 1.20);
        Producto pan = new Producto("Pan", 1.50);
        Producto papa = new Producto("Papa", 2);
        //productos adicionales
        Producto vino = new Producto("Vino", 20000);
        Producto pescado = new Producto("Pecado", 25000);

        System.out.println("Â¡Bienvenido a la tienda! Productos disponibles:");
        System.out.println("- " + manzana.nombre + ": $" + manzana.precio);
        System.out.println("- " + leche.nombre + ": $" + leche.precio);
        System.out.println("- " + pan.nombre + ": $" + pan.precio);
        System.out.println("- " + vino.nombre + ": $" + vino.precio);
        System.out.println("- " + pescado.nombre + ": $" + pescado.precio);
        
        
        
        System.out.println("-------------------------------------------");

        Usuario ana = new Usuario("Ana");
        System.out.println("El usuario " + ana.nombre + " ha entrado a la tienda.");
        
        //agregamos productos al carrito de ana
        ana.agregarProductoAlCarrito(manzana);
        ana.agregarProductoAlCarrito(leche);
        ana.agregarProductoAlCarrito(pan);
        ana.agregarProductoAlCarrito(papa);
      ana.agregarProductoAlCarrito(vino);
       ana.agregarProductoAlCarrito(pescado);

        System.out.println("-------------------------------------------");

        double totalCompra = ana.calcularTotal();
        System.out.println("Calculando el total de la compra para " + ana.nombre + "...");
        System.out.println("El total de la compra es: $" + totalCompra);

    }

}