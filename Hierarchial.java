package com.apex.util;

public class Hierarchial 
{
    public static void main( String[] args )
    {
        Audi A = new Audi();
        A.audiBrand();
        
        Lexus L = new Lexus();
        L.lexusBrand();
        
        Nissan(); 
        
        Masda M = new Masda();
        M.masdaBrand();
        
        
    }
    private static void Nissan() 
    {
		System.out.println( "\nPrivate Modifiers" );
		System.out.println( "Car brand is Nissan" );
	}
}

class Car 										//Parent Class
{
	public void carBrand()
	{
		System.out.println( "List of cars:" );
	}
}

class Audi extends Car							//SubClass
{
	public void audiBrand()  					//Method
	{
		
		carBrand();								//Calling Parent Class
		System.out.println( "\nPublic Modifiers" );
		System.out.println( "Car brand is Audi" );
	}
}

class Lexus extends Car
{
	protected void lexusBrand()  				//Method
	{
		System.out.println( "\nProtected Modifiers" );
		System.out.println( "Car brand is Lexus" );
	}
}

class Masda extends Car
{
	void masdaBrand()  					//Method
	{
		System.out.println( "\nDefault Modifiers" );
		System.out.println( "Car brand is Masda" );
	}
}

