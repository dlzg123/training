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
import jp.co.realsys.view.spring.form.DeleteForm;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;


/**
 * 学生情報を削除クラス
 * 
 * @author Realsys
 */
public class DeleteAction extends Action {

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
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws TaskException {	  
	    //メニュ画面へ遷移する
	    if(isCancelled(request)) {
            return mapping.findForward("mainMenu");
        }
	    //ログ
	    Logger task8Logger = Logger.getLogger("task8Logger");
	    task8Logger.warn("delete student is strat,this is a warn message!");
	    task8Logger.error("delete student is strat,this is a error message!");
	    task8Logger.fatal("delete student is strat,this is a fatal message!");	  
	    
		ActionForward actionForward=new ActionForward();
		DeleteForm deleteForm = (DeleteForm) form;
		String studentId=deleteForm.getStudentId();
		if(studentDao.getStudentById(studentId)!=null) {
			studentDao.doDeleteStduent(studentId);
			actionForward=mapping.findForward("success");
		} else {		    
			ActionMessages errors=new  ActionMessages();
			errors.add("studentId",new ActionMessage("error.delete.id"));
			saveErrors(request,errors);
			return new ActionForward(mapping.getInput());
		}
		
		//ログ
		task8Logger.warn("delete student is end,this is a warn message!");
	    task8Logger.error("delete student is end,this is a error message!");
	    task8Logger.fatal("delete student is end,this is a fatal message!");
		
	    return actionForward;
	}

    /**
     * @return Returns the studentDao.
     */
    public StudentDao getStudentDao() {
        return studentDao;
    }
    /**
     * @param studentDao The studentDao to set.
     */
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}