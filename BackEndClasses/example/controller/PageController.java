package com.example.controller;
import com.example.util.GetSessionUtil;
import com.example.util.SetSessionUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
@RequestMapping("/pages")
//@SessionAttributes(value = { "key" })
public class PageController {

    @RequestMapping("/")
    public String toJump(){
        return "pages/login.html";
    }


}









//    @RequestMapping( "/JumpTo")
//    public String valueTransit(String studentName,HttpServletRequest request){
//        SetSessionUtil.setSession(request, "studentName",studentName);
//        return "pages/index.html";
//
//    }
//    @RequestMapping("/JumpToPersonDetailPage")
//    public String JumpToDetailPage(String studentName,HttpServletRequest request){
//        return "pages/PersonalDetail.html";
//    }

//    @RequestMapping( "/JumpTo")
//    public String valueTransit(String studentName, Map<String,Object> map){
//        System.out.println("valueTransit...");
//        System.out.println(studentName);
//        map.put("key", studentName);
//        return "pages/index.html";
//
//
//    }


//    @RequestMapping("/Index")
//    public String goIndex(){
//        System.out.println("goIndex...");
//        return "pages/index.html";
//    }



//    @GetMapping("/redirect/{id}")
//    public void redirect(@PathVariable("id") String id, HttpServletResponse resp) throws IOException {
//        String redirectUri = "http://www.baidu.com";
//        resp.sendRedirect(redirectUri);
//    }

//    @RequestMapping("/Hi")
//    public String index() {
//        return "redirect:/pages/index.html";
//    }


