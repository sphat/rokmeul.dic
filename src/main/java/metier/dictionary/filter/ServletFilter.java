package metier.dictionary.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.*;


public class ServletFilter implements Filter {

	private String encodage = "";
	
	public String getEncodage() {
		return encodage;
	}

	public void setEncodage(String encodage) {
		this.encodage = encodage;
	}

	/**
	 * This method is called by the web container to indicate to a filter that is being taken out of service.
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This methode is called by the container each time a request/response<br />
	 * pair is passed through the chain due to a client request for a resource<br />
	 * at the end of the chain.
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chaine) throws IOException, ServletException {
		// TODO Auto-generated method stub
		try{
			request.setCharacterEncoding(this.getEncodage());
		}catch(UnsupportedEncodingException ex){
			System.out.println(ex.toString());
		}
		chaine.doFilter(request, response);

	}

	/**
	 * This methode is called by the web container to indicate to a filter that<br />
	 * it is being placed into service.
	 */
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.setEncodage(config.getInitParameter("encoding"));
		System.out.println("Here is my encoding : " + this.getEncodage());
	}

}
