package servlet;

import dao.UserDao;
import dao.UserDaoImplement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class deleteServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String id = request.getParameter("id");

        UserDao ud = new UserDaoImplement();
        if(ud.delete(id)){
            request.getRequestDispatcher("addUpdateDeleteSuccess.jsp").forward(request, response);
        }else {
            response.sendRedirect("addUpdateDeleteFail.jsp");
        }
    }
}
