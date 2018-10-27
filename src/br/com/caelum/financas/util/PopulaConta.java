package br.com.caelum.financas.util;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;

public class PopulaConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		Conta conta4 = new Conta();
		Conta conta5 = new Conta();
		
		conta1.setAgencia("324");
		conta1.setBanco("Banco do Brasil");
		conta1.setNumero("234353");
		conta1.setTitular("Julio ");
		
		conta2.setAgencia("664");
		conta2.setBanco("Banco Bradesco");
		conta2.setNumero("768768");
		conta2.setTitular("Claudio ");
		
		conta3.setAgencia("234");
		conta3.setBanco("Banco Caixa ");
		conta3.setNumero("42534");
		conta3.setTitular("Adriana ");
		
		conta4.setAgencia("3656");
		conta4.setBanco("Banco do Brasil");
		conta4.setNumero("14333");
		conta4.setTitular("Patricia ");
		
		conta5.setAgencia("34656");
		conta5.setBanco("Banco Itau");
		conta5.setNumero("52443");
		conta5.setTitular("Edenilson ");
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.persist(conta1);
		em.persist(conta2);
		em.persist(conta3);
		em.persist(conta4);
		em.persist(conta5);
		em.getTransaction().commit();
		em.close();
	}
}
