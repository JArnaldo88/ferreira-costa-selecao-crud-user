package com.ferreira.costa.demo.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name= "\"usuario\"")
public class User {
	
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	

	@Column(name = "name", nullable = false, unique = false, length = 50)
	private String name;
	
	
	@Column(name = "nomeMae", nullable = true, unique = false, length = 50)
	private String nomeMae;
	
	@Column(name = "cpf", unique = true, nullable = false, length = 11)
	private String cpf;
	
	@Column(name = "email", nullable = true, length = 320)
	private String email;
	
	@Column(name = "telefone", nullable = false)
	private String telefone;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dataNascimento", nullable = false, unique = false)
	private Date dataNascimento;
	
	
	@Column(name = "login", nullable = false, unique = true)
	private String login;
	
	
	@Column(name = "senha", nullable = false, unique = false)
	private String senha;
	
	@Column(name = "Status", nullable = false)
	private Status status;
	
	//@CreatedBy//
	@Column(name = "dataInclusao", nullable = false, updatable= false)
	private Date dataInclusao;
	
	//@LastModifiedBy//
	@Column(name = "dataAlteracao", nullable = false, updatable = false)
	private Date dataAlteracao;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Date getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", nomeMae=" + nomeMae + ", cpf=" + cpf + ", email=" + email
				+ ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + ", login=" + login + ", senha="
				+ senha + ", status=" + status + ", dataInclusao=" + dataInclusao + ", dataAlteracao=" + dataAlteracao
				+ "]";
	}
	
	
	
}
	
	