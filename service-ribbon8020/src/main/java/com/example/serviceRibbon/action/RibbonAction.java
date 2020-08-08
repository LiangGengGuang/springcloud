package com.example.serviceRibbon.action;

import com.example.serviceRibbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiangGengguang
 * @create 2020-01-20 16:04
 */

@RestController
public class RibbonAction {

    @Autowired
    RibbonService ribbonService;

    @GetMapping(value = "/action")
    public String action(@RequestParam String name) {
        return ribbonService.service(name);
    }
}
