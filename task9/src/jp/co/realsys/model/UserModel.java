/*******************************************************************************
 *  �V�X�e���� : �w�����Ǘ�
 *  ���쌠    : Copyright (C)�@2002-2008�@Realsys Co. Ltd. �@All Rights Reserved.
 *  ��Ж�    : ���A���V�X�������
 *  ****************************************************************************
 *  �ύX����
 *  2008/03/20  �쐬�@
 */
package jp.co.realsys.model;

/**
 * ���[�U�[Model�N���X
 * 
 * @author Realsys
 */
public class UserModel {

	/** ���[�U�[ID */
	private String userId;
	
	/** �p�X���[�h */
	private String password;
	
	/**
	 * �p�X���[�h���擾����
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * �p�X���[�h��ݒ肷��
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * ���[�U�[ID���擾����
	 * 
	 * @return
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * ���[�U�[ID��ݒ肷��
	 * 
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
