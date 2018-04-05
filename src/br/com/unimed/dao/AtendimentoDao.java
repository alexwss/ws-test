package br.com.unimed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.unimed.fabricaConexao.ConnectionFactory;
import br.com.unimed.modelo.Atendimento;

public class AtendimentoDao {

	public Atendimento carregarAtendimento(String protocolo) throws SQLException {
		String sql = "select * from bpm.atendimento where protocolo = ?";
		Atendimento atendimento = null;

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, protocolo);
		ResultSet rs = ps.executeQuery();

		try {
			if (rs.next()) {
				atendimento = new Atendimento();
				atendimento.setCodigoBeneficiario(rs.getString("codigo_cliente"));
				atendimento.setProtocolo(rs.getString("protocolo"));
				atendimento.setDataAbertura(new java.util.Date(rs.getDate("data").getTime()));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			ps.close();
		}

		return atendimento;

	}

}
