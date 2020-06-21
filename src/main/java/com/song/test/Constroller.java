package com.song.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Constroller {
    @RequestMapping("/cao")
    @ResponseBody
    public String index(){
        return "index";
    }
}
