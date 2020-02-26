package life.codeworker.qzyh.qzyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.PublicKey;

@Controller
public class HelloController {

    @GetMapping("/greeting")
    public  String greeting(@RequestParam(name = "name", defaultValue = "czc") String name, Model model){
        model.addAttribute("name",name);
        return "sy";

    }

    @GetMapping("/haha")
    public  String say(@RequestParam(value="h",defaultValue="abc")String name, Model model){
        model.addAttribute("name",name);
        return "sy";
    }
}











