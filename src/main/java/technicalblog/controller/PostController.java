package technicalblog.controller;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Posts;
import technicalblog.service.PostService;

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
