package com.java.employee;

import javax.persistence.*;

@Entity

@Table(name="employee2")

public class EmployEntity {

  @Id

  private int e_id;

  private String e_name;

  private int e_sal;

  public EmployEntity(int e_id, String e_name, int e_sal) {

    super();

    this.e_id = e_id;

    this.e_name = e_name;

    this.e_sal = e_sal;

  }

  public EmployEntity() {

    super();

  }

 public int getE_id() {

 return e_id;

 }

 public void setE_id(int e_id) {

 this.e_id = e_id;

 }

 public String getE_name() {

 return e_name;

 }

 public void setE_name(String e_name) {

 this.e_name = e_name;

 }

 public int getE_sal() {

 return e_sal;

 }

 public void setE_sal(int e_sal) {

 this.e_sal = e_sal;

 }

}



