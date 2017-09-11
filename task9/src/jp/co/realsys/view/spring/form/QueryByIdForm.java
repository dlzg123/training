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
 * ID�ɂ��A�w�����̌����N���X
 * 
 * @author Realsys
 */
public class QueryByIdForm extends ActionForm {

    /** �V���[�Y�o�[�W���� */
    private static final long serialVersionUID = 1L;
    
    /** �w��ID */
    private String studentId;


    /** 
     * ID�ɂ��A�w�����̌����`�F�b�N
     * @param mapping
     * @param request
     * @return ActionErrors
     */
    public ActionErrors validate(
        ActionMapping mapping,
        HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
		if (studentId == null || studentId.trim().length() == 0
				|| studentId.trim().length() > 256)
			errors.add("studentName", new ActionMessage("error.studentName.request"));
		return errors;
    }

    /** 
     * ���Z�b�g
     * @param mapping
     * @param request
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        
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