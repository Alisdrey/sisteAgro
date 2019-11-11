package beans;

import java.util.List;
import javax.faces.bean.ManagedBean;

import dao.MaquinaDAO;
import model.Maquina;


@ManagedBean
public class BeanMaquina {
private Maquina maquina = new Maquina();
	
	public Maquina getMaquina() {
		return maquina;
	}


	public void InserirMaquina() {
		
		new MaquinaDAO().save(this.maquina);
	}
}
