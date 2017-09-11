/*******************************************************************************
 *  �V�X�e���� : �w�����Ǘ�
 *  ���쌠    : Copyright (C)�@2002-2008�@Realsys Co. Ltd. �@All Rights Reserved.
 *  ��Ж�    : ���A���V�X�������
 *  ****************************************************************************
 *  �ύX����
 *  2008/03/20  �쐬�@
 */
package jp.co.realsys.view.spring.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.realsys.dao.StudentDao;
import jp.co.realsys.error.TaskException;
import jp.co.realsys.model.BeanFactory;
import jp.co.realsys.model.StudentModel;
import jp.co.realsys.view.spring.form.UpdateForm;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;


/**
 * �w�������X�V�N���X
 * 
 * @author Realsys
 */
public class UpdateAction extends Action {

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
        //back to mainMenu
        if(isCancelled(request)) {
            return mapping.findForward("mainMenu");
        }
        //print log
        Logger task8Logger = Logger.getLogger("task8Logger");
	    task8Logger.warn("update student is strat,this is a warn message!");
	    task8Logger.error("update student is strat,this is a error message!");
	    task8Logger.fatal("update student is strat,this is a fatal message!");
	    
        ActionForward actionForward = new ActionForward();
        UpdateForm updateForm = (UpdateForm) form;        
        String studentBirthdate = updateForm.getStudentBirthdate();
        if (!BeanFactory.getCheckDate().checkBirthdate(studentBirthdate)) {
        	ActionMessages errors = new ActionMessages();
			errors.add("studentBirthdate", new ActionMessage("error.studentBirthdate.request"));
			saveErrors(request, errors);
			actionForward = new ActionForward(mapping.getInput());
		} else {
		    StudentModel student = new StudentModel();
	        student.setId(updateForm.getStudentId());
	        student.setAddress(updateForm.getStudentAddress());
	        student.setName(updateForm.getStudentName());
	        student.setBirthDate(studentBirthdate);
	        studentDao.doUpdateStduent(student);
			actionForward = mapping.findForward("success");
		}
        //print log
        task8Logger.warn("update student is end,this is a warn message!");
	    task8Logger.error("update student is end,this is a error message!");
	    task8Logger.fatal("update student is end,this is a fatal message!");

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