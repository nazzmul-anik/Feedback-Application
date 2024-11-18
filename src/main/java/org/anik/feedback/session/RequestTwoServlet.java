package org.anik.feedback.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "servletTwo", value = "/servlet-two")
public class RequestTwoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        var writer = resp.getWriter();
        Cookie[] cookies = req.getCookies();
        StringBuilder builder = new StringBuilder();
        var isPresent = false;
        if(cookies != null){

            for(Cookie cookie : cookies){

                if(cookie.getName().equals("username")){
                    builder.append("<h2>UserName : "+cookie.getValue()+"</h2>");
                    isPresent = true;
                }else if(cookie.getName().equals("userId")){
                    builder.append("<h2>UserId : "+cookie.getValue()+"</h2>");
                }
            }
        }

        HttpSession session = req.getSession();
        String key = (String)session.getAttribute("userKey");
        builder.append("<h2>Secret Key = " + key + "</h2>");

        if(isPresent == false){
            writer.println("<h2>No username found in cookies.</h2>");
            writer.println("<h2>Username cookie is not there in request</h2>");
        }else{
            writer.println(builder);
        }
    }
}
