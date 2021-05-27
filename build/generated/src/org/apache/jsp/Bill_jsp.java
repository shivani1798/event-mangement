package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("header { margin: 0 0 3em; }\n");
      out.write("header:after { clear: both; content: \"\"; display: table; }\n");
      out.write("\n");
      out.write("header h1 { background: #000; border-radius: 0.25em; color: #FFF; margin: 0 0 1em; padding: 0.2em 0; }\n");
      out.write("\n");
      out.write("#table-example-1 { \n");
      out.write("  border: solid thin; \n");
      out.write("  border-collapse: collapse; \n");
      out.write("}\n");
      out.write("#table-example-1 caption { \n");
      out.write("  padding-bottom: 0.5em; \n");
      out.write("}\n");
      out.write("#table-example-1 th, \n");
      out.write("#table-example-1 td { \n");
      out.write("  border: solid thin;\n");
      out.write("  padding: 0.5rem 2rem;\n");
      out.write("}\n");
      out.write("#table-example-1 td {\n");
      out.write("  white-space: nowrap;\n");
      out.write("}\n");
      out.write("#table-example-1 th { \n");
      out.write("  font-weight: normal; \n");
      out.write("}\n");
      out.write("#table-example-1 td { \n");
      out.write("  border-style: none solid; \n");
      out.write("  vertical-align: top; \n");
      out.write("}\n");
      out.write("#table-example-1 th { \n");
      out.write("  padding: 0.2em; \n");
      out.write("  vertical-align: middle; \n");
      out.write("  text-align: center; \n");
      out.write("}\n");
      out.write("\n");
      out.write("#table-example-1 tbody td:first-child::after { \n");
      out.write("  content: leader(\". \"); \n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  padding: 1rem;\n");
      out.write("}\n");
      out.write("  \n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t<center>\n");
      out.write("\t\t\t<h1>Invoice</h1>\n");
      out.write("\t\t\t</center>\n");
      out.write("\t\t\t<address contenteditable>\n");
      out.write("\t\t\t\t<p>Owner Name : Samiksha Bhagade<br>\n");
      out.write("\t\t\t\tOffice Add: 101 E. SB Events<br>Mahad, 402301-Raigad<br>\n");
      out.write("\t\t\t\tMob: 9878654107</p>\n");
      out.write("\t\t\t</address>\n");
      out.write("\t\t</header>\n");
      out.write("\n");
      out.write("<table id=\"table-example-1\">\n");
      out.write(" \n");
      out.write("   <thead><tr><th rowspan=\"2\">Customer Details</th>\n");
      out.write("     <th rowspan=\"2\"></th>\n");
      out.write("\n");
      out.write("    </tr></thead><tbody><tr><td>Invoice NO </td>\n");
      out.write("     <td>\n");
      out.write("     \t\n");
      out.write("     </td>\n");
      out.write("     \n");
      out.write("     </tr></thead><tbody><tr><td>Customer Name</td>\n");
      out.write("     <td></td>\n");
      out.write("\n");
      out.write("<table id=\"table-example-1\"><caption>Bill Details</caption>\n");
      out.write(" \n");
      out.write("   <thead><tr><th rowspan=\"2\">Event Type</th>\n");
      out.write("     <th rowspan=\"2\">Total People</th>\n");
      out.write("     \n");
      out.write("     <th rowspan=\"2\">Extra Decoration & Stuff </th>\n");
      out.write("     <th rowspan=\"2\">Total Amount</th>\n");
      out.write("    </tr><tr><th>Remark</th>\n");
      out.write("     \n");
      out.write("    </tr></thead><tbody><tr><td>Birthday</td>\n");
      out.write("     <td></td>\n");
      out.write("     <td></td>\n");
      out.write("     <td></td>\n");
      out.write("     <td></td>\n");
      out.write("     \n");
      out.write("     </tr></thead><tbody><tr><td>Marriage</td>\n");
      out.write("     <td></td>\n");
      out.write("     <td></td>\n");
      out.write("     <td></td>\n");
      out.write("     <td></td>\n");
      out.write("\n");
      out.write("      </tr></thead><tbody><tr><td>Other Event</td>\n");
      out.write("     <td></td>\n");
      out.write("     <td></td>\n");
      out.write("     <td></td>\n");
      out.write("     <td></td>\n");
      out.write("       </tr></tbody></table><br></br>\n");
      out.write("      \n");
      out.write("         <button type=\"submit\" formaction=\"Home.jsp\">Do Payment</button>\n");
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
