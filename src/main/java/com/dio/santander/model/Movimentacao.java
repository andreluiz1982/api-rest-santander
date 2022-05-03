package com.dio.santander.model;

import java.time.LocalDateTime;

public class Movimentacao {
	
	private Integer id;
	private LocalDateTime dataHora;
	private String descricao;
	private Double valor;
	
	private MovimetancaoTipo tipo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public MovimetancaoTipo getTipo() {
		return tipo;
	}

	public void setTipo(MovimetancaoTipo tipo) {
		this.tipo = tipo;
	}
	
	

}
