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
 * �V�K�w�����N���X
 * 
 * @author Realsys
 */
public class AddForm extends ActionForm {
	
    /** �V���[�Y�o�[�W���� */
    private static final long serialVersionUID = 1L;

    /** �w���̖��O */
	private String studentName;

    /** �w��ID */
	private String studentId;

    /** �w���̏Z�� */
	private String studentAddress;

    /** �w���̐��N���� */
	private String studentBirthdate;


	/**
	 * �w�������̓`�F�b�N
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		if (studentName == null || studentName.trim().length() == 0
				|| studentName.trim().length() > 256) {
			errors.add("studentName", new ActionMessage("error.studentName.request"));
		}
		if (studentId == null || studentId.trim().length() == 0
				|| studentId.trim().length() > 20) {
			errors.add("studentId", new ActionMessage("error.studentId.request"));
		}
		if (studentAddress == null || studentAddress.trim().length() == 0
				|| studentAddress.trim().length() > 256) {
			errors.add("studentAddress",
					new ActionMessage("error.studentAddress.request"));
		}
		if (studentBirthdate == null || studentBirthdate.trim().length() == 0
				|| studentBirthdate.trim().length() != 10
				|| studentBirthdate.trim().split("/").length != 3) {
			errors.add("studentBirthdate", new ActionMessage(
					"error.studentBirthdate.request"));
		}

		return errors;
	}

	/**
	 * ���Z�b�g
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		studentName = null;
		studentId = null;
		studentAddress = null;
		studentBirthdate = null;
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

	/**
	 * �w���̏Z�����擾����
	 * 
	 * @return String
	 */
	public String getStudentAddress() {
		return studentAddress;
	}

	/**
	 * �w���̏Z����ݒ肷��
	 * 
	 * @param studentAddress
	 */
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	/**
	 * �w���̐��N�������擾����
	 * 
	 * @return String
	 */
	public String getStudentBirthdate() {
		return studentBirthdate;
	}

	/**
	 * �w���̐��N������ݒ肷��
	 * 
	 * @param studentBirthdate
	 */
	public void setStudentBirthdate(String studentBirthdate) {
		this.studentBirthdate = studentBirthdate;
	}

}