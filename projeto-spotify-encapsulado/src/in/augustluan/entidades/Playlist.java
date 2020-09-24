package in.augustluan.entidades;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private Musica[] musicas;
	private int qtdMusica;

	public Playlist() {
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
		Playlist p = new Playlist();
		Musica m = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		Musica m2 = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		Musica m3 = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		Musica m4 = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		Musica m5 = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		Musica m6 = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		Musica m7 = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		Musica m8 = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		Musica m9 = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		Musica m10 = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		Musica m11 = new Musica("asdf", "sdfa", "scvv", null, 2020, 45.04, 2);
		p.add(m);
		p.add(m2);
		p.add(m3);
		p.add(m4);
		p.add(m5);
		p.add(m6);
		p.add(m7);
		p.add(m8);
		p.add(m9);
		p.add(m10);
		p.add(m11);

	}
}