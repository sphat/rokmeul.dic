/**
 * 
 */
package metier.hibernate.tool.dic;

/**
 * @author psph-linux
 *
 */
public class Synonyme implements ISynonyme {

	private Long pk_seq;
	private Word word_seq;
	private String synonyme_word;
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
	 * @return the word_seq
	 */
	public Word getWord_seq() {
		return word_seq;
	}
	/**
	 * @param word_seq the word_seq to set
	 */
	public void setWord_seq(Word word_seq) {
		this.word_seq = word_seq;
	}
	/**
	 * @return the synonyme_word
	 */
	public String getSynonyme_word() {
		return synonyme_word;
	}
	/**
	 * @param synonyme_word the synonyme_word to set
	 */
	public void setSynonyme_word(String synonyme_word) {
		this.synonyme_word = synonyme_word;
	}
	
}
