/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-26 02:21:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usersearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("<title>查询用户页面</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"css/bootstrap-3.3.7/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"css/bootstrap-table/bootstrap-table.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<table id=\"tb_departments\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery-3.3.1/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-3.3.7/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-table/bootstrap-table.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-table/bootstrap-table-zh-CN.js\"></script>\r\n");
      out.write("\t<script src=\"js/util.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("  \t$(function () {\r\n");
      out.write("\r\n");
      out.write("  \t    //1.初始化Table\r\n");
      out.write("  \t    var oTable = new TableInit();\r\n");
      out.write("  \t    oTable.Init();\r\n");
      out.write("\r\n");
      out.write("  \t});\r\n");
      out.write("  \tvar TableInit = function () {\r\n");
      out.write("  \t    var oTableInit = new Object();\r\n");
      out.write("  \t    //初始化Table\r\n");
      out.write("    \toTableInit.Init = function () {\r\n");
      out.write("  \t        $('#tb_departments').bootstrapTable({\r\n");
      out.write("  \t            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/getUserList',         //请求后台的URL（*）\r\n");
      out.write("  \t            method: 'get',                      //请求方式（*）\r\n");
      out.write("  \t            toolbar: '#toolbar',                //工具按钮用哪个容器\r\n");
      out.write("  \t            striped: true,                      //是否显示行间隔色\r\n");
      out.write("  \t            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）\r\n");
      out.write("  \t            pagination: true,                   //是否显示分页（*）\r\n");
      out.write("  \t            sortable: false,                    //是否启用排序\r\n");
      out.write("  \t            sortOrder: \"asc\",                   //排序方式\r\n");
      out.write("  \t          \tqueryParamsType: \"\",\t\t\t\t\r\n");
      out.write("  \t            queryParams: oTableInit.queryParams,//传递参数（*）\r\n");
      out.write("  \t            sidePagination: \"server\",           //分页方式：client客户端分页，server服务端分页（*）\r\n");
      out.write("  \t            pageNumber:1,                       //初始化加载第一页，默认第一页\r\n");
      out.write("  \t            pageSize: 10,                       //每页的记录行数（*）\r\n");
      out.write("  \t            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）\r\n");
      out.write("  \t            search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大\r\n");
      out.write("  \t            strictSearch: true,\r\n");
      out.write("  \t            showColumns: true,                  //是否显示所有的列\r\n");
      out.write("  \t            showRefresh: true,                  //是否显示刷新按钮\r\n");
      out.write("  \t            minimumCountColumns: 2,             //最少允许的列数\r\n");
      out.write("  \t            clickToSelect: true,                //是否启用点击选中行\r\n");
      out.write("  \t            //height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度\r\n");
      out.write("  \t            uniqueId: \"id\",                     //每一行的唯一标识，一般为主键列\r\n");
      out.write("  \t            showToggle:false,                    //是否显示详细视图和列表视图的切换按钮\r\n");
      out.write("  \t            cardView: false,                    //是否显示详细视图\r\n");
      out.write("  \t            detailView: false,                   //是否显示父子表\r\n");
      out.write("  \t            columns: [ {\r\n");
      out.write("  \t                field: 'id',\r\n");
      out.write("  \t                title: 'ID',\r\n");
      out.write("  \t              \twidth : '100'\r\n");
      out.write("  \t            }, {\r\n");
      out.write("  \t                field: 'accountNum',\r\n");
      out.write("  \t                title: '账号',\r\n");
      out.write("  \t              \twidth : '150'\r\n");
      out.write("  \t            }, {\r\n");
      out.write("  \t                field: 'nickName',\r\n");
      out.write("  \t                title: '昵称',\r\n");
      out.write("  \t                width : '150'\r\n");
      out.write("  \t            }, {\r\n");
      out.write("  \t                field: 'Desc',\r\n");
      out.write("  \t                title: '描述'\r\n");
      out.write("  \t            }, ]\r\n");
      out.write("  \t        });\r\n");
      out.write("  \t    };\r\n");
      out.write("  \t    \r\n");
      out.write("  \t    //得到查询的参数\r\n");
      out.write("\t\toTableInit.queryParams = function (params) {\r\n");
      out.write("\t\t\tvar temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的\r\n");
      out.write("\t\t\t\trows: params.pageSize,   //页面大小\r\n");
      out.write("\t\t\t\tpage: params.pageNumber  //页码\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\treturn temp;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\treturn oTableInit;\r\n");
      out.write("  \t};\r\n");
      out.write("\r\n");
      out.write("  \t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
