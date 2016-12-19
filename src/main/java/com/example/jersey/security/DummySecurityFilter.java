package com.example.jersey.security;

import com.example.jersey.data.BaseDao;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.*;
import java.io.IOException;

public class DummySecurityFilter implements Filter {

    private final BaseDao dao;

    public DummySecurityFilter(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        this.dao.setRandomValue(authentication == null ? "Not Authenticated" : authentication.getName());

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {}
}
