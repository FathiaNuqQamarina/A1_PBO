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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Obat> Obt = new ArrayList<Obat>();
        Obat masuk = new Obat();
        Scanner input=new Scanner(System.in);
        Scanner inputT=new Scanner(System.in);
        Scanner inputTi=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        int ph;
        System.out.println("====      >> Selamat Datang <<       ====");
        System.out.println("==== Program Manajeman Gudang Apotek ====");
        do{
            System.out.println("Pilihan Menu Gudang Obat :");
            System.out.println("==========================");
            System.out.println("1. Masukkan Data Obat");
            System.out.println("2. Lihat Data Obat");
            System.out.println("3. Hapus Data Obat");
            System.out.println("4. Edit Data Obat");
            System.out.println("5. Pendistribusian Obat");
            System.out.println("6. Pendistribusian Obat Generik ");
            System.out.println("7. Pendistribusian Obat Paten");
            System.out.println("8. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            ph = input.nextInt();
            
            switch(ph){
                case 1:
                    System.out.print("Masukkan Id Obat : ");
                    masuk.setid(input.nextInt());
                    System.out.print("Masukkan Nama Obat : ");
                    masuk.setNama(input1.nextLine());
                    System.out.print("Masukkan Jenis Obat : ");
                    masuk.setJenis(input1.nextLine());
                    System.out.print("Masukkan Stock Obat : ");
                    masuk.setStock(input.nextInt());
                    
                    int id = masuk.getid();
                    String Nama = masuk.getNama();
                    String Jenis = masuk.getJenis();
                    int Stock = masuk.getStock();
                     
                    Obt.add(new Obat(id,Nama,Jenis,Stock));
                    System.out.println("Data Berhasil Disimpan..."); 
                    System.out.println(" ");
                break;
                case 2:
                    System.out.println("=============================================");
                    System.out.println("ID     |Nama           |Jenis          |Stock");
                    Iterator<Obat> i = Obt.iterator();
                    while(i.hasNext()){
                        Obat o = i.next();
                        System.out.println(o);   
                    }
                    System.out.println("=============================================");
                    System.out.println(" ");
                break;
                case 3:
                    boolean found = false;
                    System.out.print("Masukkan Id Obat yang ingin dihapus : ");
                    id = input.nextInt();
                    System.out.println("========================");
                    i = Obt.iterator();
                    while(i.hasNext()){
                        Obat o = i.next();
                        if(o.getid() == id){
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Data Tidak Ditemukan");
                    }else{
                        System.out.println("Data Berhasil Dihapus..."); 
                    }
                    System.out.println("========================");
                    System.out.println(" ");
                break;   
                case 4:
                    found = false;
                    System.out.print("Masukkan Id Obat yang ingin diedit : ");
                    id = input.nextInt();
                    System.out.println("========================");
                    ListIterator<Obat>li= Obt.listIterator();
                    while(li.hasNext()){
                        Obat o = li.next();
                        if(o.getid() == id){
                            System.out.print("Masukkan Nama Obat Baru :");
                            Nama = input1.nextLine();
                            
                            System.out.print("Masukkan Jenis Obat Baru :");
                            Jenis = input1.nextLine();
                            
                            System.out.print("Masukkan Stock Obat Baru :");
                            Stock = input.nextInt();
                            li.set(new Obat (id, Nama, Jenis, Stock));
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Data Tidak Ditemukan");
                    }else{
                        System.out.println("Data Berhasil Diupdate..."); 
                    }
                    System.out.println("========================");
                    System.out.println(" ");
                break;
                case 5:
                    System.out.println("========================");
                    System.out.print("Masukkan Id Obat : ");
                    int idOB =inputTi.nextInt();
                    System.out.print("Masukkan Nama Obat : ");
                    String NamaOB = inputT.nextLine();
                    System.out.print("Masukkan Jenis Obat : ");
                    String JenisOB = inputT.nextLine();
                    System.out.print("Masukkan Stock Obat : ");
                    int StockOB =inputTi.nextInt();
                    System.out.print("Masukkan Lokasi Pendistribusian : ");
                    String LokasiOB = inputT.nextLine();
                    System.out.println("");
                    
                    Obat OB = new Obat(idOB,NamaOB,JenisOB,StockOB);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                    OB.distribusi();
                    OB.distribusi(LokasiOB);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("");
                break;
                case 6:
                    System.out.println("========================");
                    System.out.print("Masukkan Id Obat Generik : ");
                    int idOG =inputTi.nextInt();
                    System.out.print("Masukkan Nama Obat Generik : ");
                    String NamaOG = inputT.nextLine();
                    System.out.print("Masukkan Jenis Obat Generik : ");
                    String JenisOG = inputT.nextLine();
                    System.out.print("Masukkan Stock Obat Generik : ");
                    int StockOG =inputTi.nextInt();
                    System.out.print("Masukkan Tahun Produksi Obat Generik : ");
                    int thnPOG =inputTi.nextInt();
                    System.out.print("Masukkan Tahun Kadaluwarsa Obat Generik : ");
                    int thnKkOG =inputTi.nextInt();
                    System.out.print("Masukkan Berat Bersih Obat Generik : ");
                    int bbOG =inputTi.nextInt();
                    System.out.print("Masukkan Lokasi Pendistribusian : ");
                    String LokasiOG = inputT.nextLine();
                    System.out.println("");
                    
                    ObatGenerik OG = new ObatGenerik(idOG,NamaOG,JenisOG,StockOG);
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
                    OG.detail(idOG, NamaOG, JenisOG, StockOG);
                    OG.thn_produksi(thnPOG);
                    OG.thn_kadaluwarsa(thnKkOG);
                    OG.berat_bersih(bbOG);
                    System.out.println("");
                    OG.kelayakan();
                    System.out.println("");
                    OG.distribusi();
                    System.out.println("");
                    OG.distribusi(LokasiOG);
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("");
                break;
                case 7:
                    System.out.println("========================");
                    System.out.print("Masukkan Id Obat Paten : ");
                    int idOP =inputTi.nextInt();
                    System.out.print("Masukkan Nama Obat Paten : ");
                    String NamaOP = inputT.nextLine();
                    System.out.print("Masukkan Jenis Obat Paten : ");
                    String JenisOP = inputT.nextLine();
                    System.out.print("Masukkan Stock Obat Paten : ");
                    int StockOP =inputTi.nextInt();
                    System.out.print("Masukkan Tahun Produksi Obat Paten : ");
                    int thnPOP =inputTi.nextInt();
                    System.out.print("Masukkan Tahun Kadaluwarsa Obat Paten : ");
                    int thnKOP =inputTi.nextInt();
                    System.out.print("Masukkan Berat Bersih Obat Paten : ");
                    int bbOP =inputTi.nextInt();
                    System.out.print("Masukkan Lokasi Pendistribusian : ");
                    String LokasiOP = inputT.nextLine();
                    System.out.println("");
                    
                    ObatPaten OP = new ObatPaten(idOP,NamaOP,JenisOP,StockOP);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                    OP.detail(idOP, NamaOP, JenisOP, StockOP);
                    OP.thn_produksi(thnPOP);
                    OP.thn_kadaluwarsa(thnKOP);
                    System.out.println("");
                    OP.kelayakan();
                    System.out.println("");
                    OP.distribusi();
                    System.out.println("");
                    OP.distribusi(LokasiOP);
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("");
                break;
                case 8: 
                    System.out.println("Anda Keluar dari Program...");
                    System.exit(0);
                break;
            }
        }while(ph!=0);
    }
    
}
