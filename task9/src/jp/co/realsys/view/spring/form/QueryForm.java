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
 * �����w�����N���X
 * 
 * @author Realsys
 */
public class QueryForm extends ActionForm {


    /** �V���[�Y�o�[�W���� */
    private static final long serialVersionUID = 1L;
    
    /** �w���̖��O */
	private String studentName;


	/**
	 * �����w�����`�F�b�N
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
		if (studentName == null || studentName.trim().length() == 0
				|| studentName.trim().length() > 256)
			errors.add("studentName", new ActionMessage("error.studentName.request"));
		return errors;
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		studentName = null;
	}

	
    /**
     * �w���̖��O���擾����
     * 
     * @return String
     */
	public String getStudentName() {
		return studentName;
	}

	
    /**
     * �w���̖��O��ݒ肷��
     * 
     * @param studentName
     */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



}