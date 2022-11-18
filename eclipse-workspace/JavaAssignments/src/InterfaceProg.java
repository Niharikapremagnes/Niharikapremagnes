

import java.io.*;

interface In1 {

	final int a = 30;

	void display();
}

class InterfaceProg implements In1 {
	

	public void display(){
	System.out.println("Niharika");
	}

	
	public static void main(String[] args)
	{
		InterfaceProg t = new InterfaceProg();
		t.display();
		System.out.println(a);
	}
}

