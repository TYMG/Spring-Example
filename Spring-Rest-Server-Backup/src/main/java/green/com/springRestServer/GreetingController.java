package green.com.springRestServer;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import green.com.model.Message;
import green.com.service.MessageService;

/***
 * Notes:
 * https://www.leveluplunch.com/java/tutorials/014-post-json-to-spring-rest-webservice/
 * 
 * @author GreenMachine
 *
 */
@RestController
public class GreetingController {
	
	@Autowired
	private MessageService messageService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "string";
    }
    
    
    @RequestMapping(value = "/messages" , method = RequestMethod.GET)
    public ResponseEntity<List<Message>> retrieveAllMessages(){
    	return new ResponseEntity<>(messageService.getAllMessage(),HttpStatus.OK);
    }
    
    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public ResponseEntity<Message> createMessage(@RequestBody Message message){
    	Message daoMessage = messageService.createMessage(message);
    	if(daoMessage != null){
        	return new ResponseEntity<>(daoMessage,HttpStatus.OK);
    	}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @RequestMapping(value = "/messages/{id}" , method = RequestMethod.GET)
    public ResponseEntity<Message> retrieveMessage(@PathVariable("id") Integer id){
    	if(id != null){
    		return new ResponseEntity<>(messageService.getMessage(id),HttpStatus.OK);
    	}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}