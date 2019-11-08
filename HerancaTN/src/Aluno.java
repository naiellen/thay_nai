
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno extends Pessoa{
    @Id
	private Long id;
	private String Nome;
	private Integer Matricula;
	private String Curso;
	private String Periodo;
	private String email;
	private String senha;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (Curso == null) {
			if (other.Curso != null)
				return false;
		} else if (!Curso.equals(other.Curso))
			return false;
		if (Matricula == null) {
			if (other.Matricula != null)
				return false;
		} else if (!Matricula.equals(other.Matricula))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (Periodo == null) {
			if (other.Periodo != null)
				return false;
		} else if (!Periodo.equals(other.Periodo))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	
	
	
	
	
}
