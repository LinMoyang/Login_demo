package Login.controllers;

import Login.Form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;


@Controller
public class LoginController {


    @GetMapping("/")
    public String showForm(LoginForm loginForm) {
        return "login";
    }

    @PostMapping("/")
    public String validateLoginInfo(Model model, @Valid LoginForm loginForm,Map<String,Object> map) {
        if(!StringUtils.isEmpty(loginForm.getUserName())&&"123456".equals(loginForm.getPassword())){
            //Map和Model都可以往前台传送数据
            //map.put("user",loginForm.getUserName());
            model.addAttribute("user", loginForm.getUserName());
            return "home";
        }//StringUtils是一个工具类,包含isEmpty等方法
        else {
            model.addAttribute("msg","yonghu");
            //map.put("msg","用户名密码错误！");
            return "login";
        }
    }
}
