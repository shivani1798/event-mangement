package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About Us</title>\n");
      out.write("            <link id=\"theme\" rel=\"stylesheet\"  href=\"css/style.css\"  />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    <div class=\"login-page\">\n");
      out.write("  <div class=\"form\">\n");
      out.write("  \t<center>\n");
      out.write("\t<h1><b>SB Events</b></h1>\n");
      out.write("</center>\n");
      out.write("    <p><b><center><em>SB Events Pvt Ltd. is an event logistics and marketing company which was formed back in 2019. The company offers All event planning services from a team of experienced and energetic event planners, suppliers, venues and more. One of the main reasons behind the success of Event Planner is the fact that the team does not charge fees to its clients! With the number of events we organise, Event Planner Ltd does not need to add exorbitant fees and mark-ups to make its profit margins. This ensures that our clients list, which is constantly growing, make regular use of our services.</em></center></b></p>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <button id=\"myButton\" class=\"float-left submit-button\" >Home</button>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    document.getElementById(\"myButton\").onclick = function () {\n");
      out.write("        location.href = \"Home.jsp\";\n");
      out.write("    };\n");
      out.write("</script>\n");
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
