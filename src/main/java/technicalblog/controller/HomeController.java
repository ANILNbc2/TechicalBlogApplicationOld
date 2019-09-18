package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.Service.PostService;
import technicalblog.model.Posts;
import technicalblog.service.PostService;

import java.util.ArrayList;
import java.util.Date;


@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model){
        ArrayList<Posts> posts = postService.getAlllPost();
        model.addAttribute("posts", posts);

        return "index";
    }
}
