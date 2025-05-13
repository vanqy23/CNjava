package kiemtra;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class demso implements ServletRequestListener {
    public void requestInitialized(ServletRequestEvent sre) {
        ServletContext context = sre.getServletContext();
        Integer count = (Integer) context.getAttribute("requestCount");
        if (count == null) count = 0;
        context.setAttribute("requestCount", count + 1);
    }

    public void requestDestroyed(ServletRequestEvent sre) {}
}
