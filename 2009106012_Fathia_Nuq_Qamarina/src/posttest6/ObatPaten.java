/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

/**
 *
 * @author LENOVO
 */
public class ObatPaten extends Obat implements Label{ // implementasi interface
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
    
    

    @Override
    public void thn_produksi(int thn_produksi) {
        System.out.println("Tahun Produksi Obat: "+thn_produksi);  
    }

    @Override
    public void thn_kadaluwarsa(int thn_kadaluwarsa) {
        System.out.println("Tahun Kadaluwarsa Obat : "+thn_kadaluwarsa);
    }

    @Override
    public void berat_bersih(int berat_bersih) {
        System.out.println("Berat Bersih Obat : "+berat_bersih+ " mg");
    }
    
    public String getKelayakan(){
        return Kelayakan;
    }
    
    public String kelayakan (){
        System.out.println("Keterangan : "+ getKelayakan());
        return null;
    }
    
    public void detail(int id, String Nama, String Jenis, int Stock) {
        System.out.println("==Detail Obat==");
        System.out.println("ID Obat : "+id); 
        System.out.println("Nama Obat : "+Nama); 
        System.out.println("Jenis Obat : "+Jenis); 
        System.out.println("Stok Obat : "+Stock+" Box");
        
    }
} 

