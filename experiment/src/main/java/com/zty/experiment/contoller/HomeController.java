package com.zty.experiment.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version V1.0
 * @ClassName: com.zty.experiment.contoller.HomeController.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-04-01 13:17
 * @Description: 跳转主页
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "experiment";
    }
}
