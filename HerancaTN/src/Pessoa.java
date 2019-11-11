import java.sql.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//SINGLE TABLE
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)

public class Pessoa implements Identificavel{
	 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

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
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}



}


