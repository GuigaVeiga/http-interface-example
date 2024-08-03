package com.spring.http_interface.client;

import com.spring.http_interface.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "postClient", url = "http://example.com")
public interface FeignPostClient {

    @GetMapping("/posts")
    List<Post> getPosts();

    @PostMapping("/posts")
    Post createPost(@RequestBody Post post);
}
