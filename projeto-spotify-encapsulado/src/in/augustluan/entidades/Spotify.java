package in.augustluan.entidades;

import java.util.ArrayList;
import java.util.List;

public class Spotify {

	private Musica[] musicas;
	private int qtdMusica;

	public Spotify() {
		musicas = new Musica[10];
		qtdMusica = 0;
	}

	public void add(Musica m) {
		// se a quantidade de musicas for igual a quantidade de musicas
		if (qtdMusica == musicas.length) {
			// entao significa que ela ja possui 10 musicas
			System.out.println("Playlist cheia");
		}
		// se nao, adicione mais uma ai por favor
		musicas[qtdMusica] = m;
		qtdMusica++;
	}

	public void removerMusicaNome() {
		// TODO - implementar
	}

	public static void main(String[] args) {

	}
}