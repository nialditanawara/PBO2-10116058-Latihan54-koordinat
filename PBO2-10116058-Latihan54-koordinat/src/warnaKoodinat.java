/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan54.koordinat;

public class warnaKoodinat extends Koordinat{
    public String namaWarna;

    public warnaKoodinat(int x, int y, String namaWarna) {
        
        super(x, y);
        this.namaWarna = namaWarna;
        this.x = x;
        this.y = y;
        
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
   
    
}