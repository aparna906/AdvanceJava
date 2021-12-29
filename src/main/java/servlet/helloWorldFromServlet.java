package servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class helloWorldFromServlet implements Servlet {
    ServletConfig config;
    //Servlet life cycle methods
    @Override
    public void init(ServletConfig config) {
         this.config=config;
        System.out.println("Object created");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        System.out.println("Service");
        servletResponse.setContentType("text/html");
        PrintWriter printWriter = servletResponse.getWriter();

        printWriter.println("<center><h1>Hello World </h1></center>");
        printWriter.println("<center>Displayed by Servlet</center>");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy servlet object");
    }

    //Non life cycle method

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public String getServletInfo() {
        return "Information";
    }
}
