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
 * IDにより、学生情報の検索クラス
 * 
 * @author Realsys
 */
public class QueryByIdForm extends ActionForm {

    /** シリーズバージョン */
    private static final long serialVersionUID = 1L;
    
    /** 学生ID */
    private String studentId;


    /** 
     * IDにより、学生情報の検索チェック
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
     * リセット
     * @param mapping
     * @param request
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        
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