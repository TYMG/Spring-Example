package green.com.model;

/**
 * 
 * https://stackoverflow.com/questions/25232034/spring-how-to-use-non-default-constructor-when-auto-wiring-a-prototype-bean-usi
 * 
 * @author GreenMachine
 *
 */

//@Scope("prototype")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
	private Long id;
    private String content;

    public Message(){
    	this.id =null;
    	this.content = null; 
    }

    public Message(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id){
    	this.id =  id;
    }

    public String getContent() {
        return content;
    }
	public void setContent(String content) {
		this.content = content;
	}
}
