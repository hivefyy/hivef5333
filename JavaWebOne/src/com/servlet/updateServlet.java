package com.servlet;

import com.dao.UserDao;
import com.dao.UserDaoImplement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class updateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        UserDao ud = new UserDaoImplement();
        if(ud.update(name,id)){
            request.getRequestDispatcher("/addUpdateDeleteSuccess.jsp").forward(request, response);
        }else {
            response.sendRedirect("addUpdateDeleteFail.jsp");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
