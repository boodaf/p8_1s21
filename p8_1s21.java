import java.util.Scanner;
public class p8_1s21{
	public static void main(string[] args) {
		Scanner teclado = new Scanner(System.in);
		byte edad;
		System.out.println("Ingrese su edad: ");
		edad = teclado.nextByte();

		if(edad>= 18){
			System.out.println("Eres mayor de edad...");
		}
	}
}