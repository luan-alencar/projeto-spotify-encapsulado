package in.augustluan.entidades;

public class Musica {

	private String nome;
	private String artista;
	private String letra;
	private Enum genero;
	private int anoLancamento;
	private double duracao;
	private int vezesReproduzido;

	public Musica(String nome, String artista, String letra, Enum genero, int anoLancamento, double duracao,
			int vezesReproduzido) {
		this.nome = nome;
		this.artista = artista;
		this.letra = letra;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
		this.vezesReproduzido = vezesReproduzido;
	}

	public Musica() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public Enum getGenero() {
		return genero;
	}

	public void setGenero(Enum genero) {
		this.genero = genero;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public int getVezesReproduzido() {
		return vezesReproduzido;
	}

	public void setVezesReproduzido(int vezesReproduzido) {
		this.vezesReproduzido = vezesReproduzido;
	}

	@Override
	public String toString() {
		return "Musica [nome=" + nome + ", artista=" + artista + ", letra=" + letra + ", genero=" + genero
				+ ", anoLancamento=" + anoLancamento + ", duracao=" + duracao + ", vezesReproduzido=" + vezesReproduzido
				+ "]";
	}
	
	

}
