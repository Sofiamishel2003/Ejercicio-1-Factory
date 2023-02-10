//
//
//  @ Project : Ejercicio 1
//  @ File Name : Triangulo.java
//  @ Date : 10/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//

/**
 * Clase que representa un triángulo. Implementa la interfaz {@link Figura}.
 * Esta clase hereda del comportamiento definido en la interfaz {@link Figura}.
 */
public class Triangulo implements Figura {
    /**
     * {@inheritDoc}
     */
    @Override
    public void dibujar() {
        System.out.println("Dibujar triángulo     \n    *\n" + 
        "   ***\n" + 
        "  *****\n" + 
        " *******\n" + 
        "*********");
    }
}
