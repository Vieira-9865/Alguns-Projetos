package programação;

import java.util.ArrayList;

public class Notebooks {

	ArrayList<Notebook> listaNotes = new ArrayList <Notebook>();
	
	public void inserirNovoNote(int Identificador,String descricao, String marca, String hd, double memoria, double preco) {
		Notebook note = new Notebook();
		note.setIdentificador(Identificador);
		note.setDescriçao(descricao);
		note.setMarca(marca);
		note.setHD(hd);
		note.setDescriçao(descricao);
		note.setMemoria(memoria);
		note.setPreço(preco);
		listaNotes.add(note);
	}
	
	public boolean atualizarPrecoNotePeloId(int Identificador, double preco) {
		for (Notebook item : listaNotes) {
			if (item.getIdentificador() == Identificador) {
				item.setPreço(preco);
				return true;
			}
		}
		return false;
	}

	public boolean removerNote(int Identificador) {
		for (Notebook item : listaNotes) {
			if (item.getIdentificador() == Identificador) {
				listaNotes.remove(item);
				return true;
			}
		}
		return false;
	}

	public  void imprimirTodosNotes() {
		for (Notebook notebook : listaNotes) {
			System.out.println("ID: " + notebook.getIdentificador());
			System.out.println("Descrição: " + notebook.getDescriçao());
			System.out.println("Marca: " + notebook.getMarca());
			System.out.println("HD: " + notebook.getHD());
			System.out.println("Processador: " + notebook.getProcessador());
			System.out.println("Memoria: " + notebook.getMemoria());
			System.out.println("Preço: " + notebook.getPreço());
		}
	}

	public void imprimirNotePeloID(int Identificador) {
		for (Notebook notebook : listaNotes) {
			if (notebook.getIdentificador() == Identificador) {
				System.out.println("ID: " + notebook.getIdentificador());
				System.out.println("Descrição: " + notebook.getDescriçao());
				System.out.println("Marca: " + notebook.getMarca());
				System.out.println("HD: " + notebook.getHD());
				System.out.println("Processador: " + notebook.getProcessador());
				System.out.println("Memoria: " + notebook.getMemoria());
				System.out.println("Preço: " + notebook.getPreço());
				
				
			}
		}
			
	}
}

