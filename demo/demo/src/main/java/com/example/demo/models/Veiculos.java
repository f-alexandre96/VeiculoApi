package com.example.demo.models;

import org.hibernate.annotations.AnyDiscriminatorImplicitValues.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculos {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String placa;
	private int anoFabricacao;
	private String modelo;
	
	public Long GetId(){
		return id;
	}
	
	public String GetPlaca(){
		return placa;
	}
	public int GetAnoFabricacao(){
		return anoFabricacao;
	}
	public String GetModelo(){
		return modelo;
	}
	
	public void SetId(Long id) {
		this.id=id;
	}
	
	public void SetPlaca(String placa) {
		this.placa=placa;
	}
	
	public Veiculos () {
		
	}
}
