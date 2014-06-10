package metier.dictionary.addwordtype;

import org.apache.struts.action.ActionForm;

public class AddWordTypeForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = -770475529843579209L;
	private String typeAbbr;
	private String typeAbbrFullFr;
	private String typeAbbrFullKh;

	public String getTypeAbbr() {
		return typeAbbr;
	}

	public void setTypeAbbr(String typeAbbr) {
		this.typeAbbr = typeAbbr;
	}

	public String getTypeAbbrFullFr() {
		return typeAbbrFullFr;
	}

	public void setTypeAbbrFullFr(String typeAbbrFullFr) {
		this.typeAbbrFullFr = typeAbbrFullFr;
	}

	public String getTypeAbbrFullKh() {
		return typeAbbrFullKh;
	}

	public void setTypeAbbrFullKh(String typeAbbrFullKh) {
		this.typeAbbrFullKh = typeAbbrFullKh;
	}

}
