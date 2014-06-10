package metier.hibernate.tool.dic;

import java.util.HashSet;
import java.util.Set;

public class Word implements IWord {
	
	private Long pk_seq;
	private Long fk_word_type_seq;
	private String word;
	private String word_definition;
	private String definition_kh;
	private String definition_fr;
	private String example_kh;
	private String example_fr;
	private WordType word_type;
	private Set<Synonyme> wordSyn = new HashSet<Synonyme>(0);
	private String getWordSyn;
	
	//constructor 
	public Word(String word, String word_definition, WordType word_type){
		//super();
//		this.word_type = word_type;

		//word_type.setPk_seq(Long.parseLong("1"));
//		word_type.setType_abbriviation("adj");
//		word_type.settype_full_fr("adjectif");
//		wt.getWord_collection().add(obj_word);
		
		this.word = word;
		this.word_definition = word_definition;
		
		this.setWord_type(word_type);
//		word_type.getWord_collection().add(this);

	}
	
	//constructor 
	public Word(Long pk_seq, String word, String word_definition){
		//super();
		this.pk_seq = pk_seq;
		this.word = word;
		this.word_definition = word_definition;
	}

	public Word() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getPk_seq() {
		return pk_seq;
	}
	public void setPk_seq(Long pk_seq) {
		this.pk_seq = pk_seq;
	}
	public Long getFk_word_type_seq() {
		return fk_word_type_seq;
	}
	public void setFk_word_type_seq(Long fk_word_type_seq) {
		this.fk_word_type_seq = fk_word_type_seq;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getWord_definition() {
		return word_definition;
	}
	public void setWord_definition(String word_definition) {
		this.word_definition = word_definition;
	}
	public WordType getWord_type() {
		return word_type;
	}
	public void setWord_type(WordType word_type) {
		this.word_type = word_type;
	}

	public String getDefinition_kh() {
		return definition_kh;
	}

	public void setDefinition_kh(String definition_kh) {
		this.definition_kh = definition_kh;
	}

	public String getDefinition_fr() {
		return definition_fr;
	}

	public void setDefinition_fr(String definition_fr) {
		this.definition_fr = definition_fr;
	}

	public String getExample_kh() {
		return example_kh;
	}

	public void setExample_kh(String example_kh) {
		this.example_kh = example_kh;
	}

	public String getExample_fr() {
		return example_fr;
	}

	public void setExample_fr(String example_fr) {
		this.example_fr = example_fr;
	}

	/**
	 * @return the wordSyn
	 */
	public Set<Synonyme> getWordSyn() {
		return wordSyn;
	}

	/**
	 * @param wordSyn the wordSyn to set
	 */
	public void setWordSyn(Set<Synonyme> wordSyn) {
		this.wordSyn = wordSyn;
	}

	/**
	 * @return the getWordSyn
	 */
	public String getGetWordSyn() {
		for(Synonyme synWord : getWordSyn()){
			return synWord.getSynonyme_word();
		}
		return null;
	}

	/**
	 * @param getWordSyn the getWordSyn to set
	 */
	public void setGetWordSyn(String getWordSyn) {
		this.getWordSyn = getWordSyn;
	}
	
	

}
