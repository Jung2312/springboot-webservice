package org.springboot.web;

import lombok.RequiredArgsConstructor;
import org.springboot.service.posts.PostsService;
import org.springboot.web.dto.PostsResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// @RestController : @ResponseBody를 포함, 프론트에 전송할 필요가 없고 백에서만 데이터를 json으로 전송하고자 할 때 사용
// @Controller : 컨트롤러는 자신을 호출했던 클라 쪽으로 View와 Model을 별도로 반환

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }
    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }

}
