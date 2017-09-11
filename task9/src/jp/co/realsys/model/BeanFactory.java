/*******************************************************************************
 *  システム名 : 学生情報管理
 *  著作権    : Copyright (C)　2002-2008　Realsys Co. Ltd. 　All Rights Reserved.
 *  会社名    : リアルシス株式会社
 *  ****************************************************************************
 *  変更履歴
 *  2008/03/20  作成　
 */
package jp.co.realsys.model;

/**
 * 学生情報ファクトリクラス
 * 
 * @author Realsys
 */
public class BeanFactory {
    
    /**
     * 学生情報モデルを取得する
     *
     * @return 学生情報モデル
     */
	public static StudentModel getStudent() {
		return new StudentModel();
	}
    
    /**
     * 日付チェックを取得する
     *
     * @return 日付チェック
     */
	public static CheckDate getCheckDate() {
		return new CheckDate();
	}

}