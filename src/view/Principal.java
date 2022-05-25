package view;

import java.io.IOException;
import controller.ArquivosController;
import controller.CArquivosController;

public class Principal {

	public static void main(String[] args) {
		
		ArquivosController arqCont = new CArquivosController();
		String path = "C:\\TEMP";
		String nome = "generic_food.csv";
		
		try {
			arqCont.lerFila(path, nome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
