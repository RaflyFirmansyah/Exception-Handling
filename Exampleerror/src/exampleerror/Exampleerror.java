/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleerror;

/**
 *
 * @author GustiRafs
 */
public class Exampleerror {
    public static void main (String[] args){
        int n = 0;
        n = System.in.read();
        System.out.println("Hasil : " + (char) n);
    }

//Terjadi error pada "n = System.in.read();"
//Karena perlu menggunakan statement try ... catch   
}
