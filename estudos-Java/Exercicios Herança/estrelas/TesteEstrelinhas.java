package herenca2_izabela;

public class TesteEstrelinhas {
	
	public static void main(String[] args) {
		ProtoEstrela proto1 = new ProtoEstrela(55.3, 22.1, 88.3);
		System.out.printf(proto1.mostrarDados());
		
		EstrelaAmarela estrela1 = new EstrelaAmarela(44.3, 221.65, 1346.2, "Estrela Amarela");
		System.out.printf(estrela1.mostrarDados());
	}
}
