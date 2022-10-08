package br.com.batista;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuscarNome implements Runnable {

	String path;
	String nome;

	public BuscarNome(String path, String nome) {
		super();
		this.path = path;
		this.nome = nome;
	}

	@Override
	public void run() {

		try {
			Scanner scanner = new Scanner(new File(path));
			int contador = 1;
			while (scanner.hasNext()) {
				String linha = scanner.nextLine();

				if (linha.toLowerCase().contains(nome.toLowerCase())) {
					System.out.println(path + " - " + contador + " - " + linha);
				}
				contador++;
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

}
