package limdae.com.clover.controller;

import limdae.com.clover.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostController {

    // Http Method
    // GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT 특징 다 알아야 한다.
    // POST Method

    // 요청 방법 1
//    @PostMapping("/posts")
//    public String post(
//            @RequestParam(name = "title") String title,
//            @RequestParam(name = "content") String content) {
//        log.info("title = {}, content={}", title, content);
//        return "Hello World";
//    }

    // 요청 방법 2
//    @PostMapping("/posts")
//    public String post(@RequestParam Map<String, String> params) {
//        log.info("params = {}", params);
//        return "Hello World";
//    }

    // 요청 방법 3
    @PostMapping("/posts")
    public String post(@RequestBody PostCreate params) {
        log.info("params = {}", params.toString());
        return "Hello World";
    }
}
