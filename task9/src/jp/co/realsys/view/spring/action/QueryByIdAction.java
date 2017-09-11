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
import jp.co.realsys.model.StudentModel;
import jp.co.realsys.view.spring.form.QueryByIdForm;
import jp.co.realsys.view.spring.form.UpdateForm;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;


/**
 * 学生情報を検索クラス
 * 
 * @author Realsys
 */
public class QueryByIdAction extends Action {

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
        HttpServletResponse response) {
        //メニュ画面へ遷移する
        if(isCancelled(request)) {
            return mapping.findForward("mainMenu");
        }
        //print log
        Logger task8Logger = Logger.getLogger("task8Logger");
	    task8Logger.warn("query student by id is strat,this is a warn message!");
	    task8Logger.error("query student by id is strat,this is a error message!");
	    task8Logger.fatal("query student by id is strat,this is a fatal message!");
	    //
        QueryByIdForm queryByIdForm = (QueryByIdForm) form;
        String studentId = queryByIdForm.getStudentId();
        ActionForward actionForward = new ActionForward();
		StudentModel student = studentDao.getStudentById(studentId);
		if (student == null) {
			ActionMessages errors = new ActionMessages();
			errors.add("studentId", new ActionMessage("error.query.studentId"));
			saveErrors(request, errors);
			return new ActionForward(mapping.getInput());
		} else {
			UpdateForm updateForm = new UpdateForm();
			updateForm.setStudentId(student.getId());
			updateForm.setStudentAddress(student.getAddress());
			updateForm.setStudentName(student.getName());
			String stuBirthdate = student.getBirthDate().substring(0,4) + "/" +
				student.getBirthDate().substring(5,7) + "/" + student.getBirthDate().substring(8,10);
			updateForm.setStudentBirthdate(stuBirthdate);			
			request.setAttribute("springUpdateForm", updateForm);			
			actionForward = mapping.findForward("updateView");
		}
		//ログ
		task8Logger.warn("query student by id is end,this is a warn message!");
	    task8Logger.error("query student by id is end,this is a error message!");
	    task8Logger.fatal("query student by id is end,this is a fatal message!");

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