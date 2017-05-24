package Practica;

public class Calculadora {
	public static void main(String[] args) {
		int a = 0,b = 0;
		String operador = null;
		
		ObjetoRobot objeto = new ObjetoRobot();
		
		while (objeto.PedirNuevamente){
			System.out.println("Ingrese un numero:");
			a = (int)objeto.Leer();
		}
		
		objeto.PedirNuevamente = true;
		
		while (objeto.PedirNuevamente){
			System.out.println("Ingrese otro numero:");
			b = (int)objeto.Leer();
		}
		objeto.PedirNuevamente = true;
		
		System.out.println("Si desea sumar escriba +");
		System.out.println("Si desea restar escriba -");
		System.out.println("Si desea multiplicar escriba *");
		System.out.println("Si desea dividir escriba /");
		
		do{
			System.out.println("Ingrese el operador:");
			operador = objeto.LeerTexto();
			System.out.println(operador);
		}while (!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/"));	
		
		
		if (operador.equalsIgnoreCase("+")){
			System.out.println("El resultado de " + a + " + " + b + " es " + (a+b));			
		}
		else if (operador.equalsIgnoreCase("-")){
			System.out.println("El resultado de " + a + " - " + b + " es " + (a-b));			
		}
		else if (operador.equalsIgnoreCase("*")){
			System.out.println("El resultado de " + a + " * " + b + " es " + (a*b));			
		}
		else if (operador.equalsIgnoreCase("/")){
			System.out.println("El resultado de " + a + " / " + b + " es " + (a/b));			
		}		
	}
}
