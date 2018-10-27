package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Cliente;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Endereco;
import br.com.caelum.financas.util.JPAUtil;

public class TestaContaCliente {

	public static void main(String[] args) {
		  Endereco endereco = new Endereco();
		  endereco.setNumero("67");
		  endereco.setRua("Sao Teodoro");
		  endereco.setBairro("itaquera");
		  endereco.setCep("08290190");
		  endereco.setCidade( "Sao Paulo");
		  
	      Cliente cliente = new Cliente();
	      cliente.setNome("Edilson");
	      cliente.setProfissao("Programador java");
	      cliente.setEndereco(endereco);
	      
	      Conta conta = new Conta();
	      conta.setId(2);
	      
	      cliente.setConta(conta);
	      
	      EntityManager em = new JPAUtil().getEntityManager();
	      em.getTransaction().begin();
	      em.persist(endereco);
	      em.persist(cliente);
	      em.getTransaction().commit();
	      em.close();
	      
	      }

}
