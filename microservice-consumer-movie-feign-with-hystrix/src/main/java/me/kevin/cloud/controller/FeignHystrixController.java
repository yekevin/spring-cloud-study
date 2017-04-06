package me.kevin.cloud.controller;

import me.kevin.cloud.entity.User;
import me.kevin.cloud.feign.UserFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin
 * @description
 * @date 2017/4/6
 */
@RestController
public class FeignHystrixController {

    @Autowired
    private UserFeignHystrixClient userFeignClient;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        User user = this.userFeignClient.findByIdFeign(id);
        return user;
    }
}
