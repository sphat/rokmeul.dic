/**
 * 
 */
package metier.hibernate.tool.dic;

/**
 * @author psph-linux
 *
 */
public interface ISynonyme {
	Long getPk_seq();
	
	void setPk_seq(Long pk_seq);
	
	Word getWord_seq();
	
	void setWord_seq(Word word_seq);
	
	String getSynonyme_word();
	
	void setSynonyme_word(String synonyme_word);
	
}
