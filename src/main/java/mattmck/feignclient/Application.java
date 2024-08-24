package mattmck.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.event.EventListener;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableFeignClients
@Slf4j
public class Application {

	@Autowired
	public MyFeignClient client;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
    	
    	log.debug("START");
    	//log.debug("results={}", client.getObjects());
    	log.debug("results={}", client.getObjectById("1"));
    	log.debug("FINISH");
    }
    
}
