package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact</title>\n");
      out.write("           <link id=\"theme\" rel=\"stylesheet\"  href=\"css/style.css\"  />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        <div class=\"contact-page\">\n");
      out.write("  <div class=\"form\">\n");
      out.write("  \t\n");
      out.write("\t<h1><b>SB Events</b></h1>\n");
      out.write("\t<b>Owner Name  : Samiksha Bhagade<br>\n");
      out.write("\tMobile No      : 9021098781 / 8765452313<br>\n");
      out.write("\tCompany Address    : 101 E. SB Events<br>Mahad, 402301-Raigad</b><br><br>\n");
      out.write("\n");
      out.write("\t<label for=\"fname\"><em><b>Submit Feedback</b></em></label><br>\n");
      out.write("  <input type=\"text\" id=\"Feedback\" name=\"Feedback\"><br>\n");
      out.write("\n");
      out.write("  <button type=\"submit\" formaction=\"Home.jsp\">Submit</button><br><br>\n");
      out.write("\t <a href=\"Home.jsp\" >Do visit to our website!!!...</a>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
