package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("/getBotInfo/")
    @CrossOrigin
    public Map<String,String> getInfo(){
        Map map = new HashMap();
        map.put("name","xty");
        map.put("rating","2500");
        map.put("name","yxc");
        map.put("rating","2400");
        return map;
    }
}
