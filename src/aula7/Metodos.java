package aula7;

public class Metodos {

	public static void main(String[] args) {
		int resultado = 0;
		String texto = "";
		
		resultado = somar(7,5);
		
		exibirValor(resultado);
		exibirValor(8+9);
		exibirValor(7);
		
	}
	
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	/*
	public static void exibir() {
		System.out.println("Olá Turma!");
	}
	*/
	
	public static void exibirValor(int valor) {
		System.out.println("Resultado: " + valor);
	}

}
