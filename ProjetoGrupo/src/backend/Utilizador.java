/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Diogo
 */
public class Utilizador
{
	//VariĂˇveis de Instancia
	private String nome;
	private String email;
	private String password;
	private ListaProjetos projetos;
	
	public Utilizador (String nome, String email, String password)
	{
		this.nome = nome;
		this.email = email;
		this.password = password;
                
	}
	
	//Seletores
	public String getNome()
	{
		return nome;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	
	//Modificadores
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder();
		s.append("Nome: " + nome + "\n");
		s.append("Email: " + email + "\n");
		s.append("password " + password + "\n");
		
		return s.toString();
	}
}
