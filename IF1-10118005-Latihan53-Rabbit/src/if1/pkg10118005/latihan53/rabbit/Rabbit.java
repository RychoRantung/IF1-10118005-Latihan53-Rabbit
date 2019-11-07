/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan53.rabbit;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan data seekor kelinci
 */
public class Rabbit extends Animal {
    private final String color;
    private final String name;

     public Rabbit(String name, boolean veg, String food, int legs, String color){
      super(veg, food, legs);
      this.name = name;
      this.vegetarian = veg;
      this.eats = food;
      this.noOfLegs = legs;
      this.color = color; 
        
    }
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}

    
   
