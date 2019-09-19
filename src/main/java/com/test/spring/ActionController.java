package com.test.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

	@Autowired
	private TopicService ts;
	@RequestMapping("/topics")
	public List<Topics> getTopics(){
		return ts.getTopics();
	}
}
