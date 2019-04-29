package guru.springframework.didemo;

import guru.springframework.didemo.Controllers.ConstructorInjectedController;
import guru.springframework.didemo.Controllers.MyController;
import guru.springframework.didemo.Controllers.PropertyInjectedController;
import guru.springframework.didemo.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");



        System.out.println(controller.hello());
     //   System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
     //   System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
     //   System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}