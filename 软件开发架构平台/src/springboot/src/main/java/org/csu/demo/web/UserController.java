package org.csu.demo.web;

import org.csu.demo.domain.User;
import org.csu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user/")
@Validated
@SessionAttributes(value = {"loginUser","userList"})
public class UserController {

    @Autowired
    private UserService userService;
    private User loginUser;
    private List<User> userList;

    @GetMapping("/loginForm")
    public String loginForm(){
        return "login";
    }

    @PostMapping("/login")
    public String login(
            @Validated @ModelAttribute User user,
            BindingResult bindingResult,
            Model model){
        StringBuilder validationMsg = new StringBuilder();
        if (bindingResult.hasErrors()) {
            //字段校验错误
            for (ObjectError error : bindingResult.getAllErrors()) {
                validationMsg.append(error.getDefaultMessage());
                validationMsg.append(",");
            }
            model.addAttribute("loginMsg", validationMsg.substring(0, validationMsg.length() - 1));
            return "login";
        }else{
            loginUser = userService.login(user);
            if (loginUser == null) {
                //登录失败
                model.addAttribute("loginMsg",userService.getMsg());
                return "login";
            }else{
                //登录成功
                model.addAttribute("loginUser",loginUser);
                userList = userService.getAllUserInfo();
                model.addAttribute("userList",userList);
                return "main";
            }
        }
//        System.out.println(user.getUsername() + " " + user.getPassword());
//        model.addAttribute("loginMsg", "用户名或密码错误");
//        return "login";
    }

    // 参数校验：用对象来取值，通过Validated开启，，咱对象中打上注解，表示要校验什么内容，以及什么事情。
    // 最后错误的信息，在Controller里面用bindingResult来获取
//    @PostMapping("/login")
//    public String login(
//            @Validated @ModelAttribute User user,
//            BindingResult bindingResult,
//            Model model){
//        StringBuilder validationMsg = new StringBuilder();
//        if (bindingResult.hasErrors()) {
//            for (ObjectError error : bindingResult.getAllErrors()) {
//                validationMsg.append(error.getDefaultMessage());
//                validationMsg.append(",");
//            }
//            model.addAttribute("loginMsg", validationMsg.substring(0, validationMsg.length() - 1));
//        }
//        System.out.println(user.getUsername() + " " + user.getPassword());
////        model.addAttribute("loginMsg", "用户名或密码错误");
//        return "login";
//    }


    //单个的或不多的参数，可以用RequestParam,加上NotBlank之类的注解。
    // 接下来在WebMvcConfig中用一个配置太开启，接着用一个全局的异常处理来处理信息


//    最后一种方式就是什么都不要，用if...else解决



//    @PostMapping("/login")
//    public String login(@RequestParam("username") @NotBlank(message = "用户名不能为空") String username,
//                        @RequestParam("password") @NotBlank(message = "密码不能为空") String password,
//                        Model model){
//        System.out.println(username + "," + password);
//        return "login";
//    }
}
