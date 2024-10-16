/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Usuario 2024
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Inicio del programa");  // Mensaje de inicio

        // Inicializar función de adaptación
        Discrete_FitnessFunction funcionAdaptacion = new Discrete_FitnessFunction();
        System.out.println("Función de adaptación inicializada");

        // Inicializar enjambre
        Discrete_PSO_Swarm swarm = new Discrete_PSO_Swarm(funcionAdaptacion);
        System.out.println("Enjambre inicializado");

        // Inicializar partículas en el enjambre
        swarm.init(); 
        System.out.println("Enjambre iniciado");

        // Evolucionar enjambre
        for (int i = 0; i < 1; i++) {
            System.out.println("Evolución número: " + (i + 1)); // Cambiar a (i + 1) para contar desde 1
            swarm.evolve(); // Esto llama a evaluate() y luego a update()
        }

        // Mostrar mejor solución
        System.out.println("Mejor posición:");
        for (Allocation asignacion : swarm.getBestPosition()) {
            System.out.println(asignacion);
        }
        
        System.out.println("Fin del programa");
    }
}
