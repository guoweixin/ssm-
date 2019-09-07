package com.qfjy;

import com.qfjy.dto.QuestionsDTO;
import com.qfjy.service.QuestionsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Classname QuestionsServiceTest
 * @Author guoweixin
 * @Description TODO
 * @Date 2019/9/2 17:14
 * @Created by Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring_core.xml"})
public class QuestionsServiceTest {
    @Autowired
    private QuestionsService questionsService;

    @Test
    public void t1(){
       List<QuestionsDTO> list= questionsService.selectAll();
       for(QuestionsDTO q:list){
           System.out.println(q);
       }
    }
}
