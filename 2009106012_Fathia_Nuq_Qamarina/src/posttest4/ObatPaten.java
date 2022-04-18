/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest4;

/**
 *
 * @author LENOVO
 */
public class ObatPaten extends Obat{
    public ObatPaten(int id, String Nama, String Jenis, int Stock) {
        super(id, Nama, Jenis, Stock);
    }
    
    @Override
        public void distribusi(){
        System.out.println("Obat Jenis Paten,Sudah Terdistribusi"); //OVERLOADING
    }
    @Override
    public void distribusi(String lokasi){
        System.out.println("Status : Obat Paten Terdistribusi Ke "+lokasi); //OVERLOADNIG
    }
    
} 


