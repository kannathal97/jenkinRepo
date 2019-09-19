package com.test.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topics> topicsList=new ArrayList<Topics>(Arrays.asList(
			new Topics("1","java"),
			new Topics("2","html")));

	public List<Topics> getTopicsList() {
		return topicsList;
	}

	public void setTopicsList(List<Topics> topicsList) {
		this.topicsList = topicsList;
	}
	
	public List<Topics> getTopics(){
		return topicsList;
	}
}
