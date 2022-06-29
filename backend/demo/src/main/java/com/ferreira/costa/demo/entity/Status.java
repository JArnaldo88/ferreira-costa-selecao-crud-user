package com.ferreira.costa.demo.entity;

public enum Status {
	ATIVO(1), INATIVO(2);

	private int valor;

	Status(int valor) {
		this.valor = valor;
	}

	public int getValorArea() {
		return valor;
	}


}
