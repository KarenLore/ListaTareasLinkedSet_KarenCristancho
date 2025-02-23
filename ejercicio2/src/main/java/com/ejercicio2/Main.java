// Taller de Programación en Java: Uso de Set
// 🚀Ejercicio 2: Lista de Tareas con LinkedHashSet
package com.ejercicio2;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try(Scanner scanner = new Scanner(System.in)){
            Set<String> tareas = new LinkedHashSet<>();

            // 1. Pedir al usuario que ingrese una lista de tareas.
            System.out.print("Ingrese la cantidad de tareas a ingresar: ");
            int cantidad = scanner.nextInt();
                scanner.nextLine();

            // 2. Almacenar las tareas en un LinkedHashSet<String> .
            for(int i = 0; i < cantidad; i++ ){
                System.out.print("Ingrese la tarea " + (i+1) + ": ");
                tareas.add(scanner.nextLine());
            }
            // 3. Mostrar la lista de tareas en el orden ingresado.
            System.out.println("\nLista de tareas: ");
            for(String tarea : tareas ){
                System.out.println("-" + tarea);
            }
            // 4. Permitir que el usuario elimine una tarea de la lista.
            System.out.print("\nIngrese la tarea que desea eliminar: ");
            String eliminar = scanner.nextLine();
            if(tareas.remove(eliminar)){
                System.out.println("Tarea eliminada correctamente.");
            }else{
                System.out.println("La tarea no existe en la lista.");
            }
            // Acá mostrara la lista actualizada.
            System.out.println("\nLista de tareas actualizada: ");
            for(String tarea : tareas ){
                System.out.println("-" + tarea);
            }
        }
    }
}