package CIH.Outros;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author gkrause
 */
public class ClasseErro
{
    private Object obj;

    public ClasseErro(Object obj)
    {
        this.obj = obj;
    }
    

    public void exibir( String mensagem)
    {
        JOptionPane.showMessageDialog((Component)obj, mensagem);

    }

}
