package co.pragra.learning.springiocjune012024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//@SpringBootApplication
public class SpringIocJune012024Application {

    public static void main(String[] args) {
        //SpringApplication.run(SpringIocJune012024Application.class, args);

        //Samsung s23 = new Samsung(new Cineplex());
        //s23.bookMovie();


//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Samsung s23 = context.getBean("samsung25",Samsung.class);
//        Samsung s24 = context.getBean("samsung25",Samsung.class);
//        Samsung s25 = context.getBean("samsung25",Samsung.class);
//        Samsung s26 = context.getBean("samsung25",Samsung.class);
//        System.out.println(s23);
//        System.out.println(s24);
//        System.out.println(s25);
//        System.out.println(s26);
//        //s23.bookMovie();
//        Samsung s1 = new Samsung(new Cineplex());
//        Samsung s2 = new Samsung(new Cineplex());
//        Samsung s3 = new Samsung(new Cineplex());
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        Samsung samsung26 = context.getBean("samsung26", Samsung.class);
//        System.out.println(samsung26.getModel());


        ApplicationContext context = new AnnotationConfigApplicationContext(co.pragra.learning.springiocjune012024.config.AppConfig.class);
        Samsung samsung = context.getBean("samsung25",Samsung.class);
        Cineplex cineplex = context.getBean(Cineplex.class);
        System.out.println(cineplex);
        System.out.println(samsung);


    }

}
