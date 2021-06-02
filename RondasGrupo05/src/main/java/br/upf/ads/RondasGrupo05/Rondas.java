package br.upf.ads.RondasGrupo05;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ronda
 *
 */
@Entity(name="Ronda")

@IdClass(RondasPK.class)
public class Rondas implements Serializable {

	   
	@Id
	private Integer id;   
	@Id
	private Date dataHoraInicio;   
	@Id
	private Date dataHoraFim;   
	@Id
	private Float latUltima;   
	@Id
	private Float lonUltima;   
	@Id
	private Date dataHoraUltima;
	private static final long serialVersionUID = 1L;

	public Rondas() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getDataHoraInicio() {
		return this.dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}   
	public Date getDataHoraFim() {
		return this.dataHoraFim;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}   
	public Float getLatUltima() {
		return this.latUltima;
	}

	public void setLatUltima(Float latUltima) {
		this.latUltima = latUltima;
	}   
	public Float getLonUltima() {
		return this.lonUltima;
	}

	public void setLonUltima(Float lonUltima) {
		this.lonUltima = lonUltima;
	}   
	public Date getDataHoraUltima() {
		return this.dataHoraUltima;
	}

	public void setDataHoraUltima(Date dataHoraUltima) {
		this.dataHoraUltima = dataHoraUltima;
	}
   
}
