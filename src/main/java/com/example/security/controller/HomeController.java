package com.example.security.controller;

import com.example.security.domain.LoginModel;
import com.example.security.entity.SysUser;
import com.example.security.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private UserService service;

    @GetMapping("/user")
    public List<SysUser> index(){
        return service.getAll();
    }
    @GetMapping("/entity")
    public List<SysUser> entity(){
        return service.getAllUserEntity();
    }

    /**
     * 参数为Route 路径
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public SysUser getById(@PathVariable long id){
        return service.getById(id);
    }

    /**
     * 参数可以是UrlQuery 或者是 Form
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/user/check")
    public SysUser getById(String username,String password){
        logger.info("enter /user/check");
//        String username = map.get("username").toString();
//        String password = map.get("password").toString();
        return service.login(username,password);
    }


    /**
     * method = RequestMethod.GET  参数可以是UrlQuery
     * method = RequestMethod.POST   参数可以是Body 或者是 Form
     * @param model
     * @return
     */
    @RequestMapping(value = "/user/name")
    public SysUser getByname(LoginModel model){
        logger.info("enter /user/name");
        logger.info(model.getUsername());
//        String username = map.get("username").toString();
//        String password = map.get("password").toString();
        return service.getByUsername(model.getUsername());
    }

    /**
     * @RequestBody 数据来源必须是来源是 Body raw content-type= applacation/json
     * @param model
     * @return
     */

    @RequestMapping("/user/body")
    public SysUser getByJsonBody(@RequestBody LoginModel model){
        logger.info("enter /user/body");
        logger.info(model.getUsername());
//        String username = map.get("username").toString();
//        String password = map.get("password").toString();
        return service.getByUsername(model.getUsername());
    }

    /**
     *  参数为Xml 如果使用 需启动config/XmlMessageConvertConfig
     *  目前 为解决就Json 和Xml 格式共存的问题
     *  数据来源为 Body
     * @param model
     * @return
     */
    @RequestMapping(value = "/user/xml",consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public SysUser getByXml(@RequestBody LoginModel model){
        logger.info("enter /user/xml");
        logger.info(model.getUsername());
//        String username = map.get("username").toString();
//        String password = map.get("password").toString();
        return service.getByUsername(model.getUsername());
    }
}
