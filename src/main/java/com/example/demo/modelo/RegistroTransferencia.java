package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Registro")
public class RegistroTransferencia {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regi_seq")
	@SequenceGenerator(name = "regi_seq", sequenceName = "regi_seq", allocationSize = 1)
	@Column(name = "regi_id")
	private Integer id;
	@Column(name = "regi_fecha_transeferencia")
	private LocalDateTime fechaTransferencia;
	@Column(name = "regi_num_cuenta_origen")
	private String numCuentaOrigen;
	@Column(name = "rei_num_cuenta_destino")
	private String numCuentaDestino;
	@Column(name = "regi_monto_transferencia")
	private BigDecimal montoTransferencia;
	@Column(name = "regi_comision_transferencia")
	private BigDecimal comisionTransferencia;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}
	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
	public String getNumCuentaOrigen() {
		return numCuentaOrigen;
	}
	public void setNumCuentaOrigen(String numCuentaOrigen) {
		this.numCuentaOrigen = numCuentaOrigen;
	}
	public String getNumCuentaDestino() {
		return numCuentaDestino;
	}
	public void setNumCuentaDestino(String numCuentaDestino) {
		this.numCuentaDestino = numCuentaDestino;
	}
	public BigDecimal getMontoTransferencia() {
		return montoTransferencia;
	}
	public void setMontoTransferencia(BigDecimal montoTransferencia) {
		this.montoTransferencia = montoTransferencia;
	}
	public BigDecimal getComisionTransferencia() {
		return comisionTransferencia;
	}
	public void setComisionTransferencia(BigDecimal comisionTransferencia) {
		this.comisionTransferencia = comisionTransferencia;
	}
	
	
	@Override
	public String toString() {
		return "RegistroTransferencia [id=" + id + ", fechaTransferencia=" + fechaTransferencia + ", numCuentaOrigen="
				+ numCuentaOrigen + ", numCuentaDestino=" + numCuentaDestino + ", montoTransferencia="
				+ montoTransferencia + ", comisionTransferencia=" + comisionTransferencia + "]";
	}
	
	
	
	
	
	
}
