package br.com.caelum.jdbc.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.model.Contato;

public class ContatoDAO {

	private Connection connection;
	
	public ContatoDAO()
	{
		this.connection = (Connection) new ConnectionFactory().getConnection();
	}
	public void adicionar(Contato contato)
	{
		String sql = "INSERT INTO contatos (nome,telefone,email,endereco,dataNascimento) " +
					 "VALUES (?,?,?,?,?)";
		
		try
		{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getTelefone());
			ps.setString(3, contato.getEmail());
			ps.setString(4, contato.getEndereco());
			ps.setDate(5, new Date(contato.getDataNascimento().getTimeInMillis()));
			
			ps.execute();
			ps.close();
		}
		catch(SQLException e)
		{
			throw new RuntimeException(e);
		}
	}
}
