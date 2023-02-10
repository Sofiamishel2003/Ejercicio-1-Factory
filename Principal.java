
import java.util.Scanner;
//se importan las librerías
//main donde se correrá todo el programa
public class Principal {
    public static void main(String[] args)
    {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Scanner keyboard = new Scanner(System.in);
        int menu = 0;
        while(menu != 4)
        {
            System.out.println("¿Qué figura deseas dibujar? \n 1. Rectangulo \n 2. Circulo \n 3. Triangulo \n 4. Salir");
            menu = keyboard.nextInt();
            if(menu == 1)
            {
                rectangulo.dibujar();
            }else if(menu == 2)
            {
                circulo.dibujar();
            }else if(menu == 3)
            {
                triangulo.dibujar();
            }
        }
    }
}
