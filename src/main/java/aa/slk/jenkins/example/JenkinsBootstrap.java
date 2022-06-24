package aa.slk.jenkins.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/jenkins/example")
public class JenkinsBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(JenkinsBootstrap.class, args);
        System.out.println(ac.getBeanDefinitionNames()[0]);
    }

    @GetMapping("/sayHi")
    public String sayHi(){
    	return "json return msg：" + JenkinsBootstrap.class.getSimpleName()+"...";
    }
}
