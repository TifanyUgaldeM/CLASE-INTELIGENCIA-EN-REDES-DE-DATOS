/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Usuario 2024
 */
public class Container {
    /**
     * The id.
     */
    private int id;

    /**
     * The storage.
     */
    private long storage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStorage() {
        return storage;
    }

    public void setStorage(long storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Container{" + "id=" + id + '}';
    }
    
    
}
