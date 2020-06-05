/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author GustiRafs
 */
public class Latihan2 {
    
    
    
    public static void main (String[] args){
        byte [] b = new byte[5];
        
        try{
            System.out.print("Masukan Kata : ");
            System.in.read(b);
            System.out.println("Hasil:"+(char) b[0]+(char) b[1]+(char) b[2]);
            
        }catch(java.io.IOException e){
        }
    }
}
    
    //Maka codingannya akan seperti berikut
    //Hasil yang di dapat akan seperti ini
    //Misal User memasukan kata "Ngulik"
    //Maka hasil nya akan menjadi "Ngu"
    
    //Mengapa demikian
    //Karena kita hanya menginginkan 3 kata dari depan
    //jadi dari hasil input "Ngulik" akan menjadi "Ngu"