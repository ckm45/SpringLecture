package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/method/method")
@Controller
public class MethodController {

    // GET과 POST 방식의 두가지 handler 실습
    // /method/method 이 값으로 request가 들어오는데 GET 방식으로 들어올 것이다.
    //Chrome의 url : http://localhost:8080/springmvc/method/method
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        // view 이름을 return
        //view resolver의 역할 : /WEB-INF/jsp/method/methodForm.jsp
        return "method/methodForm";

    }

    @RequestMapping(method = RequestMethod.POST)
    public String post() {
        System.out.println("post 요청 받았어요.");
        return "method/methodProcess";  //view name return
        //WEB-INF/jsp/method/methodProcess.jsp
    }
}
