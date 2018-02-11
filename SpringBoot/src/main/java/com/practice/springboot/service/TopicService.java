package com.practice.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.springboot.entity.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic(
			1, "Shiva", "The ultimate defender"), new Topic(2, "Gita",
			"The Mythology")));

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public Topic getTopic(int id) {
		return topics.stream().filter(t -> t.getId() == (id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, int id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId() == id) {
				topics.set(i, topic);
			}
		}

	}

	public void deleteTopic(int id) {
		topics.removeIf(t -> t.getId() == id);
	}
}
