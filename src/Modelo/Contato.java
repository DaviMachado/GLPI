package Modelo;

public class Contato {
	private String id;
	private String nome;
	private String email;
	private String endereco;
	private String dataNascimento;
	
	// get's & set's
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	// Caso precise deixar o "id" como o tipo "long"
	//
	// private long id;
	//
	// public long getId() {
	// 	 return id;
	// }
	// public void setId(long id) {
	// 	 this.id = id;
	// }
	////////////////////////////////////////
	// Caso precise deixar o "dataNascimento" como o tipo "Calendar"
	//
	// import java.util.Calendar;
	//
	// private Calendar dataNascimento;
	//
	//  public Calendar getDataNascimento() {
	// 	  return dataNascimento;
	//  }
	//  public void setDataNascimento(Calendar dataNascimento) {
	// 	  this.dataNascimento = dataNascimento;
	//  }
}