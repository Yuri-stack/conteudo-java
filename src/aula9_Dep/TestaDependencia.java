package aula9_Dep;

public class TestaDependencia {

	public static void main(String[] args) {
		
		// Crio um objeto de produto, e um objeto de carrinho
		Produto prod = new Produto(1, "Café", 14.50f);
		Carrinho car = new Carrinho();
		
		// Passo o produto para o carrinho
		car.mostraItem(prod);

	}

}
