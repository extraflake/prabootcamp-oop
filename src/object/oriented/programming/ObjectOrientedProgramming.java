/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.oriented.programming;

import java.util.Scanner;

/**
 *
 * @author NaufalAj
 */
public class ObjectOrientedProgramming {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("----------- 2D Shape ----------");
        System.out.println("-------------------------------");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("-------------------------------");
        System.out.print("Your Choice : ");
        choice = in.nextInt();
        switch(choice) {
            case 1: 
                System.out.print("Input Nilai Jari - Jari : ");
                double jari = in.nextInt();
                Circle circle = new Circle();
                circle.setJari(jari);
                circle.Proceed();
                circle.Print("Lingkaran");
                break;
            case 2: 
                System.out.print("Input Nilai Panjang : ");
                double height = in.nextInt();
                System.out.println("Input Nilai Lebar : ");
                double width = in.nextInt();
                Square square = new Square();
                square.setWidth(width);
                square.setHeight(height);
                square.Proceed();
                square.Print("Persegi Panjang");
                break;
            default: 
                System.out.println("Bad Choice");
                break;
        }
    }
}

abstract class Bangun2D {
    public abstract double Proceed();
    public void Print(String param) {
        System.out.println("Luas " + param + " \t = " + Proceed());
    }
}    
    
class Circle extends Bangun2D {
    private double jari;
        
    @Override
    public double Proceed() {
        return (3.14 * getJari() * getJari());
    }
    
    /**
     * @return the jari
     */
    public double getJari() {
        return jari;
    }

    /**
     * @param jari the jari to set
     */
    public void setJari(double jari) {
        this.jari = jari;
    }
}

class Square extends Bangun2D {
    private double height;
    private double width;
    
    
    @Override
    public double Proceed() {
        return (height * width);
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
}
