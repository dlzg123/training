/*******************************************************************************
 *  �V�X�e���� : �w�����Ǘ�
 *  ���쌠    : Copyright (C)�@2002-2008�@Realsys Co. Ltd. �@All Rights Reserved.
 *  ��Ж�    : ���A���V�X�������
 *  ****************************************************************************
 *  �ύX����
 *  2008/03/20  �쐬�@
 */
package jp.co.realsys.view.spring.form;

import javax.servlet.http.HttpServletRequest;



import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * ���[�U�[���O�C���N���X
 * 
 * @author Realsys
 */
public class LoginForm extends ActionForm {

    /** �V���[�Y�o�[�W���� */
    private static final long serialVersionUID = 1L;

    /** �p�X���[�h */
	private String password;

	/** ���[�U�[ID */
	private String userId;

	/**
	 * ���[�U�[���O�C���`�F�b�N
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if(userId == null || userId.trim().length() == 0)
            errors.add("userName",new ActionMessage("error.username.required"));
        if(password == null || password.trim().length() == 0)
            errors.add("password",new ActionMessage("error.password.required"));
        return errors;
	}

	/**
	 * ���Z�b�g
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		userId = null;
		password = null;
	}

	/**
	 * �p�X���[�h���擾����
	 * 
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * �p�X���[�h��ݒ肷��
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * ���[�U�[ID���擾����
	 * 
	 * @return String
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ���[�U�[ID��ݒ肷��
	 * 
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}