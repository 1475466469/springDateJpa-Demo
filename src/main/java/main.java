import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import pojo.Test;
import utils.JPAUtil;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	EntityManager em= JPAUtil.getEntityManager();
    	EntityTransaction tx=em.getTransaction();
    	tx.begin();
    	
    	//新增
//    	Test n =new Test();
//    	n.setName("535300");
//    	em.persist(n);
    	//查找
    	//Test t= em.find(Test.class, 1);
    	
    	
    	
    	tx.commit();
    	System.out.println(t);
    	em.close();
    	
    
        System.out.println( "Hello World!" );
	}

}
