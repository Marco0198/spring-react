/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oroafrica.demo.controllers;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author mtshimanga
 */
@RestController
public class homeController{
   
@RequestMapping("/")  
public String hello()   
{  
return "Hello marco";  
}

}
