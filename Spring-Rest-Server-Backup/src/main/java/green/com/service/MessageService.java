package green.com.service;

import java.util.List;

import green.com.model.Message;

public interface MessageService {

	public Message createMessage(Message message);
	public Message getMessage(int id);
	public List<Message> getAllMessage();
}
