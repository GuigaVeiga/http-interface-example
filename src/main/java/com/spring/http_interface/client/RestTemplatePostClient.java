package com.spring.http_interface.client;

import com.spring.http_interface.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RestTemplatePostClient {

    @Autowired
    private RestTemplate restTemplate;

    public List<Post> getPosts() {
        ResponseEntity<List<Post>> response = restTemplate.exchange(
            "http://example.com/posts", HttpMethod.GET, null, 
            new ParameterizedTypeReference<List<Post>>() {}
        );
        return response.getBody();
    }

    public Post createPost(Post post) {
        return restTemplate.postForObject("http://example.com/posts", post, Post.class);
    }
}
