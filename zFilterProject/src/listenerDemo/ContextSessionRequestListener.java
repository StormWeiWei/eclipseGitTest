package listenerDemo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ContextSessionRequestListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {

    
    public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("监听session对象创建完成");
    }

	
    public void requestDestroyed(ServletRequestEvent arg0)  { 
        System.out.println("监听request对象销毁完成");
    }

	
    public void requestInitialized(ServletRequestEvent arg0)  { 
         System.out.println("监听request对象创建完成");
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
        System.out.println("监听session对象销毁完成");
    }

	
    public void contextDestroyed(ServletContextEvent arg0)  { 
        System.out.println("监听context对象销毁完成");
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
         System.out.println("监听context对象创建完成");
    }
	
}
