package br.com.caelum.jdbc.control;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.model.Contato;

public class Controller {

	public void Inserir(String nome, String telefone,String email,String endereco,String dataNascimento) throws ParseException
	{
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = (Date)df.parse(dataNascimento);

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		contato.setDataNascimento(cal);
		
		ContatoDAO dao = new ContatoDAO();
		dao.adicionar(contato);
		JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !");
	}
}
