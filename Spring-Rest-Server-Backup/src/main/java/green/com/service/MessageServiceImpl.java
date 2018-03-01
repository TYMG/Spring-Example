package green.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import green.com.model.Message;
import green.com.repository.MessageDAO;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDAO messageDao;
	
	@Override
	public Message createMessage(Message message) {
		// TODO Auto-generated method stub
		return messageDao.createMessage(message);
	}

	@Override
	public Message getMessage(int id) {
		// TODO Auto-generated method stub
		return messageDao.getMessage(id);
	}

	@Override
	public List<Message> getAllMessage() {
		// TODO Auto-generated method stub
		return messageDao.getAllMessages();
	}

}
