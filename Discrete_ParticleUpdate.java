/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Usuario 2024
 */
import java.util.*;
import java.util.Random;

/**
 * Particle update strategy
 * 
 * Every Swarm.evolve() itereation the following methods are called
 * 		- begin(Swarm) : Once at the begining of each iteration
 * 		- update(Swarm,Particle) : Once for each particle
 * 		- end(Swarm) : Once at the end of each iteration
 * 
 * @author carlosandres.mendez
 */
public class Discrete_ParticleUpdate {

    Discrete_PSO_Swarm swarm;

    //A random weight r1.
    private final double WEIGHT_R1 = 0.2d;
    //The cognitive acceleration coefficient c1.
    private final double COGNIT_COEFFICIENT = 0.5d;
    private final double COGNITIVE_COEFFICIENT = 0.5d; // Corregido aquí

    //A random weight r2.
    private final double WEIGHT_R2 = 0.2d;
    //The social coefficient
    private final double SOCIAL_COEFFICIENT = 0.5d;

    public Discrete_ParticleUpdate() {
        
    }

    
    

    /** Update particle's velocity and position */
     public void update(Discrete_PSO_Swarm swarm, Discrete_Particle particle) {
        this.swarm = swarm;
        
        // Obtén la mejor posición global
        List<Allocation> globalBestPosition = swarm.getBestPosition();
        
        // Generador de números aleatorios
        Random random = new Random();

        // Actualiza la posición y la velocidad de la partícula
        for (int i = 0; i < particle.getDimension(); i++) {
            Allocation currentAllocation = particle.getPosition().get(i);
            Allocation bestAllocation = particle.getBestPosition().get(i);
            
            // Calcular la nueva velocidad
            double r1 = random.nextDouble(); // Número aleatorio entre 0 y 1
            double r2 = random.nextDouble(); // Otro número aleatorio entre 0 y 1

            // Aquí podrías usar una lógica para calcular la nueva "velocidad" en tu contexto
            // Por ejemplo, la velocidad puede ser el costo o la diferencia en alguna métrica
            double newVelocity = (WEIGHT_R1 * currentAllocation.getVm().getCost()) +
                                 (COGNITIVE_COEFFICIENT * r1 * (bestAllocation.getVm().getCost() - currentAllocation.getVm().getCost())) +
                                 (SOCIAL_COEFFICIENT * r2 * (globalBestPosition.get(i).getVm().getCost() - currentAllocation.getVm().getCost()));

            // Actualiza la posición basándote en la nueva velocidad
            // Deberías implementar la lógica de actualización de posición aquí
            // Por ejemplo, tal vez usar la nueva "velocidad" para modificar el índice de la lista
            // o simplemente cambiar la asignación basada en la lógica de tu problema.

            // Asegúrate de manejar los límites de la posición aquí, si es necesario
            // particle.getPosition().set(i, newAllocation);
        }
    }
        
}


