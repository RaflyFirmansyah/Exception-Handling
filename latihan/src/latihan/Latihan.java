/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author GustiRafs
 */
public class Latihan {
    
    public static void main(String[] args){
        try {
            System.out.println("Masukan Kata  :");
            char n = (char) System.in.read();
            System.out.println("Hasil : " + n );
        } catch(Exception e) {
            
        }
    }    

    //Jika sudah di pindahlan ke statement try...catch 
    //Hasil codingannya akan seperti berikut : 
    //Jika user memasukan kata atau angka maka
    //hasilnya akan meng-output angka atau kata yang berada di depan

    //Cara Kerja : 
    //Misal user meng input kata "Suhartono"
    //Hasilnya akan meng-output "S" saja


}
