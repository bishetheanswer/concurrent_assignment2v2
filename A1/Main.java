package concurrent_assignment2.A1;

import concurrent_assignment2.A_intro.Reader;
import concurrent_assignment2.A_intro.Writer;



public class Main {

	public static void main(String args[]){
		CS_Queue queue;
		
		queue=new CS_Queue();
		
		new Writer(queue);
		new Reader(queue);
	

		
		//cola=new ColaSynchronized();
		//cola=new ColaBusyWait();
		//cola=new ColaConSeņales();
		//queue=new ColaConSeņalesVariosConsumidores();
		//cola=new ColaActivaVariosConsumidores();
		
		//new Consumidor(cola);
		
		
		
	}
}
