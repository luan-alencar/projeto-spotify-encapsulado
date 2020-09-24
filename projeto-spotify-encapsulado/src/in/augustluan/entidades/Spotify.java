package in.augustluan.entidades;

import java.util.ArrayList;
import java.util.List;

public class Spotify {

	private List<Musica> musicas;

	public Spotify(List<Musica> musicas) {
		this.musicas = new ArrayList<>();
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	public void adicionarMusica(Musica musica) {
		musicas.add(musica);
	}

	public int quantidadeMusica(int quantidade) {
		int mus = 0;
		for (int i = 0; i < musicas.size(); i++) {
			mus = i;
		}
		return mus;
	}
	
	public void removerMusicaNome() {
	//	TODO - implementar	
	}

}
