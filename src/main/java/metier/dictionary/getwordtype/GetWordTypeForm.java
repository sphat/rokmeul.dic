/**
 * 
 */
package metier.dictionary.getwordtype;

import java.util.List;

import metier.hibernate.tool.dic.WordType;

import org.apache.struts.action.ActionForm;

/**
 * @author psv
 *
 */
public class GetWordTypeForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<WordType> lstWordType;

	public List<WordType> getLstWordType() {
		return lstWordType;
	}

	public void setLstWordType(List<WordType> lstWordType) {
		this.lstWordType = lstWordType;
	}
	
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	
	

}
