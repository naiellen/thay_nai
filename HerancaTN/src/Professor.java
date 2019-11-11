
import javax.persistence.Entity;
import javax.persistence.Id;

//TABLE PER CLASS
@Entity

public class Professor extends Pessoa {
	@Id
	
	private String Disciplina;
	private Integer Matricula;
	private String email;
	private String senha;
	
	
	
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	public Integer getMatricula() {
		return Matricula;
	}
	public void setMatricula(Integer matricula) {
		Matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
	
	
	

}
