/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan54.koordinat;

public class PBO210116058Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        warnaKoodinat WK = new warnaKoodinat(10, 4, "Jingga");
        
        System.out.println("Warna Koordinat : "+WK.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+WK.getX()+" y : "+WK.getY());
    }
    
}