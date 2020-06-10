import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "HomepageController", urlPatterns = "/")
public class HomepageController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        Cookie username = null;

        for(int i = 0; i < cookies.length; i++) {
            if(cookies[i].getName().equals("userName")) {
                System.out.println("++++++++++++++++++++++++++++ Found userNSMKLKJLKJSLKJ +++++++++");
                username = cookies[i];
            }
        }

        if(username != null) {
            HttpSession session = request.getSession();
            String[] parts = username.getValue().split(":");
            session.setAttribute("username", parts[0]);
            session.setAttribute("password", parts[1]);
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
