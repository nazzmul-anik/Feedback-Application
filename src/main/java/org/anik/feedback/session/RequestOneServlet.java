package org.anik.feedback.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "servletOne", value = "/servlet-one")
public class RequestOneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = "Anik";
        String userId = "1234";

        Cookie cookie1 = new Cookie("username", username);
        Cookie cookie2 = new Cookie("userId", userId);
        cookie1.setMaxAge(60 * 10);
        cookie2.setMaxAge(60 * 5);
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);

        HttpSession session = req.getSession();
        session.setAttribute("userKey", "admin");
        session.setMaxInactiveInterval(10*60);


        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Cookie set successfully.</h2>");
    }
}
