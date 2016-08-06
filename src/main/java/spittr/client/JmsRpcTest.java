package spittr.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.remoting.JmsInvokerProxyFactoryBean;
import spittr.entity.Spittle;

/**
 * Created by Administrator on 2016/8/6.
 */
public class JmsRpcTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/messaging-rpc.xml");
        JmsInvokerProxyFactoryBean proxyFactoryBean = context.getBean(JmsInvokerProxyFactoryBean.class);
        AlertService alertService = (AlertService) proxyFactoryBean.getObject();
        System.out.println(alertService.sendSpittleAlert(new Spittle("test", null)));
        context.close();
    }
}
