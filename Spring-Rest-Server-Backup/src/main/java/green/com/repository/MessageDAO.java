package green.com.repository;

import java.util.List;

import green.com.model.Message;

public interface MessageDAO {
	public Message createMessage(Message message);
	public Message getMessage(int id);
	public List<Message> getAllMessages();
	
}
