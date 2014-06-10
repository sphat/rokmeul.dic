package metier.hibernate.tool;

import org.apache.struts.action.Action;

public class DicDaoObject extends Action {
	public final DicDaoIntf DicDaoObject = new DicDaoImpl(); 
}
