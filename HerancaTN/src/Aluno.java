
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

//SINGLE TABLE
@Entity
@DiscriminatorValue(value = "A")
public class Aluno extends Pessoa{
    @Id
	private Integer Matricula;
	private String Curso;
	private String Periodo;
	private String email;
	private String senha;
	
	public Integer getMatricula() {
		return Matricula;
	}
	public void setMatricula(Integer matricula) {
		Matricula = matricula;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
	public String getPeriodo() {
		return Periodo;
	}
	public void setPeriodo(String periodo) {
		Periodo = periodo;
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
