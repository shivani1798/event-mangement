package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home</title>\n");
      out.write("         <link id=\"theme\" rel=\"stylesheet\"  href=\"css/style.css\"  /> \n");
      out.write("    </head>\n");
      out.write("        \n");
      out.write("<body> \n");
      out.write("<nav>\n");
      out.write("  <ul>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"#\">Home</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"About.jsp\">About</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"VenueBooking.jsp\">Venue Booking</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"Contact.jsp\">Contact</a>\n");
      out.write("</li>\n");
      out.write("  </ul>\n");
      out.write(" <center> <P><h2> Venue Designs </h2></P>\n");
      out.write("</center> \n");
      out.write("</nav> \n");
      out.write("\n");
      out.write("<div id=\"slider\">\n");
      out.write("<figure>\n");
      out.write("<img src=\"wed2.jpg\" alt>\n");
      out.write("<img src=\"bd2.jpg\" alt>\n");
      out.write("<img src=\"bd6.jpg\" alt>\n");
      out.write("<img src=\"wed3.jpg\" alt>\n");
      out.write("<img src=\"bd4.jpg\" alt>a\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
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
