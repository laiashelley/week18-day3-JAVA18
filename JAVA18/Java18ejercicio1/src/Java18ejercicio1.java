// 1- (facil) Métodos: Cálculo IVA:
// Diferentes tipos de IVA:
// - General = 21% (ej. Ropa);
// - Reducido = 10% (bono-metro);
// - Super-reducido = 4% (huevos);
// - Exento = 0% (dentista)
// - Para el cálculo, hacer cuatro CONSTANTES para cada tipo de IVA.
// - Pides el precio de producto, el tipo de IVA, y pasas estos dos parámetros a la función
// calcularPrecioFinal(), y ésta te DEVUELVE el precio final (int o float), y se imprime en el main().

// - Ejemplo: para el 21%, el precio final sería precioProducto + (precioProducto*0.21);
// Ejemplo de constante para IVA21 = 0.21;

import java.util.Scanner;

public class Java18ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        final double general = 0.21;
        final double reducido = 0.10;
        final double superReducido = 0.04;
        final double extento = 0.0;

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el precio del producto:");
        double precioProducto = sc.nextDouble();

        System.out.println("Introduce el tipo de IVA que tiene (general, reducido, super-reducido, extento):");
        String tipoIva = sc.next().toLowerCase();

        double iva = 0.0;
        switch (tipoIva) {
            case "general":
                iva = general;
                break;
            case "reducido":
                iva = reducido;
                break;
            case "super-reducido":
                iva = superReducido;
                break;
            case "exento":
                iva = extento;
                break;
            default:
                System.out.println("Tipo de IVA no válido.");
        }

        double precioFinal = precioProducto + (precioProducto * iva);

        System.out.println("El precio final del producto es: " + precioFinal);

        sc.close();

    }

}
