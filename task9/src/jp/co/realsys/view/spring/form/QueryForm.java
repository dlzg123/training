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
 * 検索学生情報クラス
 * 
 * @author Realsys
 */
public class QueryForm extends ActionForm {


    /** シリーズバージョン */
    private static final long serialVersionUID = 1L;
    
    /** 学生の名前 */
	private String studentName;


	/**
	 * 検索学生情報チェック
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
     * 学生の名前を取得する
     * 
     * @return String
     */
	public String getStudentName() {
		return studentName;
	}

	
    /**
     * 学生の名前を設定する
     * 
     * @param studentName
     */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



}