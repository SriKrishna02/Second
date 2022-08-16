package com.java.employee;




import javax.persistence.*;

public class EmployDetail {

  public static void main(String args[])

  {

    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employ_details");

    EntityManager em=emf.createEntityManager();

    EmployEntity s=em.find(EmployEntity.class,10);

    System.out.println("Employ id = "+s.getE_id());

    System.out.println("Employ Name = "+s.getE_name());

    System.out.println("Employ Salary = "+s.getE_sal());

  }

}