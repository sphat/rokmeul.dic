package metier.hibernate.tool.dic;

import java.util.Set;

public interface IWordType {
	
	Long getPk_seq();
	void setPk_seq(Long pk_seq);
	
	String getType_abbriviation();
	void setType_abbriviation(String type_abbriviation);
	
	String getType_full_fr();
	void setType_full_fr(String type_full_fr);
	
	String getType_full_kh();
	void setType_full_kh(String type_full_kh);

	Set<Word> getWord_collection();
	void setWord_collection(Set<Word> word_collection);
	
}
