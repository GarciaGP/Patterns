package br.com.fiap.pousada.main;

import br.com.fiap.pousada.dao.QuartoDAO;
import br.com.fiap.pousada.domain.Quarto;

public class Test {
	public static void main(String[] args) {
		QuartoDAO dao = new QuartoDAO();
		
		Quarto quarto = dao.findById(1);
		
		System.out.print(quarto.toString());
		
	}
}
