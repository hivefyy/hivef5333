package servlet;

import dao.UserDao;
import dao.UserDaoImplement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**需要继承HttpServlet  并重写doGet  doPost方法*/
public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     /*将信息使用doPost方法执行   对应jsp页面中的form表单中的method*/
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     /*得到jsp页面传过来的参数*/
        String name = request.getParameter("name");
        String password =request.getParameter("password");

        UserDao ud =new UserDaoImplement();
        if(ud.login(name,password)){
            /*跳转到成功页面*/
            request.getRequestDispatcher("/success.jsp").forward(request, response);
        }else {
            /*重定向到首页*/
            response.sendRedirect("login.jsp");
        }
    }
}
