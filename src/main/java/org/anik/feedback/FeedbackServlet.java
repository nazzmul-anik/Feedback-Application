package org.anik.feedback;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "feedbackForm", value = "/feedback")
public class FeedbackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String message = req.getParameter("message");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h2>Feedback Servlet Working.</h2>");
        writer.println(""+

                "<h3>Your form details that you have submitted.</h3>" +
                "<h3>Email Address = %s </h3>".formatted(email) +
                "<h3>Phone Number = %s </h3>".formatted(phone) +
                "<h3>Message = %s </h3>".formatted(message)
        );
    }
}
