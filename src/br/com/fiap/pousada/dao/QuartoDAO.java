package br.com.fiap.pousada.dao;

import br.com.fiap.pousada.generics.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.pousada.domain.Quarto;

public class QuartoDAO implements DAO<Quarto> {

	private Connection conn;

	public QuartoDAO() {
		this.conn = SqlConfig.getInstance().getConfig();
	}

	@Override
	public List<Quarto> findAll() {

		return null;
	}

	@Override
	public Quarto findById(long id) {

		try {

			Quarto quarto = null;
			PreparedStatement pstmt = null;
			String sql = String.format("SELECT * from QUARTOS WHERE NR_QUARTO LIKE '%d'", id);

			pstmt = this.conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				quarto = new Quarto(rs.getInt("NR_QUARTO"), rs.getInt("MAXPESSOAS"), rs.getDouble("VLRDIARIA"));
			}

			this.conn.close();
			return quarto;
		} catch (SQLException e) {
			System.err.println("Quarto não encontrado.");
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public void save(Quarto t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Quarto t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
