import java.util.ArrayList;

public class Usuario {
    String nombre;
    ArrayList<Producto> carrito; 


    public Usuario(String nombre) {
        this.nombre = nombre;
        this.carrito = new ArrayList<Producto>();
    }

    //metodo del Usuario
    public void agregarProductoAlCarrito(Producto producto) {
        this.carrito.add(producto);
        System.out.println(producto.nombre + " ha sido agregado al carrito de " + this.nombre);
    }

   
    public double calcularTotal() {
        //acumuladora
        double total = 0.0;
        for (Producto producto : this.carrito) {
            //accedemos al atributo precio mediante el 
            //operador punto(.)
            total = total + producto.precio;
        }
        return total;
    }
}