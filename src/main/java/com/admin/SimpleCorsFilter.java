//package com.admin;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//
//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class SimpleCorsFilter implements Filter {
//
//	public static final Logger logger = LoggerFactory.getLogger(SimpleCorsFilter.class);
//	
//    public SimpleCorsFilter() {
//    }
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//        logger.info("In doFilter()");
//    	HttpServletResponse response = (HttpServletResponse) res;
//        HttpServletRequest request = (HttpServletRequest) req;
//        response.setHeader("Access-Control-Allow-Origin", "*"); //request.getHeader("Origin")
//		response.setHeader("Access-Control-Allow-Credentials", "true");
//		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
//		response.setHeader("Access-Control-Max-Age", "3600");
//		response.setHeader("Access-Control-Allow-Headers",
//				"Content-Type, Accept, X-Requested-With, remember-me, Authorization, x-auth-token");
////		response.setHeader("Content-Security-Policy","img-src http://*; child-src 'self'frame-ancestors 'self' http://10.210.17.62");
////		response.setHeader("Content-Security-Policy","default-src 'self';child-src 'self';frame-src 'self';frame-ancestors 'self'");
//		response.setHeader("Content-Security-Policy","default-src 'self';child-src 'self';frame-src 'self'");
//		response.setHeader("x-frame-options","SAMEORIGIN");
//		
//        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
//            response.setStatus(HttpServletResponse.SC_OK);
//        } else {
//            chain.doFilter(req, res);
//        }
//    }
//
//    @Override
//    public void init(FilterConfig filterConfig) {
//    }
//
//    @Override
//    public void destroy() {
//    }
//}
