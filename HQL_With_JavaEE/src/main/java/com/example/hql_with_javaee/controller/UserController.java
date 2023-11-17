package com.example.hql_with_javaee.controller;

import com.example.hql_with_javaee.dao.UserDAO;
import com.example.hql_with_javaee.dao.UserDAOImpl;
import com.example.hql_with_javaee.entity.UserEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "listUser", urlPatterns = {"/list-user"})
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDAO userDAO = new UserDAOImpl();
        List<UserEntity> userList = userDAO.getAllUser();
        req.setAttribute("list", userList);
        req.getRequestDispatcher("home/listUser.jsp").forward(req,resp);

    }
}
