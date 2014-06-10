package metier.hibernate.tool;

import java.util.List;

import org.hibernate.classic.Session;
//import org.hibernate.mapping.List;
//import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hsqldb.lib.StringUtil;

import metier.dictionary.addword.AddWordForm;
import metier.dictionary.editword.EditWordForm;
import metier.hibernate.tool.dic.Formation;
import metier.hibernate.tool.dic.Synonyme;
import metier.hibernate.tool.dic.Word;
import metier.hibernate.tool.dic.WordType;
import metier.hibernate.tool.dic.util.HibernateUtil;

/**
 * To run this code 1-Start hsqldb from MS-DOS (command : java -cp hsqldb.jar
 * org.hsqldb.Server)
 * 
 * To manage the database 1-Start hsqldb DatabaseManager from MS-DOS (command :
 * java -cp hsqldb.jar org.hsqldb.util.DatabaseManager)
 * 
 * @author phats
 * 
 */
public class DicDaoImpl implements DicDaoIntf {

	// public static final Session sess =
	// HibernateUtil.getSessionFactory().openSession();

	// public MainHibernate(){
	// Session session = HibernateUtil.getSessionFactory().openSession();
	// }

	public void addFormation(String str_formation) {

		if (!StringUtil.isEmpty(str_formation)) {
			// 1. Ouverture unité de travail hibernate
			Session session = HibernateUtil.getSessionFactory().openSession();
			// Session session =
			// HibernateUtil.getSessionFactory().getCurrentSession();

			// 2. Ouverture transaction
			Transaction tx = session.beginTransaction();

			// 3. Transaction Objet Métier
			Formation formation = new Formation(str_formation);

			// 4. Persistance Obje/Relationnel : Création d'un enregistrement en
			// base
			Long formationId = (Long) session.save(formation);
			System.out.println("Clé primaire : " + formationId);

			// 5. Fermateur transaction
			tx.commit();

			// 6. Fermerture unité de travail hibernate
			session.close();
		}
	}

	public void addWord(Word word){
		// 1. Ouverture unité de travail hibernate
		Session session = HibernateUtil.getSessionFactory().openSession();
		// Session session =
		// HibernateUtil.getSessionFactory().getCurrentSession();

		// 2. Ouverture transaction
		Transaction tx = session.beginTransaction();
		
		Long wordId = (Long) session.save(word);
		
		System.out.println("Clé primaire pour la table word : " + wordId);

		// 5. Fermateur transaction
		tx.commit();

		// 6. Fermerture unité de travail hibernate
		session.close();
		
	}
	
	public void addWord(String word, String word_definition) {
		if (!StringUtil.isEmpty(word) && !StringUtil.isEmpty(word_definition)) {
			// 1. Ouverture unité de travail hibernate
			Session session = HibernateUtil.getSessionFactory().openSession();
			// Session session =
			// HibernateUtil.getSessionFactory().getCurrentSession();

			// 2. Ouverture transaction
			Transaction tx = session.beginTransaction();

			// 3.1
			WordType wt = new WordType();
			// wt.setPk_seq(Long.parseLong("1"));
			wt.setType_abbriviation("adj");
			wt.setType_full_fr("adjectif");
			// wt.getWord_collection().add(obj_word);
			session.save(wt);

			// 3. Transaction Objet Métier
			Word obj_word = new Word(word, word_definition, wt);
			wt.getWord_collection().add(obj_word);

			// 4. Persistance Obje/Relationnel : Création d'un enregistrement en
			// base
			Long wordId = (Long) session.save(obj_word);
			System.out.println("Clé primaire : " + wordId);

			// 5. Fermateur transaction
			tx.commit();

			// 6. Fermerture unité de travail hibernate
			session.close();
		}
	}

