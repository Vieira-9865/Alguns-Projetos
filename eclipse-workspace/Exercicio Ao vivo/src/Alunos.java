import java.util.ArrayList;


public class Alunos {
    private ArrayList<aluno> listaAlunos;
    
    public void inserirAluno(String mat, String nome, int idade, char sexO) {
    	aluno aluno = new aluno();
    	aluno.setmatricula(mat);
    	aluno.setNome(nome);
    	aluno.setIdade(idade);
    	aluno.setSexo(sexO);
    
    	listaAlunos.add(aluno);
    }
    
    public boolean removerAluno(String mat) {
    	for (aluno item : listaAlunos) {
    		if (item.getmatricula().equals(mat)) {
				listaAlunos.remove(item);
				return true;
			}
    	}
    	return false;
    }
    public void imprimirAlunos() {
    	for (aluno aluno : listaAlunos) {
    		System.out.println("Matricula: " + aluno.getmatricula());
    		System.out.println("Nome: " + aluno.getNome());
    		System.out.println("Idade: " + aluno.getIdade());
    		System.out.println("Sexo: " + aluno.getSexo());
		}
    }

}
