package com.example.controller;

import com.example.vo.UserReturnVO;
import com.example.vo.UserVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;



@RestController
public class HelloController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/hello")
    public Object hello( @RequestBody UserVO obj) {
        obj.fn();
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT * FROM user");

        UserReturnVO obj2 = new UserReturnVO(300, "gho");
        return obj2;
    };

    @RequestMapping("/test/{id}")
    public String m05(@PathVariable String id) {
        System.out.println("id = " + id);
        return id;
    }

    /**
     * 如果业务控制器的方法有参数，则方法中的参数就是可以接收url的传参
     * @RequestParam
     * 1. required：是否必须要有这个参数
     * 2. value: 定义url的参数名称
     * 3. defaultValue：定义参数的默认值
     * @param id
     * @return
     */
    @RequestMapping("/m02")
    public String m02(@RequestParam(required=true,defaultValue="100") String id) {
        System.out.println("id = " + id);
        return id;
    }

    @RequestMapping("/mail")
    public void mail() {
       MailService b = new MailService();
       b.sendSimpleMail("806715216@qq.com", "title", "niubi");
    }
}
