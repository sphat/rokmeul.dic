package metier.hibernate.tool.dic;

public class MutualWord implements IMutualWord {

	private Long pk_seq;
	private String mutual_word_kh;
	private Word word_seq;
	
	public Long getPk_seq() {
		return pk_seq;
	}
	public void setPk_seq(Long pk_seq) {
		this.pk_seq = pk_seq;
	}
	public String getMutual_word_kh() {
		return mutual_word_kh;
	}
	public void setMutual_word_kh(String mutual_word_kh) {
		this.mutual_word_kh = mutual_word_kh;
	}
	public Word getWord_seq() {
		return word_seq;
	}
	public void setWord_seq(Word word_seq) {
		this.word_seq = word_seq;
	}
}
