package exercicios_colletions_izabela;
import java.util.ArrayList;
import java.util.List;

public class FiltroAlunosAprovados {
	
	private String nome;
	private double nota;
	
	public FiltroAlunosAprovados(String nome, double nota){
		this.nome = nome;
		this.nota = nota;
	}
	
	public double getNota() {
		return nota;
	}

	List <FiltroAlunosAprovados> lstFiltroAlunosAprovados = new ArrayList<FiltroAlunosAprovados>();
	List <FiltroAlunosAprovados> lstAlunosAprovados = new ArrayList<FiltroAlunosAprovados>();
	
	public void adicionar(String nome, double nota) {
		lstFiltroAlunosAprovados.add(new FiltroAlunosAprovados(this.nome, this.nota));
	}
	
	public List<FiltroAlunosAprovados> obterListaDeAprovados(){
		
	
		for (FiltroAlunosAprovados filtro : lstFiltroAlunosAprovados) {
			if(filtro.getNota() >= 6 && filtro.getNota() <= 10){
				lstAlunosAprovados.add(filtro);
			}
		}
		
		for (FiltroAlunosAprovados filtro : lstAlunosAprovados) {
			System.out.print("***Alunos Aprovados***");
			System.out.println("Nome: " + filtro.nome + "\nNota: " + filtro.nota);
		}
		
		
		return lstFiltroAlunosAprovados;
	} 
	
}
