import java.util.*;
public class Ejercicio12{
	public static void main(String[] args) {
		int prompersonas;
		int contmujeres = 0;
		int conthombres = 0;
		int contpersonas = 0;
		int prommujeres;
		int promhombres;
		int contalturamuj = 0;
		int contalturahom = 0;
		int contedad = 0;
		int altura = 0;
		int edad = 0;
		Scanner scan = new Scanner(System.in);
		do{
			String sexo;
			int edad1;
			System.out.println("Ingrese la altura");
			altura = scan.nextInt();
			if (altura >= 0) {
				System.out.println("Ingrese el sexo, (m) para masculino y (f) para femenino");
				sexo = scan.nextLine();
				if (sexo.equals("m")) {
					contalturahom += altura;
					conthombres++;
				} else if (sexo.equals("f")) {
					contalturamuj += altura;
					contmujeres++;
				} else {
					System.out.println("No eligio una opcion correcta");
				}
				contpersonas++;
				System.out.println("Ingresa la edad");
				edad1 = scan.nextInt();
				edad += edad1;
			}

		} while (altura >=0);
		prommujeres = contalturamuj/contmujeres;
		promhombres = contalturahom/conthombres;
		prompersonas = edad/contpersonas;
		System.out.println("El promedio de altura de las mujeres es de " + prommujeres);
		System.out.println("El promedio de altura de los hombres es de " + promhombres);
		System.out.println("EL promedio de edad es " + prompersonas);
	}
}