package model;

import java.io.Serializable;

public class Mercadoria implements Serializable{
	private int codigo_mercadoria;
	private String tipo_mercadoria;
	private String nome_mercadoria;
	private int quantidade;
	private double preco;
	private boolean tipo_negocio;
	
	public int getCodigo_mercadoria() {
		return codigo_mercadoria;
	}
	public void setCodigo_mercadoria(int codigo_mercadoria) {
		this.codigo_mercadoria = codigo_mercadoria;
	}
	public String getTipo_mercadoria() {
		return tipo_mercadoria;
	}
	public void setTipo_mercadoria(String tipo_mercadoria) {
		this.tipo_mercadoria = tipo_mercadoria;
	}
	public String getNome_mercadoria() {
		return nome_mercadoria;
	}
	public void setNome_mercadoria(String nome_mercadoria) {
		this.nome_mercadoria = nome_mercadoria;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isTipo_negocio() {
		return tipo_negocio;
	}
	public void setTipo_negocio(boolean tipo_negocio) {
		this.tipo_negocio = tipo_negocio;
	}
	
	
}
