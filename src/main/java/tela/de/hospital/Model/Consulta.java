package tela.de.hospital.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Consulta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String periodo;
	private Double horaconsulta;
	private String tipoconsulta;
	private Double preco;
	@ManyToOne
	@JoinColumn(name="id_paciente")
	private Paciente paciente;
	@ManyToOne
	@JoinColumn(name="id_medico")
	private Medico medico;
	
	public Consulta () {
	}

	public Consulta(Long id, String periodo, Double horaconsulta, 
			String tipoconsulta, Double preco, Paciente paciente, Medico medico) {
		this.id = id;
		this.periodo = periodo;
		this.horaconsulta = horaconsulta;
		this.tipoconsulta = tipoconsulta;
		this.preco = preco;
		this.paciente = paciente;
		this.medico = medico;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Double getHoraconsulta() {
		return horaconsulta;
	}

	public void setHoraconsulta(Double horaconsulta) {
		this.horaconsulta = horaconsulta;
	}

	public String getTipoconsulta() {
		return tipoconsulta;
	}

	public void setTipoconsulta(String tipoconsulta) {
		this.tipoconsulta = tipoconsulta;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
}
