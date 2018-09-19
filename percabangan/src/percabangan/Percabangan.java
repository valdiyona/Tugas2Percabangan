/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author valdi
 */
public class Percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int umur = 20;
        String paras = "cantik" ;
        String cerdas = "tidak pintar" ;
     
        if ((umur >=20 && umur <= 23)&& paras =="cantik" && cerdas=="pintar"){
            System.out.println(" PASTI MAU ");
        }else if ((umur >=20 && umur <= 23)&& (cerdas == "tidak pintar" && paras == "cantik")){
            System.out.println("OK LAH");
        }else if ((umur >23) && (cerdas == "tidak pintar" && paras == "cantik")){
            System.out.println("SAYA PIKIR DULU");
        }
        else {
            System.out.println("NO WAY");  
    }
    
}
}
        
