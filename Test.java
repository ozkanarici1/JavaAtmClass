/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author özkan
 */
public class Test {
    public static void main(String[] args) {
        
        Atm atm2=new Atm(123123123, 123123123, 5000, "Özkan arıcı", 500);
        atm2.paraCek(250);
        System.out.println(atm2.getBakiye());
        
    }
    
}
