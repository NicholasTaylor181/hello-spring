package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

//@RequestMapping("hello")
public class HelloController {


//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";

    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";

    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    public String createMessage(@RequestParam String name, String language) {
//        if (language.equals("english")) {
//            return "Hello, " + name + "!";
//        }else if(language.equals("japanese")) {
//            return "Ohayo, " + name + "!";
//        }else if(language.equals("german")) {
//            return "Hallo, " + name + "!";
//        }else if(language.equals("italian")) {
//            return "Ciao, " + name + "!";
//        }else {
//            return "Zdrastvuyte, " + name + "!";
//        }
//
//    }

//    @GetMapping("form")
//    public String helloForm() {
//        return "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" +
//                "<input type='text' name='name'>" +
//                "<select name='language'>" +
//                "<option value='english'>English</option>" +
//                "<option value='japanese'>Japanese</option>" +
//                "<option value='german'>German</option>" +
//                "<option value='italian'>Italian</option>" +
//                "<option value='russian'>Russian</option>" +
//                "</select>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "<html>";

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
}
