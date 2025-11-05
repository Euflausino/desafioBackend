package com.euflausino.desafio_backend_it.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Transacao {
	
	private BigDecimal valor;
	private OffsetDateTime dataHora;
	
	public Transacao(BigDecimal valor, OffsetDateTime dataHora) {
		this.valor = valor;
		this.dataHora = dataHora;
	}
	
	public Transacao() {
	}

	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public OffsetDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(OffsetDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	
	
	
}
