package br.upf.ads.RondasGrupo05;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.util.Date;

/**
 * ID class for entity: Rondas
 *
 */ 
public class RondasPK  implements Serializable {   
   
	         
	private Integer id;         
	private Date dataHoraInicio;         
	private Date dataHoraFim;         
	private Float latUltima;         
	private Float lonUltima;         
	private Date dataHoraUltima;
	private static final long serialVersionUID = 1L;

	public RondasPK() {}

	

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
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof RondasPK)) {
			return false;
		}
		RondasPK other = (RondasPK) o;
		return true
			&& (getId() == null ? other.getId() == null : getId().equals(other.getId()))
			&& (getDataHoraInicio() == null ? other.getDataHoraInicio() == null : getDataHoraInicio().equals(other.getDataHoraInicio()))
			&& (getDataHoraFim() == null ? other.getDataHoraFim() == null : getDataHoraFim().equals(other.getDataHoraFim()))
			&& (getLatUltima() == null ? other.getLatUltima() == null : getLatUltima().equals(other.getLatUltima()))
			&& (getLonUltima() == null ? other.getLonUltima() == null : getLonUltima().equals(other.getLonUltima()))
			&& (getDataHoraUltima() == null ? other.getDataHoraUltima() == null : getDataHoraUltima().equals(other.getDataHoraUltima()));
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getId() == null ? 0 : getId().hashCode());
		result = prime * result + (getDataHoraInicio() == null ? 0 : getDataHoraInicio().hashCode());
		result = prime * result + (getDataHoraFim() == null ? 0 : getDataHoraFim().hashCode());
		result = prime * result + (getLatUltima() == null ? 0 : getLatUltima().hashCode());
		result = prime * result + (getLonUltima() == null ? 0 : getLonUltima().hashCode());
		result = prime * result + (getDataHoraUltima() == null ? 0 : getDataHoraUltima().hashCode());
		return result;
	}
   
   
}
