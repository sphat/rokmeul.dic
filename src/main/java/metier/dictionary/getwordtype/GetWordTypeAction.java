/**
 * 
 */
package metier.dictionary.getwordtype;

import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.hibernate.tool.DicDaoObject;
import metier.hibernate.tool.dic.WordType;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author psv
 * 
 */
public class GetWordTypeAction extends DicDaoObject {

	private final static String SUCCESS = "success";

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		GetWordTypeForm getWordTypeForm = (GetWordTypeForm) form;

		List<WordType> lstWordType = new ArrayList<WordType>(DicDaoObject.getWordTypeList());

		getWordTypeForm.setHello("Hello : Sereivuth");
		getWordTypeForm.setLstWordType(lstWordType);

		request.setAttribute("lstWordType", lstWordType);
				
		
//		List<String> listMsg = new ArrayList<String>();
//		 
//		listMsg.add("Message A");
//		listMsg.add("Message B");
//		listMsg.add("Message C");
//		listMsg.add("Message D");
// 
//		request.setAttribute("listMsg", listMsg);
//		
//		List<User> listUsers = new ArrayList<User>();
//		 
//		listUsers.add(new User("user1", "http://www.user1.com"));
//		listUsers.add(new User("user2", "http://www.user2.com"));
//		listUsers.add(new User("user3", "http://www.user3.com"));
//		listUsers.add(new User("user4", "http://www.user4.com"));
// 
//		request.setAttribute("listUsers", listUsers);		
		
		return mapping.findForward(SUCCESS);
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		System.out.println("hello init");

	}
	//
	// public void init(ActionMapping mapping, HttpServletRequest request){
	// System.out.println("hello init00");
	// }

}
