package org.csu.demo.web;

import org.csu.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    //    @RequestMapping(method = RequestMethod.GET)

    @GetMapping("/hello")  //user/hello
    @ResponseBody
    public String helloWorld(){
        return "Hello Spring MVC World!";
    }

    @GetMapping("/loginForm")
    public String loginForm(){
        return "login";
    }

//    @PostMapping("/login")
//    public String login(String username,String password){
//        System.out.println(username + " " + password);
//        return "/WEB-INF/jsp/login.jsp";
//    }

//    @PostMapping("/login")
//    public String login(@RequestParam("user1name") String username, @RequestParam("pass1word") String password){
//        System.out.println(username + " " + password);
//        return "/WEB-INF/jsp/login.jsp";
//    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user, Model model){
        System.out.println(user.getUsername() + " " + user.getPassword());
        model.addAttribute("loginMsg", "用户名或密码错误");
        return "login";
    }

}
