//
//
//  @ Project : Ejercicio 1
//  @ File Name : Dibujo.java
//  @ Date : 10/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//

/**
 * Clase que representa un dibujo. Agrega objetos de tipo {@link Figura}.
 * La clase {@link Dibujo} utiliza la relación de agregación con los objetos de tipo {@link Figura} al almacenarlos en una 
 * lista.
 */

import java.util.ArrayList;
public class Dibujo {
    /**
    * Lista de figuras a dibujar.
    */
    private ArrayList<Figura> figuras = new ArrayList<>();
    public ArrayList<Figura> getFiguras() {
        return this.figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }
    /**
    * Método que agrega una figura a la lista de figuras a dibujar.
    * @param figura Figura a agregar.
    */
    public void agregarFigura(Figura figura)
    {
        figuras.add(figura);
    }
    public void imprimirFiguras()
    {
        for(Figura figura : figuras)
        {
            System.out.println("- " + figura);
        }
    }
}
