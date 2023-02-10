//
//
//  @ Project : Ejercicio 1
//  @ File Name : Figura.java
//  @ Date : 10/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
/**
 * Interfaz que define el comportamiento de las figuras a dibujar.
 * Esta interfaz es utilizada por las clases {@link Circulo}, {@link Rectangulo} y {@link Triangulo} como una forma de 
 * establecer una relación de herencia.
 */
interface Figura {
    /**
     * Método que dibuja la figura.
     */
    void dibujar();
}
