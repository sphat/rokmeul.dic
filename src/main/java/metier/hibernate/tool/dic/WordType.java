package metier.hibernate.tool.dic;

import java.util.HashSet;
import java.util.Set;


public class WordType implements IWordType {
	private Long pk_seq;
	private String type_abbriviation;
	private String type_full_fr;
	private String type_full_kh;
	private Set<Word> word_collection = new HashSet<Word>(0);
	
	public WordType() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public WordType(String type_abbriviation, String type_full_fr){
		this.type_abbriviation = type_abbriviation;
		this.type_full_fr = type_full_fr;
	}
	
	public WordType(String type_abbriviation, String type_full_fr, Set<Word> word_collection){
		this.type_abbriviation = type_abbriviation;
		this.type_full_fr = type_full_fr;
		this.word_collection = word_collection;
	}
	
	public Long getPk_seq() {
		return pk_seq;
	}
	public void setPk_seq(Long pk_seq) {
		this.pk_seq = pk_seq;
	}
	public String getType_abbriviation() {
		return type_abbriviation;
	}
	public void setType_abbriviation(String type_abbriviation) {
		this.type_abbriviation = type_abbriviation;
	}
	public String getType_full_fr() {
		return type_full_fr;
	}
	public void setType_full_fr(String type_full_fr) {
		this.type_full_fr = type_full_fr;
	}
	public String getType_full_kh() {
		return type_full_kh;
	}

	public void setType_full_kh(String type_full_kh) {
		this.type_full_kh = type_full_kh;
	}
	public Set<Word> getWord_collection() {
		return word_collection;
	}
	public void setWord_collection(Set<Word> word_collection) {
		this.word_collection = word_collection;
	}	
	
}
