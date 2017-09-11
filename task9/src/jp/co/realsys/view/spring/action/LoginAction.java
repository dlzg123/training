/*******************************************************************************
 *  �V�X�e���� : �w�����Ǘ�
 *  ���쌠    : Copyright (C)�@2002-2008�@Realsys Co. Ltd. �@All Rights Reserved.
 *  ��Ж�    : ���A���V�X�������
 *  ****************************************************************************
 *  �ύX����
 *  2008/03/20  �쐬�@
 */
package jp.co.realsys.view.spring.action;

import java.sql.Date;
import java.sql.Time;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.realsys.dao.UserDao;
import jp.co.realsys.model.UserModel;
import jp.co.realsys.view.spring.form.LoginForm;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;


/**
 * ���O�C���N���X
 * 
 * @author Realsys
 */
public class LoginAction extends Action {

    /**
     * ���[�UDAO
     */
    private UserDao userDao;


	/**
     * ���\�b�h�@���s
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
	    //���O
	    Logger task8Logger = Logger.getLogger("task8Logger");
	    task8Logger.warn("login is strat,this is a warn message!");
	    task8Logger.error("login is strat,this is a error message!");
	    task8Logger.fatal("login is strat,this is a fatal message!");
	    
		LoginForm loginForm = (LoginForm) form;
		ActionForward actionForward = new ActionForward();
		String userId = loginForm.getUserId();
		String password = loginForm.getPassword();
		UserModel user = new UserModel();
		user.setUserId(userId);
		user.setPassword(password);
		UserModel userNew = userDao.getUser(user);

		if(userNew != null){
			//���j�����
		    HttpSession session = request.getSession();
			session.setAttribute("userId",userId);
			String date=(new Date(System.currentTimeMillis()).toString())+"  "+(new Time(System.currentTimeMillis()).toString());
			session.setAttribute("date",date);
			actionForward = mapping.findForward("mainMenu");
		}
		else {
			//�`�F�b�N���O
			ActionMessages errors=new ActionMessages();
			errors.add("userName",new ActionMessage("error.check.required"));
			saveErrors(request,errors);
			actionForward =new ActionForward(mapping.getInput());
		}
		//print log
		task8Logger.warn("login is end,this is a warn message!");
	    task8Logger.error("login is end,this is a error message!");
	    task8Logger.fatal("login is end,this is a fatal message!");
		return actionForward;
	}
	
	public UserDao getUserDao() {
        return userDao;
    }
    
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}