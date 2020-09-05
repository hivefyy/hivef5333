package com.servlet;

import com.dao.UserDao;
import com.dao.UserDaoImplement;
import com.entity.MyUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class showAllServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        UserDao ud=new UserDaoImplement();
        List<MyUser> userAll = ud.getUserAll();
        request.setAttribute("all",userAll);
        request.getRequestDispatcher("showAll.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
