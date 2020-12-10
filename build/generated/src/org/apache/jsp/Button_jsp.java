package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Button_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>New Employee</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--  JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            emps = new Array();\n");
      out.write("            index = 0;\n");
      out.write("            function saveData() {\n");
      out.write("                if(nm.value.trim().length==0 || empid.value.trim().length==0 || Dept.value.trim().length==0 || Eid.value.trim().length==0 || Doj.value.trim().length==0)\n");
      out.write("                {\n");
      out.write("                    alert('Please fill all required field');\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                emps[index++] = {\"name\": nm.value, \"empid\": empid.value, \"Dept\":Dept.value, \"Eid\":Eid.value, \"Doj\":Doj.value};\n");
      out.write("                //alert('data saved');\n");
      out.write("                showData();\n");
      out.write("                 $(\"#myModal\").modal('hide');\n");
      out.write("            }\n");
      out.write("            function showData() {\n");
      out.write("                //alert('datat is shwoing ');\n");
      out.write("                 document.getElementById(\"table1\").innerHTML=\"<tr><td></td><td>Name</td><td>Employee id</td><td>Department</td><td>Email</td><td>Date of joining</td></tr>\";\n");
      out.write("                for (var x = 0; x < emps.length; x++)\n");
      out.write("                {\n");
      out.write("                   $(\"#table1\").append(\"<tr><td><input type='Button' class='btn btn-danger' onclick='remove(\"+x+\");' value='X'></td><td>\"+ emps[x].name +\"</td><td>\" +emps[x].empid +\"</td>+<td>\" +emps[x].Dept +\"</td><td>\" +emps[x].Eid +\"</td><td>\" +emps[x].Doj +\"</td></tr>\");\n");
      out.write("                     \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function remove(x){\n");
      out.write("               // alert(x);\n");
      out.write("                 emps.splice(x, 1);\n");
      out.write("                 showData();    \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function clearData(){\n");
      out.write("                nm.value=\"\";\n");
      out.write("                empid.value=\"\";\n");
      out.write("                Dept.value=\"\";\n");
      out.write("                Eid.value=\"\";\n");
      out.write("                Doj.value=\"\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\"><br>\n");
      out.write("            <!-- Trigger the modal with a button -->\n");
      out.write("            <button type=\"button\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\" onclick=\"clearData();\">New Employee</button>\n");
      out.write("            <br/><br/>.\n");
      out.write("            <div id =\"div1\">\n");
      out.write("                <table class=\"table table-striped\" id = \"table1\">\n");
      out.write("                     <tr><td></td><td>Name</td><td>Employee id</td><td>Department</td><td>Email id</td><td>Date of Joining</td></tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <!-- Modal -->\n");
      out.write("            <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog modal-lg\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                            <h4 class=\"modal-title\"> New Employee</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> Name:</td>\n");
      out.write("                                    <th><input type=\"text\" class=\"form-control\" required id=\"nm\"><br></th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> Employee ID:</td>\n");
      out.write("                                    <th><input type=\"text\" class=\"form-control\" required id=\"empid\"><br></th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> Department</td>\n");
      out.write("                                    <th><select id=\"Dept\">\n");
      out.write("                                            <option value=\"\" selected disabled=\"disabled\">Select any department</option>      \n");
      out.write("                                            <option value=\"Finance\">Finance</option>\n");
      out.write("                                            <option value=\"Information Technology\">Information Technology</option>\n");
      out.write("                                            <option value=\"Human resource\">Human Resource</option>\n");
      out.write("                                            <option value=\"Sales\" >Sales </option>\n");
      out.write("                                            <option value=\"Research & Development\">R & D</option>\n");
      out.write("                                        </select></th>\n");
      out.write("                                <br><br></tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> Email ID:</td>\n");
      out.write("                                    <th><input type=\"text\" class=\"form-control\" required id=\"Eid\"><br></th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> Date of joining:</td>\n");
      out.write("                                    <th><input type=\"date\" name=\"doj\" required id=\"Doj\"> <br><br></th>\n");
      out.write("                                </tr>\n");
      out.write("                                <button type=\"reset\" class=\"btn btn-danger\" onclick=\"clearData()\">Clear Data</button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\" onclick=\"saveData();\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                         \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
