/*******************************************************************************
 *  システム名 : 学生情報管理
 *  著作権    : Copyright (C)　2002-2008　Realsys Co. Ltd. 　All Rights Reserved.
 *  会社名    : リアルシス株式会社
 *  ****************************************************************************
 *  変更履歴
 *  2008/03/20  作成　
 */
package jp.co.realsys.view.spring.action;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.realsys.dao.StudentDao;
import jp.co.realsys.error.TaskException;
import jp.co.realsys.model.StudentModel;
import jp.co.realsys.view.spring.form.QueryForm;

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
public class QueryAction extends Action {

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
	    task8Logger.warn("query student is strat,this is a warn message!");
	    task8Logger.error("query student is strat,this is a error message!");
	    task8Logger.fatal("query student is strat,this is a fatal message!");
	    
		ActionForward actionForward=new ActionForward();
		QueryForm queryForm = (QueryForm) form;       
		String studentName=queryForm.getStudentName();
		Collection<StudentModel> collection=studentDao.doQueryStduentList(studentName);
		if(collection == null || collection.size() == 0)
		{
			ActionMessages errors=new ActionMessages();
			errors.add("studentName",new ActionMessage("error.query.studentName"));
			saveErrors(request,errors);
			actionForward=new ActionForward(mapping.getInput());
		}else{
			if(request.getAttribute("collection")!=null)
			{
				request.removeAttribute("collection");
			}
			request.setAttribute("collection",collection);
			actionForward=mapping.findForward("view");			
		}
		//ログ
		task8Logger.warn("query student is end,this is a warn message!");
	    task8Logger.error("query student is end,this is a error message!");
	    task8Logger.fatal("query student is end,this is a fatal message!");

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