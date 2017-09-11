/*******************************************************************************
 *  システム名 : 学生情報管理
 *  著作権    : Copyright (C)　2002-2008　Realsys Co. Ltd. 　All Rights Reserved.
 *  会社名    : リアルシス株式会社
 *  ****************************************************************************
 *  変更履歴
 *  2008/03/20  作成　
 */
package jp.co.realsys.view.spring.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * 削除学生情報クラス
 * 
 * @author Realsys
 */
public class DeleteForm extends ActionForm {
    
    /** シリーズバージョン */
    private static final long serialVersionUID = 1L;
    
    /** 学生ID */
	private String studentId;

	/**
	 * 学生情報削除チェック
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
	 * リセット
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		studentId = null;
	}

	/**
	 * 学生IDを取得する
	 * 
	 * @return String
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * 学生IDを設定する
	 * 
	 * @param studentId
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}