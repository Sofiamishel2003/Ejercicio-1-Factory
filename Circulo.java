//
//
//  @ Project : Ejercicio 1
//  @ File Name : Circulo.java
//  @ Date : 10/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//

/**
 * Clase que representa un círculo. Implementa la interfaz {@link Figura}.
 * Esta clase hereda del comportamiento definido en la interfaz {@link Figura}.
 */
public class Circulo implements Figura{
    /**
     * {@inheritDoc}
     */
    @Override
    public void dibujar()
    {
        System.out.println("Se está dibujando un circulo:       \n      ***\n" +
        "     *   *\n" +
        "    *     *\n" +
        "    *     *\n" +
        "     *   *\n" +
        "      ***");
    }
}
