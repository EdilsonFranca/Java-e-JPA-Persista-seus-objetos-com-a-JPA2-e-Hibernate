package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteTodoasAsMovimentacoesDasContas {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
	      em.getTransaction().begin();
	      String jpql="select distinct c from Conta c left join fetch c.movimentacao";
	      Query query = em.createQuery(jpql);
	      List<Conta> todasasContas=query.getResultList();
	      
	      for (Conta conta : todasasContas) {
			System.out.println("Titular  "+conta.getTitular());
			System.out.println("Movimentação  ");
			System.out.println(conta.getMovimentacao());
		}
	   
	      em.getTransaction().commit();
	      em.close();
	}

}
