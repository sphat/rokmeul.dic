package metier.dictionary.editword;

import metier.hibernate.tool.dic.Word;

import org.apache.struts.action.ActionForm;

public class EditWordForm  extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long fk_word_type_seq;	
	
	private Long pk_seq;
	
	private Long synonyme_pk_seq;
	
	private Word wordObj;
	
	private String word;
	
	private String word_definition;
	
	private String definition_kh;
	
	private String definition_fr;
	
	private String synonyme_fr;
	
	private String example_kh;
	
	private String example_fr;

	/**
	 * @return the wordObj
	 */
	public Word getWordObj() {
		return wordObj;
	}

	/**
	 * @param wordObj the wordObj to set
	 */
	public void setWordObj(Word wordObj) {
		this.wordObj = wordObj;
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
	 * @return the pk_seq
	 */
	public Long getPk_seq() {
		return pk_seq;
	}

	/**
	 * @param pk_seq the pk_seq to set
	 */
	public void setPk_seq(Long pk_seq) {
		this.pk_seq = pk_seq;
	}

	/**
	 * @return the synonyme_pk_seq
	 */
	public Long getSynonyme_pk_seq() {
		return synonyme_pk_seq;
	}

	/**
	 * @param synonyme_pk_seq the synonyme_pk_seq to set
	 */
	public void setSynonyme_pk_seq(Long synonyme_pk_seq) {
		this.synonyme_pk_seq = synonyme_pk_seq;
	}	
	
}
