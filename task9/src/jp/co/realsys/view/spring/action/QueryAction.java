/*******************************************************************************
 *  �V�X�e���� : �w�����Ǘ�
 *  ���쌠    : Copyright (C)�@2002-2008�@Realsys Co. Ltd. �@All Rights Reserved.
 *  ��Ж�    : ���A���V�X�������
 *  ****************************************************************************
 *  �ύX����
 *  2008/03/20  �쐬�@
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
 * �w�����������N���X
 * 
 * @author Realsys
 */
public class QueryAction extends Action {

    /**
     * �w��DAO
     */
    private StudentDao studentDao;

	/** 
     * ���\�b�h�@���s
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
	    //���j����ʂ֑J�ڂ���
	    if(isCancelled(request)) {
            return mapping.findForward("mainMenu");
        }
	    //���O
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
		//���O
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