package com.spring.http_interface.client;

import com.spring.http_interface.model.Post;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

@HttpExchange("/posts")
public interface HttpInterfacePostClient {

    @GetExchange
    List<Post> getPosts();

    @PostExchange
    Post createPost(@RequestBody Post post);
}
