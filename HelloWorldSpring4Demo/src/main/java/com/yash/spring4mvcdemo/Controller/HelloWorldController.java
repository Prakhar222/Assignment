package com.yash.spring4mvcdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
//@RequestMapping("/simpleapp")
public class HelloWorldController {
@RequestMapping("hello")
public String sayHelloWorld(ModelMap model){
model.addAttribute("greeting","Hi! Hello From Spring4 MVC");
return "welcome";
}
@RequestMapping("helloagain")
public String sayHelloWorldAgain(ModelMap model){
model.addAttribute("greeting", "Hi! Again Hello from Spring 4 MVC");
return "welcome";
}
}
