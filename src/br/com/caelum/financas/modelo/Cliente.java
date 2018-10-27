package br.com.caelum.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String Profissao;
	@JoinColumn(unique = true)
	@OneToOne
	private Endereco endereco;

	@JoinColumn(unique = true)
	@OneToOne
	private Conta conta;

	public Cliente() {
	}

	public Cliente(Integer id, String nome, String profissao, Endereco endereco, Conta conta) {
		this.id = id;
		this.nome = nome;
		this.Profissao = profissao;
		this.endereco = endereco;
		this.conta = conta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return Profissao;
	}

	public void setProfissao(String profissao) {
		Profissao = profissao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
