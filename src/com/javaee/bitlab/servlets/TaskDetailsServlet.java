package com.javaee.bitlab.servlets;

import com.javaee.bitlab.db.DBManager;
import com.javaee.bitlab.db.models.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/details")
public class TaskDetailsServlet extends HttpServlet {
    public  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Long id = Long.parseLong(request.getParameter("id"));
        Task task = DBManager.getTask(id);
        if (task!=null){
            request.setAttribute("task", task);
            request.getRequestDispatcher("/details.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("/404.jsp").forward(request, response);
        }
    }
    public  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }
}
