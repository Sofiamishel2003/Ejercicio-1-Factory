//
//
//  @ Project : Ejercicio 1
//  @ File Name : Princiapl.java
//  @ Date : 10/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//

/**
* Clase que representa una fabrica de figuras.
* La clase {@link Principal} utiliza la relación de composición y dependencia con las clases {@link Circulo}, {@link Rectangulo} y 
* {@link Triangulo} al crear objetos de estos tipos.
*/
import java.util.Scanner;
public class Principal {
    /**
     * @param args main para poder probar el programar
     */
    public static void main(String[] args)
    {
        Dibujo dibujo = new Dibujo();
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Scanner keyboard = new Scanner(System.in);
        int menu = 0;
        while(menu != 5)
        {
            System.out.println("¿Qué figura deseas dibujar? \n 1. Rectangulo \n 2. Circulo \n 3. Triangulo \n 4. Recuenta de figuras dibujadas \n 5. Salir");
            menu = keyboard.nextInt();
            if(menu == 1)
            {
                rectangulo.dibujar();
                dibujo.agregarFigura(rectangulo);
                
            }else if(menu == 2)
            {
                circulo.dibujar();
                dibujo.agregarFigura(circulo);
            }else if(menu == 3)
            {
                triangulo.dibujar();
                dibujo.agregarFigura(triangulo);
            }else if(menu == 4)
            {
                dibujo.imprimirFiguras();
            }
        }
    }
}
