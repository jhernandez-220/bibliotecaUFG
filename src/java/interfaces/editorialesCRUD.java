
package interfaces;

import java.util.List;
import modelo.editoriales;

public interface editorialesCRUD {
    
    public List listarEditorial();
    public editoriales list (int idEditorial);
    public boolean list(editoriales edi);
    public boolean add(editoriales edi);
    public boolean edit(editoriales edi);
    public boolean delete(int id);
    
    
}
