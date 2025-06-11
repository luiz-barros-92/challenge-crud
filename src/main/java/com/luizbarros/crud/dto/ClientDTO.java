package com.luizbarros.crud.dto;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.luizbarros.crud.entities.Client;

public class ClientDTO {
	
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private LocalDate birthDate;
	private Integer children;
	
	public ClientDTO() {
	}
	
	public ClientDTO(Client entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}		
}
