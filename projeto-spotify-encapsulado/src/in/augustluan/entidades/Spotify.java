package in.augustluan.entidades;

import java.util.ArrayList;
import java.util.List;

public class Spotify {

	private List<Musica> musicas;

	public Spotify(List<Musica> musicas) {
		this.musicas = new ArrayList<>();
	}

	
	public Spotify() {
	}


	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	public void adicionarMusica(String nome, String artista, String letra, Enum genero, int anoLancamento, double duracao,
			int vezesReproduzido) {
//		TODO - Implementar
	}

	public int quantidadeMusica() {
		int mus = 0;
		for (int i = 0; i < musicas.size(); i++) {
			mus = i;
		}
		return mus;
	}

	public void removerMusicaNome() {
		// TODO - implementar
	}
	
	public static void main(String[] args) {
		
		Spotify s = new Spotify();
		Musica musica = new Musica("Bolado", "Fulano","Muito boa",null, 2020, 45.0, 1);
		System.out.println(s.quantidadeMusica());
	}

}
