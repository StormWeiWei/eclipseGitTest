package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class MySecondFilter
 */
public class MySecondFilter implements Filter {
	//Filter链的响应是通过web.xml中的顺序来决定的，哪个在前面，就先响应哪个Filter
	  // Filter链响应过程：先初始化两个Filter，然后是第一个Filter中的请求->第二个Filter中的请求->
		//Servlet的doget/dopost->第一个Filter中的响应->第二个Filter中的响应，这就形成了一条链
    
	public void destroy() {
		System.out.println("销毁02");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("拦截请求02");
	   chain.doFilter(request, response);
		System.out.println("拦截响应02");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("初始化init02");
		
	}

}
