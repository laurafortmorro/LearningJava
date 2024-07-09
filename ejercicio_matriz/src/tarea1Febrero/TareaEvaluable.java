package tarea1Febrero;
//tarea Febrero de Laura Fort Morro
import java.util.Scanner;

public class TareaEvaluable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String[][] matrizx=new String[4][6];
		
		System.out.println("**Matriz de 4 filas y 6 columnas**");
		
		for (int i=0;i<matrizx.length;i++){
			System.out.println();
			
			for(int j=0;j<matrizx[i].length;j++) {
				matrizx[i][j]="x";
				System.out.print(matrizx[i][j]+"\t");	
			}
		}
		Scanner Leer=new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("**Introduce las coordenadas del elemento a cambiar**");	
	
		System.out.println("Coordenada I(Filas): ");
		int fila=Leer.nextInt();

		while (fila<0 || fila>3) {
		System.err.println("Coordenada I fuera del rango");
		fila=0;
		System.out.println("Coordenada I(Filas): ");
		fila=Leer.nextInt();
		}
		
		System.out.println("Coordenada J(columnas): ");
		int columna=Leer.nextInt();

		while (columna<0 || columna>5) {
		System.err.println("Coordenada J fuera del rango");
		columna=0;
		System.out.println("Coordenada J(columnas): ");
		columna=Leer.nextInt();
		}
		
		System.out.println("Introduce el nuevo elemento: ");
		String elemento=Leer.next();
		
		for (int i=0;i<matrizx.length;i++){
			System.out.println();
			
			for(int j=0;j<matrizx[i].length;j++) {
				matrizx[i][j]="x";
				matrizx[fila][columna]=elemento;
				
				System.out.print(matrizx[i][j]+"\t");
				
			}
		}
		
		int numCaracteres = elemento.length();
		System.out.println();
		System.out.println("El nuevo elemento tiene " + numCaracteres + " caracteres.");
		
	}

}
