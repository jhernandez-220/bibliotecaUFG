/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.editorialesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.editoriales;

/**
 *
 * @author juan
 */

public class editorialesController extends HttpServlet {

    String listar = "/listarEditoriales.jsp";
    String nuevo = "/agregarEditorial.jsp";
    String add = "/agregarEditorial.jsp";
    String edit = "/editarEditorial.jsp";
    editoriales ed = new editoriales();
    editorialesDAO daoEd = new editorialesDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        processRequest(request, response);
        
        String acceso = "";
        String action =  request.getParameter("accion");
        
        if(action.equalsIgnoreCase("listar")){
                acceso = listar;
        }else if (action.equalsIgnoreCase("add")){
                acceso = add;
        }else if(action.equalsIgnoreCase("Agregar")){
                //String idEditorial = request.getParameter("txtIdEditorial");
                String nombreEditorial = request.getParameter("txtNombreEditorial");
                String direccion = request.getParameter("txtDireccion");
                String telefono = request.getParameter("txtTelefono");
                String correo = request.getParameter("txtCorreo");
                String pais = request.getParameter("txtPais");
                //ed.setNombreEditorial(idEditorial);
                ed.setNombreEditorial(nombreEditorial);
                ed.setDireccion(direccion);
                ed.setTelefono(telefono);
                ed.setCorreo(correo);
                ed.setPais(pais);
                daoEd.add(ed);
                acceso = nuevo;
                }
    RequestDispatcher vista = request.getRequestDispatcher(acceso);
    vista.forward(request, response);
    }

    
        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
