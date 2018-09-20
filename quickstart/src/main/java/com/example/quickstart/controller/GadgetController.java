package com.example.quickstart.controller;



import com.example.quickstart.DAO.ResDAO;
import com.example.quickstart.entity.Author;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GadgetController {


    @Resource
    private ResDAO resDAO;



    @GetMapping("gadget")
    public String getAll(ModelMap map){
        List<Author> authorList = resDAO.getAuthors();


        map.addAttribute("authorList",authorList);


        return "gadget";
    }






//    @GetMapping("gadget")
//    public String gadget(ModelMap map){
//
//        Author author1 = new Author();
//        Author author2 = new Author();
//
//        List<Author> authorList = new ArrayList<>();
//
//        author1.setAvatar("11.jpg");
//        author1.setDate("9.24");
//        author1.setName("312");
//
//        authorList.add(author1);
//        map.addAttribute("authorList",authorList);
//
//        return "gadget";
//
//    }



}
