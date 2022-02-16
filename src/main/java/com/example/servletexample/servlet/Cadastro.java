package com.example.servletexample.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cadastro", value = "/cadastro")
public class Cadastro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        //int idade = req.getParameter("idade"); //get Parameter sempre retorna uma string, independente do outro tipo.
        String idade = req.getParameter("idade");
        String data = req.getParameter("data");

        res.setContentType("text/html");

        PrintWriter writer = res.getWriter();
        writer.println("Pagina de cadastro acessada");
        writer.println("<ul>");
        writer.println("<li> nome:" + nome + "</li>");
        writer.println("<li> sobrenome:" + sobrenome + "</li>");
        writer.println("<li> idade:" + idade + "</li>");
        writer.println("<li> data:" + data + "</li>");

    }
}
