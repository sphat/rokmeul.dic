package metier.dictionary.addword;

import org.apache.struts.action.ActionForm;

public class AddWordForm extends ActionForm {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long fk_word_type_seq;
	
	private String word;
	
	private String word_definition;
	
	private String definition_kh;
	
	private String definition_fr;
	
	private String synonyme_fr;
	
	private String example_kh;
	
	private String example_fr;
	
//	private List<WordType> lstWordType;

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}
	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}
	/**
	 * @return the word_definition
	 */
	public String getWord_definition() {
		return word_definition;
	}
	/**
	 * @param word_definition the word_definition to set
	 */
	public void setWord_definition(String word_definition) {
		this.word_definition = word_definition;
	}
	/**
	 * @return the definition_kh
	 */
	public String getDefinition_kh() {
		return definition_kh;
	}
	/**
	 * @param definition_kh the definition_kh to set
	 */
	public void setDefinition_kh(String definition_kh) {
		this.definition_kh = definition_kh;
	}
	/**
	 * @return the definition_fr
	 */
	public String getDefinition_fr() {
		return definition_fr;
	}
	/**
	 * @param definition_fr the definition_fr to set
	 */
	public void setDefinition_fr(String definition_fr) {
		this.definition_fr = definition_fr;
	}
	/**
	 * @return the example_kh
	 */
	public String getExample_kh() {
		return example_kh;
	}
	/**
	 * @param example_kh the example_kh to set
	 */
	public void setExample_kh(String example_kh) {
		this.example_kh = example_kh;
	}
	/**
	 * @return the example_fr
	 */
	public String getExample_fr() {
		return example_fr;
	}
	/**
	 * @param example_fr the example_fr to set
	 */
	public void setExample_fr(String example_fr) {
		this.example_fr = example_fr;
	}
	/**
	 * @return the fk_word_type_seq
	 */
	public Long getFk_word_type_seq() {
		return fk_word_type_seq;
	}
	/**
	 * @param fk_word_type_seq the fk_word_type_seq to set
	 */
	public void setFk_word_type_seq(Long fk_word_type_seq) {
		this.fk_word_type_seq = fk_word_type_seq;
	}
	/**
	 * @return the synonyme_fr
	 */
	public String getSynonyme_fr() {
		return synonyme_fr;
	}
	/**
	 * @param synonyme_fr the synonyme_fr to set
	 */
	public void setSynonyme_fr(String synonyme_fr) {
		this.synonyme_fr = synonyme_fr;
	}
	
	/**
	 * This method will call automatically, from the validator plugin 
	 */
//	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//		
//	    ActionErrors errors = new ActionErrors();
//	    if (oneWord == null || oneWord.length() < 1) {
//	        errors.add("oneWord", new ActionMessage("error.oneWord.required"));
//	    }
//	    if (oneWordDefinition == null || oneWordDefinition.length() < 1) {
//	        errors.add("password", new ActionMessage("error.oneWordDefinition.required"));
//	    }
//	    return errors;
//	}

}
