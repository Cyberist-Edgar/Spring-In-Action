package cn.edgar.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String login(HttpSession session){
        // 可以从session中获取到上一次转过来的链接
        Enumeration<?> enumeration = session.getAttributeNames();
        while(enumeration.hasMoreElements()){
            String value = enumeration.nextElement().toString();
            System.out.println(session.getAttribute(value));
        }
        return "login";
    }
}
