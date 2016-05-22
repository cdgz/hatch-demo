import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Main {
    private static final Log log = LogFactory.getLog("greeter");

    @RequestMapping("/")
    String home() {
        log.info("Current time is " + System.currentTimeMillis());
        return "Hello World! Time is " + System.currentTimeMillis();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}