package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>GadgetHub.com</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">  \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css\" integrity=\"sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("</head>\n");
      out.write("  <body>\n");
      out.write("    <!--navbar1 starts here-->\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-custom\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a href=\"index.jsp\" class=\"navbar-brand\">\n");
      out.write("                GadgetHub\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#mynav\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"mynav\">\n");
      out.write("                <ul class=\"navbar-nav ms-auto\">\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">\n");
      out.write("                            Category\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Mobile</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-item\">Tv</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-item\">Camera</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Speaker</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Cooler</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Ipad</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"nav-link\">Products</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"login.jsp\" class=\"nav-link\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("                    </li>\n");
      out.write("                        <a href=\"register.jsp\" class=\"nav-link\">Register</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!--navbar1 ends here-->\n");
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("\n");
      out.write("    <!--admin navbar starts here-->\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-custom\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a href=\"userHome.jsp\" class=\"navbar-brand\">\n");
      out.write("                GadgetHub\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#mynav\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"mynav\">\n");
      out.write("                <ul class=\"navbar-nav ms-auto\">\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"userHome.jsp\" class=\"nav-link\">Products</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">\n");
      out.write("                            Category\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Mobile</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-item\">Tv</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-item\">Camera</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Speaker</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Cooler</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Ipad</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"adminStock.jsp\" class=\"nav-link\">Stocks</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"adminShipped.jsp\" class=\"nav-link\">Shipped</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\"></li>\n");
      out.write("                        <a href=\"unShippedOrders.jsp\" class=\"nav-link\">Orders</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">\n");
      out.write("                            Update Items\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Add Products</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-item\">Remove Products</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-item\">Update Products</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"\" class=\"nav-link\">Logout</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!--admin navbar ends here-->\n");
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("\n");
      out.write("    <!--customer navbar starts here-->\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-custom\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a href=\"index.jsp\" class=\"navbar-brand\">\n");
      out.write("                GadgetHub\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#mynav\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"mynav\">\n");
      out.write("                <ul class=\"navbar-nav ms-auto\">\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"nav-link\">Products</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"cartDetails.jsp\" class=\"nav-link\">Cart</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"cartDetails.jsp\" class=\"nav-link\">\n");
      out.write("                            <i class=\"fa fa-cart-shopping bg-primary\" style=\"background-color: black; margin: 0;padding: 5px;\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link\">Orders</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\"></li>\n");
      out.write("                        <a href=\"#\" class=\"nav-link\">Profile</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\"></li>\n");
      out.write("                        <a href=\"#\" class=\"nav-link\">Logout</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--customer navbar ends here-->\n");
      out.write("\n");
      out.write("    <!--Search bar starts here-->\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid bg-warning text-center p-3\">\n");
      out.write("        <h2>GadgetHub</h2>\n");
      out.write("        <p>We specialize in Electronics</p>\n");
      out.write("        <form action=\"#\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" name=\"\" id=\"\" class=\"form-control\" placeholder=\"Search items....\">\n");
      out.write("                <input type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!--Search bar ends here-->\n");
      out.write("\n");
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
