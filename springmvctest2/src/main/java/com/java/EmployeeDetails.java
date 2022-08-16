package com.java;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EmployeeDetails {

@RequestMapping("/")

  public String display()

  {

 System.out.println("**************************");

    return "Krishna.jsp";

  }

}