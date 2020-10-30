package scenariopgms;

public class Caculatebill
{
    double billpay;
    
    void Bill(long units)
    {
    	if(units<100)
    		billpay=units*1.20;
    	  else if(units<=300)
    		billpay=100*1.20+(units-100)*2;
    	  else if(units>300)
    		billpay=100*1.20+200 *2+(units-300)*3;
    	     
             }	 
    
	
}
