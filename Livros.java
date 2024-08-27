package avaint;

public class Livros {
	//Atributos: nomequedesejar;
	//TiposPrimitvios: String,int,double,etc
	//Modificadores: Public,Private,Protected, default;
	private String titulo; 
	private int qtdPaginas;
	private int pagLidas;
	//
	//Métodos especiais get e set:
	//
	//Void: método não tem um valor de retorno;
	//
	public String getTitulo() {
		return titulo;	
	}
	public void setTitulo(String titulo) {		
		this.titulo = titulo;	
		//this = referenciar ATRIBUTOS DA CLASSE;
	}
	public int getQuatPag() {
		return qtdPaginas;
	}
	public void setQuatPag(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;		
	}
	public int getPlidas() {
		return pagLidas;	
	}
	public  void setPlidas(int pagLidas) {
		this.pagLidas = pagLidas;		
	}
	public void verificarProgresso() {
		int porcentagem = (this.pagLidas * 100) / this.qtdPaginas;
		System.out.println("O livro " + this.titulo + " possui " + this.qtdPaginas + " páginas" );
		System.out.println("Você leu " + porcentagem + "%" + " " + "do livro");
	}

}
