package com.example.homework.controller;



import com.example.homework.mapper.AccountMapper;
import com.example.homework.model.Account;
import com.test.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController
{
    @Autowired
    private LoginService loginService;

    @Autowired
    private AccountMapper accountMapper;


    @GetMapping("/")
    public String page() {

        return "login";
    }
    @GetMapping("/logic")
    public String showpage() {

        return "register";
    }
    //注册
    @PostMapping("/user/register")
    public String register(
            @RequestParam("school") String school,
            @RequestParam("number") String number,
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("address") String address,
            @RequestParam("wechat") String wechat,
            @RequestParam("job") String job
    ){
      loginService.list(school,number,username,password,address,wechat,job);
        return "login";

    }
    //登录
    @PostMapping("/user/login")
    public String login(
            @RequestParam("number") String number,
            @RequestParam("password") String password,
            Model model){
        Account user =accountMapper.selectByPrimaryKey(number);
        System.out.println("user"+user);
        if (user == null){
            model.addAttribute("message","用户不存在");
            System.out.println("0.0.0.0.0");
            return "error";
        }else {
            String pwd =user.getPassword();
            if (pwd.equals(password)){
                model.addAttribute("message","登录成功");
                System.out.println("0101011");
                return "success";
            }else {
                model.addAttribute("message","密码错误");
                return "error";

            }
        }
    }
}
