package com.jindo.core.business;

import com.jindo.core.model.Page;
import com.jindo.core.model.User;

/**
 * @author ManhKM on 9/5/2022
 * @project spring-boot-log4j2
 */
public class PageVisitor {

  public void visit(User user, Page page){
    System.out.println(user + " visited "+ page);
  }
}
