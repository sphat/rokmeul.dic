package metier.hibernate.tool.dic;

public interface IWord {
	
	Long getPk_seq();
	void setPk_seq(Long pk_seq);
	
	Long getFk_word_type_seq();
	void setFk_word_type_seq(Long fk_word_type_seq);
	
	String getWord();
	void setWord(String word);
	
	String getWord_definition();
	void setWord_definition(String word_definition);
	
	String getDefinition_kh();
	void setDefinition_kh(String definition_kh);
	
	String getDefinition_fr();
	void setDefinition_fr(String definition_fr);
	
	String getExample_kh();
	void setExample_kh(String example_kh);
	
	String getExample_fr();
	void setExample_fr(String example_fr);
	
	WordType getWord_type();
	void setWord_type(WordType word_type);
	
}
