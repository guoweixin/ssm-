package com.qfjy.controller;

import com.qfjy.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname QuestionsController
 * @Author guoweixin
 * @Description TODO
 * @Date 2019/9/2 17:17
 * @Created by Administrator
 */
@Controller
@RestController
@RequestMapping("questions")
public class QuestionsController  {
    @Autowired
    private QuestionsService questionsService;

    /**
     * 查询所有的问题和选项
     * @return
     */
    @RequestMapping("all") //questions/all
    public Object selectAll(){
       Map<String,Object> map=new HashMap<>();
       map.put("questions",questionsService.selectAll());
        return map;
    }

}
