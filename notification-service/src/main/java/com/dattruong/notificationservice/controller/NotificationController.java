package com.dattruong.notificationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
	
   @GetMapping("/")	
   public String getAll() {
	   return "Hello notification";
   }
}
