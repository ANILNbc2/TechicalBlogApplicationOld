package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.Service.PostService;
import technicalblog.model.Posts;


import java.util.ArrayList;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("posts")
    public String getUserPost(Model model){
        ArrayList<Posts> onePost = postService.getOnePost();
        model.addAttribute("posts",onePost);
        return "posts";
    }
}
