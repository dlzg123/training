/*******************************************************************************
 *  システム名 : 学生情報管理
 *  著作権    : Copyright (C)　2002-2008　Realsys Co. Ltd. 　All Rights Reserved.
 *  会社名    : リアルシス株式会社
 *  ****************************************************************************
 *  変更履歴
 *  2008/03/20  作成　
 */
package jp.co.realsys.view.spring.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.realsys.dao.StudentDao;
import jp.co.realsys.error.TaskException;
import jp.co.realsys.model.BeanFactory;
import jp.co.realsys.model.StudentModel;
import jp.co.realsys.view.spring.form.AddForm;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;


/**
 * 学生情報を追加クラス
 * 
 * @author Realsys
 */
public class AddAction extends Action {


    /**
     * 学生DAO
     */
    private StudentDao studentDao;


	/**
	 * メソッド　実行
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws TaskException {
	    Logger task8Logger = Logger.getLogger("task8Logger");
	    task8Logger.warn("add student is strat,this is a warn message!");
	    task8Logger.error("add student is strat,this is a error message!");
	    task8Logger.fatal("add student is strat,this is a fatal message!");
	    //メニュ画面へ遷移する
	    if(isCancelled(request)) {
            return mapping.findForward("mainMenu");
        }
	    
	    AddForm addForm = (AddForm) form;
	    ActionForward actionForward = new ActionForward();
	    String studentId = addForm.getStudentId();
	    String birthdate = addForm.getStudentBirthdate();
	    if (!BeanFactory.getCheckDate().checkBirthdate(birthdate)) {
	    	ActionMessages errors = new ActionMessages();
			errors.add("studentBirthdate", new ActionMessage("error.studentBirthdate.required"));
			saveErrors(request, errors);
			return new ActionForward(mapping.getInput());
	    }
	    if(studentDao.getStudentById(studentId) != null) {
	    	ActionMessages errors=new  ActionMessages();
			errors.add("studentId",new ActionMessage("error.add.required"));
			saveErrors(request,errors);
			return new ActionForward(mapping.getInput()); 
		} 	    
		StudentModel student = new StudentModel();
		student.setAddress(addForm.getStudentAddress());
		student.setBirthDate(addForm.getStudentBirthdate());
		student.setId(studentId);
		student.setName(addForm.getStudentName());
		studentDao.doRegisterStduent(student);
        actionForward = mapping.findForward("success");
		
		//ログ
		task8Logger.warn("add student is end,this is a warn message!");
	    task8Logger.error("add student is end,this is a error message!");
	    task8Logger.fatal("add student is end,this is a fatal message!");

	    return actionForward;
	}

	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}