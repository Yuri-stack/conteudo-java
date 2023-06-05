package aula9_Asso;

public class TestaAssociacao {

	public static void main(String[] args) {
		Professor prof = new Professor(1, "Rafaella", "Programação");
		Aluno alune = new Aluno();
		
		alune.setId(1);
		alune.setNome("Thiago");
		alune.setInstrutor(prof);	// Atribuo os dados da Professora ao Objeto aluno
		
		alune.visualizar();
	}

}
