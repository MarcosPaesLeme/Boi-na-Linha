package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Mercadoria;

public class MercadoriaDAO {
	// CADASTRAR MERCADORIA
		public void cadastrarMercadoria(Mercadoria to) {
			String sqlInsert = "insert into Mercadoria(tipo_mercadoria, nome_mercadoria, quantidade, preco, tipo_negocio) values(?, ?, ?, ?, ?);";
			try (Connection conn = ConnectionFactory.obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
				stm.setString(1, to.getTipo_mercadoria());
				stm.setString(2, to.getNome_mercadoria());
				stm.setInt(3, to.getQuantidade());
				stm.setDouble(4, to.getPreco());
				stm.setBoolean(5, to.isTipo_negocio());
				stm.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		// CONSULTA O TIPO DE NEGOCIO
		public ArrayList<Mercadoria> listarMercadoria(Mercadoria to) {
			Mercadoria mercadoria;
			ArrayList<Mercadoria> lista = new ArrayList<>();
			String sqlSelect = "select * from Mercadoria where tipo_negocio=?;";
			try (Connection conn = ConnectionFactory.obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				try (ResultSet rs = stm.executeQuery();) {
					while (rs.next()) {
						mercadoria = new Mercadoria();
						mercadoria.setCodigo_mercadoria(rs.getInt("codigo_mercadoria"));
						mercadoria.setTipo_mercadoria(rs.getString("tipo_mercadoria"));
						mercadoria.setQuantidade(rs.getInt("quantidade"));
						mercadoria.setPreco(rs.getDouble("preco"));
						lista.add(mercadoria);

					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
			return lista;
		}
}
