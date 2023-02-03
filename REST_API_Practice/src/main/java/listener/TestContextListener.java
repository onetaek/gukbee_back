package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import listener.BookDTO;

/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
@WebListener
public class TestContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TestContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("TestContextListener 종료되었습니다.");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         ServletContext ctx = sce.getServletContext();
         BookDTO mybook = new BookDTO("자바 정복","황희성",20000,"출판사");
         ctx.setAttribute("book", mybook);
         System.out.println("TestContextListener 초기화 되었습니다.");
    }
	
}
