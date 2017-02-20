package com.ghost.web.controller;

import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("testController")
@RequestMapping("/test")
public class TestController{

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);
    
    @RequestMapping("/index.htm")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("num", 12.3);
        mv.addObject("name", "王姐姐");
        mv.addObject("dataTime", new Date());
        request.setAttribute("age", 100);
        request.getSession().setAttribute("sex", "男");
        request.getSession().getServletContext().setAttribute("phone", "15067190130");
        LOG.trace("-------------------------- this is a simple test");
        LOG.debug("-------------------------- this is a simple test");
        LOG.info("-------------------------- this is a simple test");
        LOG.warn("-------------------------- this is a simple test");
        LOG.error("-------------------------- this is a simple test");
        return mv;
    }
}
