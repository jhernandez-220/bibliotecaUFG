
package DAO;

import config.conexion;
import interfaces.editorialesCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.editoriales;


public class editorialesDAO implements editorialesCRUD{
    
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    editoriales edi = new editoriales();

    @Override
    public List listarEditorial() {
        
        ArrayList<editoriales>list = new ArrayList<>();
        String sql = "select * from editoriales";
        
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                editoriales ed = new editoriales();
                ed.setIdEditorial(rs.getInt("idEditorial"));
                ed.setNombreEditorial(rs.getString("nombreEditorial"));
                ed.setDireccion(rs.getString("direccion"));
                ed.setTelefono(rs.getString("telefono"));
                ed.setCorreo(rs.getString("correo"));
                ed.setPais(rs.getString("pais"));
                list.add(ed);
            }
        }catch(Exception e){
        }
        return list;
    }

    @Override
    public editoriales list(int idEditorial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean list(editoriales edi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(editoriales edi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(editoriales edi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}