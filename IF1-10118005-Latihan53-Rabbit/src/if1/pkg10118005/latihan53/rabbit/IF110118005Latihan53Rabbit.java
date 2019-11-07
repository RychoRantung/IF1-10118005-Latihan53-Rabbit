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
public class IF110118005Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rab = new Rabbit("Peter",false,"Grass",5,"Grey");
        System.out.println("Hello, His name is " +rab.getName());
        System.out.println(rab.getName() +  " is vegetarian? " +rab.vegetarian);
        System.out.println(rab.getName() + " eats " +rab.geEats());
        System.out.println(rab.getName() + " has " +rab.getNoOfLegs() + " legs");
        System.out.println(rab.getName()+ " color is "+rab.getColor());
    }
    
}
