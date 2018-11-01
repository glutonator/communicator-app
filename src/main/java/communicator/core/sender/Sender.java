package communicator.core.sender;

import communicator.core.messages.MessageCustom;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

public class Sender {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    @Qualifier("queueHelloWord")
    private Queue queue;


    //    @Value("#{'${starting_count}'}")  // or
    @Value("${starting_count}")
    private int count;

    @Value("wiadomosc")
    private String message;

    private List<String> messageList;

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send() {
        String tmpMessage = "Hello World! " + count + " " + message;
        MessageCustom tmp =  new MessageCustom("Hello World!",44,33.45);
//        this.template.convertAndSend(queue.getName(), tmpMessage);
        this.template.convertAndSend(queue.getName(), tmp);
        System.out.println(" [x] Sent '" + tmpMessage + "'");
        count++;
    }

    public void send222() {
        for (String message : messageList) {
            this.template.convertAndSend(queue.getName(), message);
        }

    }

    //    @Autowired
    @Qualifier("message")
    public void setMessage(String message) {
        this.message = message;
    }


}
