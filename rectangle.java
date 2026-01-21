/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baingay21;

/**
 *
 * @author nguen
 */
public class rectangle {
    private int length;
    private int width;
    
    public rectangle () {
        this.length=0;
        this.width=0;
    }
    public rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public int getArea() {
        return length * width;
    }
     
}

