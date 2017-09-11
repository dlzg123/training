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
 * ユーザーログインクラス
 * 
 * @author Realsys
 */
public class LoginForm extends ActionForm {

    /** シリーズバージョン */
    private static final long serialVersionUID = 1L;

    /** パスワード */
	private String password;

	/** ユーザーID */
	private String userId;

	/**
	 * ユーザーログインチェック
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
	 * リセット
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		userId = null;
		password = null;
	}

	/**
	 * パスワードを取得する
	 * 
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを設定する
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * ユーザーIDを取得する
	 * 
	 * @return String
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを設定する
	 * 
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}