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
public class Clouds {
    int cloudLevel;
    String level;
    public Clouds(){
        
    }
    
    public int getCloudLevel(){
        cloudLevel=(int)(Math.random()*4+1); 
      return cloudLevel;
               
    }
    
    @Override
    public String toString(){
        Measurement w = new Measurement(cloudLevel,"");
        if(cloudLevel==1){
            level = "heavy";
        }
        else if(cloudLevel==2){
            level = "medium";
        }
        else if(cloudLevel==3){
            level = "light";
        }
        else{
            level="none";
        }
        return ("Clouds : " + level);
    }
}
