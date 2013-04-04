package org.jvnet.hudson.plugins.cors;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Add CORS header to resonse.
 * 
 * @author Jochen Hinrichsen
 */
public class JenkinsCorsFilter implements Filter {

	private static final String ORIGIN = System.getProperty("cors.origin");

    /** {@inheritDoc} */
    public void init(FilterConfig filterConfig) throws ServletException {}

    /** {@inheritDoc} */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (response instanceof HttpServletResponse) {
            final HttpServletResponse resp = (HttpServletResponse) response;
            resp.addHeader("Access-Control-Allow-Origin", (null == ORIGIN ? "*" : ORIGIN));
        }
        chain.doFilter(request, response);
    }

    /** {@inheritDoc} */
    public void destroy() {}
}