package Practica;

import java.util.Arrays;

public class Ordenamiento {
	public static void main(String[] args) {
		int []Numeros = new int [5];
			
		ObjetoRobot objeto = new ObjetoRobot();
		
		for (int i = 0; i < 5; i++)	{
			while (objeto.PedirNuevamente){
				System.out.println("Ingrese un numero:");
				Numeros[i] = (int)objeto.Leer();
			}
			objeto.PedirNuevamente = true;
		}
		Arrays.sort(Numeros);
		
		System.out.println("Los numeros ordenados son:");
		for (int i = 0; i < 5; i++)	{
		System.out.println(Numeros[i]);
		}
	}
}
