/**
 * 
 */
package rokmeul.dic.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import metier.hibernate.tool.DicDaoImpl;
import metier.hibernate.tool.DicDaoIntf;
import metier.hibernate.tool.DicDaoObject;
import metier.hibernate.tool.dic.Word;
import metier.hibernate.tool.dic.WordType;

/**
 * @author psph-linux
 *
 */
public class DicToImport extends DicDaoObject{ 
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		DicToImport dic = new DicToImport();
		try {
			dic.testImport();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testImport() throws FileNotFoundException, IOException {
		DicDaoIntf DicDaoObject = new DicDaoImpl();
		//try(BufferedReader br = new BufferedReader(new FileReader("//home/psph-linux/dic_to_read/A-Fr"))) {
		try(BufferedReader br = new BufferedReader(new FileReader("//home/psph-linux/dic_to_read/A-Fr1"))) {
		    for(String line; (line = br.readLine()) != null; ) {
		        // process the line.
		    	
		    	//String[] result = line.split(";");
		    	//System.out.println("-"+result[0].trim()+" > "+result[1].trim());
		    	
		    	String[] result = line.split("\\t");
		    	
		    	//System.out.println("-"+line);
		    	Word wordObj = new Word();
		    	WordType wordType = DicDaoObject.getWordTypeById("77");
		    	wordObj.setWord(result[0].trim());
		    	wordObj.setWord_type(wordType);
		    	
		    	System.out.println("-"+result[0].trim()+" - wordType : "+wordType.getType_full_fr());
		    	
		    	DicDaoObject.addWord(wordObj);
		    	
		    }
		    // line is not visible here.
		}		
	}

}
