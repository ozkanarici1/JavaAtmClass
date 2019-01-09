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
public class Atm {
    private int tcNo;
    private int hesapNo;
    private int bakiye;
   private String adSoyad;
   private int limit;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public Atm(int tcNo,int hesapNo,int bakiye,String adSoyad,int limit ){
        this.tcNo=tcNo;
        this.hesapNo=hesapNo;
        this.bakiye=bakiye;
        this.adSoyad=adSoyad;
        this.limit=limit;
    }

    /**
     * @return the hesapNo
     */
    public int getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraCek(int miktar){
        
        if(miktar>2000){
            System.out.println("Max para çekme limit 2000 Tl");
        }
        else{
            this.bakiye=bakiye-miktar;
            
        }
    }
    public void paraYatir(double yatacakMiktar){
        this.bakiye+=yatacakMiktar;
    }
    
}
