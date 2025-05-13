package kiemtra;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@javax.servlet.annotation.WebServlet("/convert")
public class chuyendoi extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        String tempStr = request.getParameter("temperature");
        String type = request.getParameter("type");

        double temp = Double.parseDouble(tempStr);
        double result = 0;

        if ("CtoF".equals(type)) {
            result = temp * 9 / 5 + 32;
        } else if ("FtoC".equals(type)) {
            result = (temp - 32) * 5 / 9;
        }

        request.setAttribute("result", result);
        request.getRequestDispatcher("bai3.jsp").forward(request, response);
    }
}
