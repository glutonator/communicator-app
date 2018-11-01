package communicator.core;

import communicator.core.config.Config;
import org.apache.log4j.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {

        System.out.println("communicator/core");
        logger.info("Hello World");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();

//        ctx.close();

    }

}
