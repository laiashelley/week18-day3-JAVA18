// 2- (medio) Ejercicio validación setter, y ArrayLists:
// Tienes el objeto ClienteDiscoteca. OK
// Tienes un arraylist de clientes discoteca ya creados.
// Antes de añadir un cliente más en el arraylist, debes verificar si el cliente tiene 18 años o más. Si es
// mayor de edad, se añade el cliente, si no, se le da un mensaje de que no puede entrar.
// Si es mayor de edad, imprimir nombre, edad y bienvenid@ a nuestra discoteca.

// +EXTRA: hacer esto en un bucle while (para salir escribe 'salir'), y guardar dos arraylist, uno con los clientes aceptados y otro con los rechazados. Mostrar ambos al final.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Java18ejercicio2 {
    public static void main(String[] args) throws Exception {

        ClienteDiscoteca cliente1 = new ClienteDiscoteca("Eric", 30);
        ClienteDiscoteca cliente2 = new ClienteDiscoteca("Laia", 29);
        ClienteDiscoteca cliente3 = new ClienteDiscoteca("Pol", 29);
        ClienteDiscoteca cliente4 = new ClienteDiscoteca("Su", 24);
        ClienteDiscoteca cliente5 = new ClienteDiscoteca("Martí", 23);
        
        Scanner sc = new Scanner(System.in);

        ArrayList <ClienteDiscoteca> clientesAceptados = new ArrayList<>();
        ArrayList <ClienteDiscoteca> clientesRechazados = new ArrayList<>();
        ArrayList <ClienteDiscoteca> clientesYaAceptados = new ArrayList<>(Arrays.asList(cliente1, cliente2, cliente3, cliente4, cliente5));

        String continuar;

        do{
            
            System.out.println("Introduce tu nombre:");
            String nombreUsuario = sc.nextLine();

            System.out.println("Introduce tu edad:");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, introduce una edad válida.");
                sc.next();
            }
            int edadUsuario = sc.nextInt();

            sc.nextLine(); 

            if (edadUsuario >= 18) {
                clientesAceptados.add(new ClienteDiscoteca(nombreUsuario, edadUsuario));
            } else {
                clientesRechazados.add(new ClienteDiscoteca(nombreUsuario, edadUsuario));
            }

            System.out.println("Quieres continuar? si/no");
            continuar = sc.nextLine();


        } while (!continuar.equalsIgnoreCase("no"));

        System.out.println("\nClientes aceptados:");
        for (ClienteDiscoteca cliente : clientesAceptados) {
            System.out.println(cliente);
        }

        System.out.println("\nClientes rechazados:");
        for (ClienteDiscoteca cliente : clientesRechazados) {
            System.out.println(cliente);
        }

        System.out.println("\nClientes aceptados antes:");
        for (ClienteDiscoteca cliente : clientesYaAceptados) {
            System.out.println(cliente);
        }



        sc.close();

    }
}
