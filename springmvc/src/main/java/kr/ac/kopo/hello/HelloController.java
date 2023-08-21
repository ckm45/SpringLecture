package kr.ac.kopo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    
    public HelloController() {
        System.out.println("helloController 생성자입니다.");
    }
    
    
    
    // handler 생성
    // method, client 가 요청 하면, 요청을 받아주는 것

    // http://localhost:8080/springmvc + "/hello/hello" 라는 요청이 왔을 때 실행
    @RequestMapping("/hello/h1")
    public ModelAndView hello() {

        ModelAndView mav = new ModelAndView("/hello/hello");
        mav.addObject("msg","HelloWorld");
        //key : value로 object를 집어넣는다 
        //jsp에서 이 값을 꺼내서 가져올 수 있다.
        return mav;

    }

    @RequestMapping("/hello/test")
    public ModelAndView hellotest() {
        ModelAndView mav = new ModelAndView("/hello/testHello");
        return mav;
    }
}
