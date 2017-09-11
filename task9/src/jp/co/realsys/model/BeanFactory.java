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
 * �w�����t�@�N�g���N���X
 * 
 * @author Realsys
 */
public class BeanFactory {
    
    /**
     * �w����񃂃f�����擾����
     *
     * @return �w����񃂃f��
     */
	public static StudentModel getStudent() {
		return new StudentModel();
	}
    
    /**
     * ���t�`�F�b�N���擾����
     *
     * @return ���t�`�F�b�N
     */
	public static CheckDate getCheckDate() {
		return new CheckDate();
	}

}