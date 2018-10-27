package br.com.caelum.financas.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestJPARelacionamento {
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		Conta contaR = new Conta();
		contaR.setAgencia("0102");
		contaR.setBanco("Itau");
		contaR.setNumero("1234");
		contaR.setTitular("Edilson");

		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("churrascaria");
		movimentacao.setTipo(TipoMovimentacao.SAIDA);
		movimentacao.setValor(new BigDecimal("200.0"));
		movimentacao.setConta(contaR);

		
		em.getTransaction().begin();
		em.persist(contaR);
		em.persist(movimentacao);
		em.getTransaction().commit();
		em.close();

	}

}
