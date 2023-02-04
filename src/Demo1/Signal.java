package Demo1;

public class Signal {

	public static void main(String[] args) {
		
		Signal st= new Signal();
		st.signalEx();
	}
	
	public void signalEx()
	{
       String color="Red";
       
    if(color=="Red")
    {
	   System.out.println("Stop");
	   
   }
    else if(color=="Yellow") 
    {
	   System.out.println("Go");
	   
   }
    else if(color=="Green") 
    {
	   System.out.println("Slow");
	   
   }
    else 
    {
	   System.out.println("Wrong choice");
   }
   }
}

