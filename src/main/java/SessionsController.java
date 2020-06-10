import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "SessionsController", urlPatterns = "/sessions")
public class SessionsController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();
        session.setAttribute("username", email);
        session.setAttribute("password", password);

        Cookie c = new Cookie("userName", String.format("%s:%s", email, password));
        response.addCookie(c);

        response.sendRedirect("/dashboard/");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
}
