
import java.util.Scanner;
public class Compraproducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos del cliente y producto
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        // Ingreso del valor unitario
        System.out.print("Ingrese el valor unitario del producto (mayor a cero): ");
        double valorUnitario = scanner.nextDouble();

        if (valorUnitario <= 0) {
            System.out.println("Error en la entrada de datos");
            return;
        }

        // Ingreso de la cantidad a comprar
        System.out.print("Ingrese la cantidad a comprar (mayor a cero): ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("Error en la entrada de datos");
            return;
        }
        // Cálculo del valor bruto
        double valorBruto = valorUnitario * cantidad;

        // Cálculo del descuento
        double descuento = 0;
        if (cantidad < 10) {
            descuento = 0;
        } else if (cantidad < 20) {
            descuento = valorBruto * 0.05;
        } else {
            descuento = valorBruto * 0.07;
        }

        // Cálculo del valor neto
        double valorNeto = valorBruto - descuento;

        // Mostrar resultados
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Nombre del Producto: " + nombreProducto);
        System.out.println("Valor Unitario: " + valorUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Valor Bruto: " + valorBruto);
        System.out.println("Valor Neto: " + valorNeto);
        System.out.println("Valor Descuento: " + descuento);
    }
}




