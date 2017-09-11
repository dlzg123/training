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
 * �폜�w�����N���X
 * 
 * @author Realsys
 */
public class DeleteForm extends ActionForm {
    
    /** �V���[�Y�o�[�W���� */
    private static final long serialVersionUID = 1L;
    
    /** �w��ID */
	private String studentId;

	/**
	 * �w�����폜�`�F�b�N
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
		if (studentId == null || studentId.trim().length() == 0
				|| studentId.trim().length()>20)
			errors.add("studentId", new ActionMessage("error.studentId.request"));
		return errors;
	}

	/**
	 * ���Z�b�g
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		studentId = null;
	}

	/**
	 * �w��ID���擾����
	 * 
	 * @return String
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * �w��ID��ݒ肷��
	 * 
	 * @param studentId
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}