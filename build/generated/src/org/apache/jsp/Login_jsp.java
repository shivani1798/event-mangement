package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("       <link id=\"theme\" rel=\"stylesheet\"  href=\"css/style.css\"  />\r\n");
      out.write("      \r\n");
      out.write("    <title>Login Form</title>    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(" </head>\r\n");
      out.write("  <body> \r\n");
      out.write("      <div class=\"login-page\">\r\n");
      out.write("  <div class=\"form\">\r\n");
      out.write("  \t<center>\r\n");
      out.write("\t<h1><b>User Login</b></h1>\r\n");
      out.write("</center>\r\n");
      out.write("      <form  name=\"loginform\" action=\"LoginServlet\" method=\"post\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("      <input type=\"text\" placeholder=\"Username\" required=\"Username\">\r\n");
      out.write("      <input type=\"Password\" placeholder=\"Password\" required=\"Password\">\r\n");
      out.write("    \r\n");
      out.write("       <button type=\"submit\">Login</button>\r\n");
      out.write("     <p class=\"message\">Create Account<a href=\"Registration.jsp\">Login</a></p>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$('.message a').click(function(){\r\n");
      out.write("   $('form').animate({height: \"toggle\", opacity: \"toggle\"}, \"slow\");\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
