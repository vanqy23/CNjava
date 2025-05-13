package kiemtra;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class kiemtranhietdo implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String temp = request.getParameter("temperature");

        try {
            Double.parseDouble(temp);
            chain.doFilter(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Vui lòng nhập số hợp lệ!");
            request.getRequestDispatcher("bai3.jsp").forward(request, response);
        }
    }
}
