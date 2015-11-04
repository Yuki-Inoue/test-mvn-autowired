package my.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
        try(ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("context.xml")) {
            ChildClass appBean = context.getBean(ChildClass.class);
            String genericString = appBean.getBaseFieldClass().getClass().toGenericString();
            System.out.println(genericString);
        }
    }

}
