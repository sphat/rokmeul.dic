package metier.hibernate.tool.dic;

public interface IMutualWord {
	Long getPk_seq();

	void setPk_seq(Long pk_seq);

	String getMutual_word_kh();

	void setMutual_word_kh(String mutual_word_kh);
	
	Word getWord_seq();
	
	void setWord_seq(Word word_seq);
}
