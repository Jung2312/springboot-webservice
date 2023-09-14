package org.springboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @RestController : @ResponseBody를 포함, 프론트에 전송할 필요가 없고 백에서만 데이터를 json으로 전송하고자 할 때 사용
// @Controller : 컨트롤러는 자신을 호출했던 클라 쪽으로 View와 Model을 별도로 반환

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
}
