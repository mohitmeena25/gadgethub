package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Register Here</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row justify-content-center\">\n");
      out.write("      <form action=\"#\" class=\"col-md-6 myform p-3 m-3\">\n");
      out.write("        <div class=\"text-center m-3\">\n");
      out.write("          <h2 class=\"text-primary\">Registration Form</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 form-group mt-1\">\n");
      out.write("            <label for=\"user_name\">Name</label>\n");
      out.write("            <input\n");
      out.write("              type=\"text\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              id=\"user_name\"\n");
      out.write("              name=\"username\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 form-group mt-1\">\n");
      out.write("            <label for=\"user_email\">Email</label>\n");
      out.write("            <input\n");
      out.write("              type=\"email\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              name=\"useremail\"\n");
      out.write("              id=\"user_email\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"user_address\">Address</label>\n");
      out.write("        <textarea\n");
      out.write("            name=\"useraddress\"\n");
      out.write("            id=\"user_address\"\n");
      out.write("            rows=\"2\"\n");
      out.write("            class=\"form-control mt-1\"\n");
      out.write("          ></textarea>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 form-group mt-1\">\n");
      out.write("              <label for=\"mobile_no\">Mobile</label>\n");
      out.write("              <input\n");
      out.write("                type=\"number\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                id=\"mobile_no\"\n");
      out.write("                name=\"mobileno\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 form-group mt-1\">\n");
      out.write("              <label for=\"pincode\">Pin Code</label>\n");
      out.write("              <input\n");
      out.write("                type=\"number\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                name=\"pincode\"\n");
      out.write("                id=\"pincode\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 form-group mt-1\">\n");
      out.write("              <label for=\"password\">Password</label>\n");
      out.write("              <input\n");
      out.write("                type=\"password\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                id=\"password\"\n");
      out.write("                name=\"password\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 form-group mt-1\">\n");
      out.write("              <label for=\"confpassword\">Confirm Password</label>\n");
      out.write("              <input\n");
      out.write("                type=\"password\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                name=\"confpassword\"\n");
      out.write("                id=\"confpassword\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"row text-center mt-3 mb-3\">\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("             <button type=\"reset\" class=\"btn btn-danger mt-2\">Reset</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary mt-2\">Register</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("      </form>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
