package tela.de.hospital.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Contato {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Double contato;
	
	public Contato () {
	}

	public Contato(Long id, Double contato) {
		this.id = id;
		this.contato = contato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getContato() {
		return contato;
	}

	public void setContato(Double contato) {
		this.contato = contato;
	}
}
