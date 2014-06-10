package metier.hibernate.tool;

import java.util.List;

import metier.dictionary.addword.AddWordForm;
import metier.dictionary.editword.EditWordForm;
import metier.hibernate.tool.dic.Word;
import metier.hibernate.tool.dic.WordType;

public interface DicDaoIntf {
	public void addFormation(String str_formation);

	public void addWord(String word, String word_definition);

	/**
	 * Add word
	 * @param wordForm
	 */
	public void addWord(AddWordForm wordForm);
	
	public void updateWord(EditWordForm wordForm);
	
	/**
	 * Add word by using word object
	 * @param word
	 */
	public void addWord(Word word);

	public void addwordtype(String abbr, String abbr_full_fr,
			String abbr_full_kh);

	public List<Word> getWord();

	public List<WordType> getWordTypeList();
	
	/**
	 * Get word type by id
	 * @param wordTypPkSeq
	 * @return WordType
	 */
	public WordType getWordTypeById(String wordTypPkSeq);
	
	/**
	 * Get word by id
	 * @param wrodPk_seq
	 * @return Word
	 */
	public Word getWordById(Long wordPk_seq);
}
