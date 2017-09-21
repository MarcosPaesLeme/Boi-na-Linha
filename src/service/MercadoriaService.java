package service;

import java.util.ArrayList;

import dao.MercadoriaDAO;
import model.Mercadoria;

public class MercadoriaService {
	
	MercadoriaDAO dao;
	
	public MercadoriaService()
	{
		dao = new MercadoriaDAO();
	}
		
	public void criarMercadoria(Mercadoria to)
	{
		dao.cadastrarMercadoria(to);
	}
	
	public ArrayList<Mercadoria> listarMercadoria(Mercadoria to){
		return dao.listarMercadoria(to);
	}
}
