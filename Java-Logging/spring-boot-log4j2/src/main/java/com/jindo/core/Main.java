package com.jindo.core;

import com.jindo.core.business.PageVisitor;
import com.jindo.core.log.LogFactory;
import com.jindo.core.model.Page;
import com.jindo.core.model.User;
import org.apache.log4j.Logger;

/**
 * @author ManhKM on 9/5/2022
 * @project spring-boot-log4j2
 * -----
 * Nếu sử dụng mỗi console thì có thể sẽ bị tràn màn hình log
 * Cần có cơ chế logging để check được activity của EndUser
 * -----
 * Có thể thay đổi format cho định dạng log ra ngoài file
 *
 */
public class Main {

    public static final Logger logger = LogFactory.getLogger();

    public static void main(String[] args) {
        Page page = new Page("HomePage", "http://fresher.academy");
        User[] users = new User[2022];
        for(int i = 0; i < users.length; i++){
            users[i] = new User("User_" + i);
            System.out.println(users[i] + " signed in " + page);
            logger.info(users[i] + " signed in " + page);
        }

        PageVisitor pageVisitor = new PageVisitor();
        int index = 0;
        while (true){
            index = (int) Math.round(Math.random() * 2021);
            pageVisitor.visit(users[index], page);
        }
    }

}
