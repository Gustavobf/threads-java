package br.com.batista;

public class DemoApplication {
	
	public static void main(String[] args) {
		
		
		String nome = "Jon";
		
		Thread thread1 = new Thread(new BuscarNome("resource/assinaturas1.txt", nome));
		Thread thread2 = new Thread(new BuscarNome("resource/assinaturas2.txt", nome));
		Thread thread3 = new Thread(new BuscarNome("resource/autores.txt", nome));
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}

}
