package entities;

public class Tarefa {
	
	private String descricao;
	private boolean concluida = false;
	
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
	}


	public String getDescricao() {
		return descricao;
	}


	public boolean isConcluida() {
		return concluida;
	}
	
	public void marcarComoConcluida() {
		this.concluida = true;
	}


	public String toString() {
		if(concluida) {
			return "[X] " + descricao;
			
		} else {
			return "[ ] " + descricao;
		}
		
	}
	
	
}

