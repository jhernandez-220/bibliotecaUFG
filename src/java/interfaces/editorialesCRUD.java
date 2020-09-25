
package interfaces;

import java.util.List;
import modelo.editoriales;

public interface editorialesCRUD {
    
    public List listar();
    public boolean list(int idEditorial);
    public boolean add(editoriales edi);
    public boolean edit(editoriales edi);
    public boolean delete(int idEditorial);
    
    
}
