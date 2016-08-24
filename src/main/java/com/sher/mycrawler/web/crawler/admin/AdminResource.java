package com.sher.mycrawler.web.crawler.admin;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by cloudsher on 2016/7/11.
 */
@RestController
@RequestMapping("/admin")
public class AdminResource {


    @RequestMapping("/index")
    public ResponseEntity index(){

        return null;
    }

}
