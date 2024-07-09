package tarea1Diciembre;

public class MainMoto {

	public static void main(String[] args) {
		
		Moto Lexus = new Moto("Lexus","black",2020 ,"4510ABC", 25000.25);
		Moto Toyota = new Moto("Toyota","white",2022 ,"0022ABC", 45000.80);
		
		System.out.println("Primer objecto instanciado de la clase Moto");
		System.out.println("************");
		
		System.out.println("La marca de la moto es: "+ Lexus.getMarca());
		System.out.println("El modelo de la moto es: "+ Lexus.getModelo());
		System.out.println("El año de la moto es: "+ Lexus.getAgno());
		System.out.println("La matrícula de la moto es: "+ Lexus.getMatricula());
		System.out.println("El total de kilometraje es: "+ Lexus.getKilometraje());
	
		System.out.println(" ");
		System.out.println("Segundo objecto instanciado de la clase Moto");
		System.out.println("************");
		
		System.out.println("La marca de la moto es: "+ Toyota.getMarca());
		System.out.println("El modelo de la moto es: "+ Toyota.getModelo());
		System.out.println("El año de la moto es: "+ Toyota.getAgno());
		System.out.println("La matrícula de la moto es: "+ Toyota.getMatricula());
		System.out.println("El total de kilometraje es: "+ Toyota.getKilometraje());
	}

}