	public void addwordtype(String abbr, String abbr_full_fr,
			String abbr_full_kh) {
		if (!StringUtil.isEmpty(abbr) && !StringUtil.isEmpty(abbr_full_fr)
				&& !StringUtil.isEmpty(abbr_full_kh)) {
			// 1. Ouverture unité de travail hibernate
			Session session = HibernateUtil.getSessionFactory().openSession();
			// Session session =
			// HibernateUtil.getSessionFactory().getCurrentSession();

			// 2. Ouverture transaction
			Transaction tx = session.beginTransaction();

			// 3
			WordType wt = new WordType();

			wt.setType_abbriviation(abbr);
			wt.setType_full_fr(abbr_full_fr);
			wt.setType_full_kh(abbr_full_kh);

			// 3.1. Persistance Obje/Relationnel : Création d'un enregistrement
			// en base
			Long wordTypeId = (Long) session.save(wt);
			System.out.println("Clé primaire : " + wordTypeId);

			// 4. Fermateur transaction
			tx.commit();

			// 5. Fermerture unité de travail hibernate
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Word> getWord() {
		// 1. Ouverture unité de travail hibernate
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query query = session.getNamedQuery("getAllWord");
		
		List<Word> lstWord = (List<Word>) query.list(); 
		
		if(lstWord.size()>0){
			return lstWord;
		}else{
			return null;
		}
		
		// final StringBuffer hsql = new StringBuffer();
		// --1--KO
		// hsql.append("SELECT w.pk_seq, w.word, w.word_definition, wt.type_full_fr ");
		// hsql.append("FROM metier.hibernate.tool.dic.Word w ");
		// hsql.append("INNER JOIN metier.hibernate.tool.dic.WordType wt ON w.word_type = wt.pk_seq");

		// --2--KO
		// hsql.append("SELECT w.pk_seq, w.word, w.word_definition, wt.type_full_fr ");
		// hsql.append("FROM metier.hibernate.tool.dic.Word AS w ");
		// hsql.append("INNER JOIN metier.hibernate.tool.dic.WordType AS wt ON w.word_type = wt.pk_seq");

		// --3--OK
		// hsql.append("SELECT w.pk_seq, w.word, w.word_definition, w.definition_kh, w.definition_fr, wt.type_full_fr ");
		// hsql.append("FROM metier.hibernate.tool.dic.Word w, metier.hibernate.tool.dic.WordType wt ");
		// hsql.append("WHERE w.pk_seq = wt.pk_seq");

		// System.out.println("****** PSPH getword query : " + hsql.toString());
		
		// Query query = session.createQuery(hsql.toString());

		// Query query =
		// session.createQuery("SELECT w.pk_seq, w.word, w.word_definition FROM metier.hibernate.tool.dic.Word AS w");
		// List wordList = (List) query.list();
		// 6. Fermerture unité de travail hibernate
		// session.close();
		// return query.list();
	}

	public List<WordType> getWordTypeList() {
		// 1. Ouverture unité de travail hibernate
		Session session = HibernateUtil.getSessionFactory().openSession();
		
//		final StringBuffer hsql = new StringBuffer();
//		
//		// SQL String
//		hsql.append("SELECT wt.pk_seq, wt.type_abbriviation, wt.type_full_fr, wt.type_full_kh FROM metier.hibernate.tool.dic.WordType wt");		
//		
//		Query query = session.createQuery(hsql.toString());

		
		Query query = session.getNamedQuery("getAllWordType");

		@SuppressWarnings("unchecked")
		List<WordType> lstWordType = (List<WordType>) query.list(); 
		
		return lstWordType;
	}

	@Override
	public void addWord(AddWordForm wordForm) {
		
		// 1. Ouverture unité de travail hibernate
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		// 2. Ouverture transaction
		Transaction tx = session.beginTransaction();
		Word word = new Word();
		
		WordType wordType = getWordTypeById(wordForm.getFk_word_type_seq().toString());
		
		word.setWord(wordForm.getWord());
		word.setWord_definition(wordForm.getWord_definition());
		word.setDefinition_kh(wordForm.getDefinition_kh());
		word.setDefinition_fr(wordForm.getDefinition_fr());
		word.setExample_kh(wordForm.getExample_kh());
		word.setExample_fr(wordForm.getExample_fr());
		word.setWord_type(wordType);
		word.setFk_word_type_seq(wordType.getPk_seq());
		
		// 3.1. Persistance Obje/Relationnel : Création d'un enregistrement
		// en base
		Long wordId = (Long) session.save(word);
		System.out.println("Clé primaire de nouvelle ligne de la table Word : " + wordId);

		if(!wordForm.getSynonyme_fr().isEmpty() || wordForm.getSynonyme_fr() != ""){
			Synonyme synonyme = new Synonyme();
			synonyme.setWord_seq(word);
			synonyme.setSynonyme_word(wordForm.getSynonyme_fr());
			Long synonymeId = (Long) session.save(synonyme);
			System.out.println("Clé primaire de nouvelle ligne de la table Synonyme : " + synonymeId);
		}
		
		// 4. Fermateur transaction
		tx.commit();

		// 5. Fermerture unité de travail hibernate
		session.close();
		
	}
	
	@Override
	public void updateWord(EditWordForm wordForm) {
		// 1. Ouverture unité de travail hibernate
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		// 2. Ouverture transaction
		Transaction tx = session.beginTransaction();
		
		Word word = (Word) session.get(Word.class, new Long(wordForm.getPk_seq()));
		
		WordType wordType = getWordTypeById(wordForm.getFk_word_type_seq().toString());
		
		word.setWord(wordForm.getWord());
		word.setWord_definition(wordForm.getWord_definition());
		word.setDefinition_kh(wordForm.getDefinition_kh());
		word.setDefinition_fr(wordForm.getDefinition_fr());
		word.setExample_kh(wordForm.getExample_kh());
		word.setExample_fr(wordForm.getExample_fr());
		word.setWord_type(wordType);
		word.setFk_word_type_seq(wordType.getPk_seq());

		session.update(word);
		
		System.out.println("update une nouvelle ligne de la table Word");
		
		if(word.getWordSyn().isEmpty()){
			Synonyme synonyme = new Synonyme();
			synonyme.setWord_seq(word);
			synonyme.setSynonyme_word(wordForm.getSynonyme_fr());
			Long synonymeId = (Long) session.save(synonyme);
			System.out.println("Clé primaire de nouvelle ligne de la table Synonyme : " + synonymeId);
		}else if(wordForm.getSynonyme_pk_seq().toString()!=""){
			Synonyme synonyme = (Synonyme) session.get(Synonyme.class, new Long(wordForm.getSynonyme_pk_seq()));
			synonyme.setWord_seq(word);
			synonyme.setSynonyme_word(wordForm.getSynonyme_fr());
			session.update(synonyme);
			System.out.println("update une nouvelle ligne de la table Synonyme");
		}
		
		// 4. Fermateur transaction
		tx.commit();

		// 5. Fermerture unité de travail hibernate
		session.close();
	}

	/**
	 * Get word type by id
	 * @param wordTypPkSeq
	 * @return WordType
	 */
	@Override
	public WordType getWordTypeById(String wordTypPkSeq) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.getNamedQuery("getWordTypeById");
		query.setParameter("word_type_pk_seq", wordTypPkSeq);
		
		@SuppressWarnings("unchecked")
		List<WordType> lstWordType = (List<WordType>) query.list(); 
		
		if(lstWordType.size()>0){
			return lstWordType.get(0);
		}else{
			return null;
		}
	}

	/**
	 * Get word by id
	 * @param wrodPk_seq
	 * @return Word
	 */
	@Override
	public Word getWordById(Long wordPk_seq) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.getNamedQuery("Word.getWordById");
		query.setParameter("word_pk_seq", wordPk_seq);
		
		@SuppressWarnings("unchecked")
		List<Word> lstWord = (List<Word>) query.list(); 
		
		if(lstWord.size()>0){
			return lstWord.get(0);
		}else{
			return null;
		}
	}

}
