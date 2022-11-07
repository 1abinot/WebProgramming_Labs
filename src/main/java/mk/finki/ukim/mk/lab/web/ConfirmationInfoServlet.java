package mk.finki.ukim.mk.lab.web;

import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "confirmationInfo", urlPatterns = "/ConfirmationInfo")
public class ConfirmationInfoServlet extends HttpServlet {
    private final SpringTemplateEngine templateEngine;

    public ConfirmationInfoServlet(SpringTemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext context = new WebContext(req, resp, req.getServletContext());
        context.setVariable("clientName",req.getSession().getAttribute("clientName"));
        context.setVariable("clientAddress", req.getSession().getAttribute("clientAddress"));

        context.setVariable("balloonColor",req.getSession().getAttribute("balloonColor"));
        context.setVariable("balloonSize", req.getSession().getAttribute("balloonSize"));
        context.setVariable("IPAddress",req.getRemoteAddr());
        context.setVariable("userAgent", req.getHeader("User-Agent"));
        this.templateEngine.process("confirmationInfo", context, resp.getWriter());
    }
}
