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
public class Wind {
    int windLevel=(int)(Math.random()*26); ;
    int level;
    String direction;
    public Wind(){
        
    }
    
    public int getWindLevel(){
      return windLevel;             
    }
    public int getWindChange(){
        if(getDirection().equals("S")){
          level=(int)(Math.round(0.5*windLevel));  
        }
        else if(getDirection().equals("N")){
            level = (int)(Math.round(0.65*windLevel*-1));
        }
        return level;
    }
    public String getDirection(){
        int x =(int)(Math.random()*4+1); 
        switch (x) {
            case 1:
                direction = "N";
                break;
            case 2:
                direction = "E";
                break;
            case 3:
                direction = "S";
                break;
            default:
                direction = "W";
                break;
        }
        return direction;
    }
    
    @Override
    public String toString(){
        Measurement w = new Measurement(windLevel,"kph " + getDirection());
        return ("Wind : " + w);
    }
}
