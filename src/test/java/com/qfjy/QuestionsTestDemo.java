package com.qfjy;

import com.qfjy.dto.QuestionsDTO;
import com.qfjy.service.QuestionsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Classname QuestionsTestDemo
 * @Author guoweixin
 * @Description TODO
 * @Date 2019/9/2 17:36
 * @Created by Administrator
 */
public class QuestionsTestDemo {

    @Test
    public void t1(){
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring_core.xml");

        QuestionsService questionsService= ctx.getBean(QuestionsService.class);

        List<QuestionsDTO> list= questionsService.selectAll();
        for(QuestionsDTO q:list){
            System.out.println(q);
        }
    }

}
