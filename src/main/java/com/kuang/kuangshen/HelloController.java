package com.kuang.kuangshen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangguangtao
 * @date 2023/6/15
 * @apiNote
 */
@RequestMapping("/hello")
@RestController
public class HelloController {
    @RequestMapping("/test")
    public String hello(){
        return "hello word";
    }
}
