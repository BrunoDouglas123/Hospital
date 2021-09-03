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
public class Exame {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String periodo;
	private Double horaexame;
	private String tipoexame;
	private Double preco;
	@ManyToOne
	@JoinColumn(name="id_paciente")
	private Paciente paciente;
	@ManyToOne
	@JoinColumn(name="id_medico")
	private Medico medico;
	
	public Exame () {
	}

	public Exame(Long id, String periodo, Double horaexame, String tipoexame, 
			Double preco, Paciente paciente, Medico medico) {
		this.id = id;
		this.periodo = periodo;
		this.horaexame = horaexame;
		this.tipoexame = tipoexame;
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

	public Double getHoraexame() {
		return horaexame;
	}

	public void setHoraexame(Double horaexame) {
		this.horaexame = horaexame;
	}

	public String getTipoexame() {
		return tipoexame;
	}

	public void setTipoexame(String tipoexame) {
		this.tipoexame = tipoexame;
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
