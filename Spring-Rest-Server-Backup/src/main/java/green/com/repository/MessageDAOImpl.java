package green.com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import green.com.model.Message;

@Repository("messageDao")
public class MessageDAOImpl implements MessageDAO {

	private List<Message> listOfMessages;
	private Long messageCounter;
	
	public MessageDAOImpl(){
		messageCounter = 1L;
		listOfMessages = new ArrayList<Message>();
		listOfMessages.add(new Message(messageCounter++,"Hello World"));
		listOfMessages.add(new Message(messageCounter++,"Did you get my last message?"));
		listOfMessages.add(new Message(messageCounter++, "Did you get that thing I sent you?"));
	}
	
	@Override
	public Message createMessage(Message message) {	
		if(message.getId()!=null){
			message.setId(this.messageCounter);
		}
		if(listOfMessages.add(message)){
			return message;
		}
		return null;
	}

	@Override
	public Message getMessage(int id) {
		// TODO Auto-generated method stub
		return listOfMessages.get(id);
	}

	@Override
	public List<Message> getAllMessages() {
		return listOfMessages;
	}

}
