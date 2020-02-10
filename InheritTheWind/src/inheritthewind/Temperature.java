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
public class Temperature {
    public int mtemp = (int)(Math.random()*114+(-14));
    public int mdtemp ;
    public int cloudSub;
    int nextmorn,windchange,precipitationchange;
    int cl;
    Clouds cloud = new Clouds();
    Wind wind = new Wind();
   Precipitation precip = new Precipitation();
    
    
    public Temperature(){
        
    }
    
    public int CL(){
        cl=cloud.getCloudLevel();
        
        switch (cl) {
            case 1:
                cloudSub=-14;
                break;
            case 2:
                cloudSub=-3;
                break;
            case 3:
                cloudSub=3;
                break;
            default:
                cloudSub=6;
                break;
        }
        return cloudSub;
        
    }
    
    public int getMorningTemp(){  
        return mtemp;
    }
    public int getMiddayTemp(){
        mdtemp=getMorningTemp()+CL();
        return mdtemp;
    }
    public void getNextMorn(){
        windchange=wind.getWindChange();
        precipitationchange=precip.getPChange();
        nextmorn=mdtemp+windchange+precipitationchange;
        mtemp=nextmorn;
    }
    
    
    @Override
    public String toString(){
        //loop 10 times
        Measurement morning = new Measurement(mtemp,"C");
        Measurement midday = new Measurement(getMiddayTemp(),"C");
        

        return ("Morning Temperature : " + morning + "\n" + cloud.toString() + "\nMidday Temperature: " + midday + "\n"  + precip.toString() + "\n" + wind.toString());
        }
    
}
