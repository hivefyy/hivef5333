package servlet;



import dao.UserDao;
import dao.UserDaoImplement;
import entity.MyUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class registerServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String name = request.getParameter("name");
        String pwd = request.getParameter("password");
        String id = request.getParameter("id");

        MyUser user = new MyUser();
        user.setName(name);
        user.setPassword(pwd);
        user.setId(id);

        UserDao ud=new UserDaoImplement();
        if (ud.register(user)) {
            /*向request域中放置参数*/
            request.setAttribute("name",name);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            /*注册失败则返回注册页面，但是缺少提示"注册失败"*/
            response.sendRedirect("register.jsp");
        }
    }
}
