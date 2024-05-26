// 3- (difícil) Trabajo con cadenas de caracteres:
// Dada una frase entrada por usuario, poner en mayúscula sólo la primera letra de cada palabra.

// Una solución a este último en:  https://prepinsta.com/java/program-to-capitalize-the-first-character-of-each-word-in-a-string

import java.util.Scanner;

public class Java18ejercicio3 {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Entra una frase: ");
        
        String frase = sc.nextLine();
        
        String primeraLetra = frase.substring(0, 1);
        
        primeraLetra = primeraLetra.toUpperCase();
        String restodelaFrase = frase.substring(1);
        
        String fraseMayus = primeraLetra + restodelaFrase;
        System.out.println("Frase con mayuscula: " + fraseMayus);

        sc.close();
    }
}
