import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa implements Identificavel{
@Id
private Long id;
private String Nome;
private Date NascimentoData;
private Integer CPF;
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
public Date getNascimentoData() {
	return NascimentoData;
}
public void setNascimentoData(Date nascimentoData) {
	NascimentoData = nascimentoData;
}
public Integer getCPF() {
	return CPF;
}
public void setCPF(Integer cPF) {
	CPF = cPF;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pessoa other = (Pessoa) obj;
	if (CPF == null) {
		if (other.CPF != null)
			return false;
	} else if (!CPF.equals(other.CPF))
		return false;
	if (NascimentoData == null) {
		if (other.NascimentoData != null)
			return false;
	} else if (!NascimentoData.equals(other.NascimentoData))
		return false;
	if (Nome == null) {
		if (other.Nome != null)
			return false;
	} else if (!Nome.equals(other.Nome))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

}