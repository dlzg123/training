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
 * 更新学生情報クラス
 * 
 * @author Realsys
 */
public class UpdateForm extends ActionForm {

    // --------------------------------------------------------- Instance Variables

    /** シリーズバージョン */
    private static final long serialVersionUID = 1L;

    /** 学生ID */
    private String studentId;

    /** 学生の住所 */
    private String studentAddress;

    /** 学生の名前 */
    private String studentName;

    /** 学生の生年月日 */
    private String studentBirthdate;

    /** 
     * 更新学生情報チェック
     * @param mapping
     * @param request
     * @return ActionErrors
     */
    public ActionErrors validate(
        ActionMapping mapping,
        HttpServletRequest request) {
    	ActionErrors errors = new ActionErrors();
		if (studentName == null || studentName.trim().length() == 0
				|| studentName.trim().length() > 256) {
			errors.add("studentName", new ActionMessage("error.studentName.request"));
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
     * リセット
     * @param mapping
     * @param request
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {

    }

    /**
     * 学生の住所を取得する
     * 
     * @return String
     */
    public String getStudentAddress() {
        return studentAddress;
    }
    
    /**
     * 学生の住所を設定する
     * 
     * @param studentAddress
     */
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    
    /**
     * 学生の生年月日を取得する
     * 
     * @return String
     */
    public String getStudentBirthdate() {
        return studentBirthdate;
    }
    
    /**
     * 学生の生年月日を設定する
     * 
     * @param studentBirthdate
     */
    public void setStudentBirthdate(String studentBirthdate) {
        this.studentBirthdate = studentBirthdate;
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