/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cd;

/**
 *
 * @author Admin
 */
public class CD {
  
    private int maCD = 999999 ;
    private int sobaiHat;
    private float giathanh;

    public float getGiathanh() {
        return giathanh;
    }

    
    public void setGiathanh(float giathanh) {
        this.giathanh = giathanh;
    }

    public int getSobaiHat() {
        return sobaiHat;
    }

    /**
     * Set the value of sobaiHat
     *
     * @param sobaiHat new value of sobaiHat
     */
    public void setSobaiHat(int sobaiHat) {
        this.sobaiHat = sobaiHat;
    }

    private String tuaCD = "chua xac dinh";

    /**
     * Get the value of tuaCD
     *
     * @return the value of tuaCD
     */
    public String getTuaCD() {
        return tuaCD = "chua xac dinh";
    }

    /**
     * Set the value of tuaCD
     *
     * @param tuaCD new value of tuaCD
     */
    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }


    /**
     * Get the value of maCD
     *
     * @return the value of maCD
     */
    public int getMaCD() {
        return maCD;
    }

    /**
     * Set the value of maCD
     *
     * @param maCD new value of maCD
     */
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    
    }

    public CD() {
    
    }
      public CD(int maCD, int sobaiHat, float giathanh, String tuaCD) {
        this.maCD = maCD;
        this.sobaiHat = sobaiHat;
        this.giathanh = giathanh;
        this.tuaCD = tuaCD;
    if(maCD<0 && maCD==999999){
        System.out.println("ma CD phai lon hon 0");}
        else{
              System.out.println("ma CD la" + maCD);  
                }
    if(tuaCD==null){
        System.out.println("tua CD phai xac dinh");}
        else{
                System.out.println("tua CD la" + tuaCD);
                }
    if(sobaiHat<=0){
        System.out.println("so bai hat phai lon hon 0");
    }
    else{
        System.out.println("so bai hat trong CD la"+ sobaiHat);
    }
    if(giathanh<=0){
        System.out.println("gia CD phai lon hon 0");
    }
    else{
        System.out.println("gia CD la" + giathanh);
    }
    
    }

    @Override
    public String toString() {
        return   "----------------\"CD\"------------------"
                +"/n" + "maCD=" + maCD 
                + "/n"   +" sobaiHat=" +"  " + sobaiHat 
                + "/n"   + "giathanh=" +"  " + giathanh 
                + "/n"   + "tuaCD=" +"     " + tuaCD     ;
    }
    
    }
    
    
    
  

