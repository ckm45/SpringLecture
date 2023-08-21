package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MethodController2 {

    @GetMapping("/method/method")
    public String get() {
        return "method/methodForm";

    }

    @PostMapping("/method/method")
    public String post() {
        System.out.println("post 요청 받았어요.");
        return "method/methodProcess";  
    }
}
