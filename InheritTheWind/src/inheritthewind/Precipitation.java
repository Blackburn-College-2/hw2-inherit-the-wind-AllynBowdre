/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritthewind;

/**
 *
 * @author allyn
 */
public class Precipitation {
    int pAmount=(int)(Math.random()*25); ;
    int level;
    String sor;
    public Precipitation(){
        
    }
    
    public int getPAmount(){
      return pAmount;             
    }
    public int getPChange(){
        if(getSnowOrRain().equals("snow")){
            level = (int)(Math.round(pAmount*0.9));
        }
        else{
            level = (int)(Math.round(pAmount*0.15));
        }
        
        return level;
    }
    public String getSnowOrRain(){
        int x =(int)(Math.random()*3+1); 
        if(x==1){
            sor= "rain";
        }
        else{
            sor = "snow";
        }
        return sor;
    }
    
    @Override
    public String toString(){
        Measurement p = new Measurement(pAmount,"cm in "+getSnowOrRain());
        return ("Precipitation : " + p);
    }
}
