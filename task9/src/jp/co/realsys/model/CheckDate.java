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
 * ���t�`�F�b�N�N���X
 * 
 * @author Realsys
 */
public class CheckDate {
    
    /**
     * ���N�����`�F�b�N
     * 
     * @param ���N����
     * @return
     */
	public boolean checkBirthdate(String str) {
	    if(str.charAt(0) == '0') {
			return false;
		 }
		for (int i = 0; i < str.length(); i++) {
              if (i != 4 && i != 7) {
                   if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                            return false;
                    }
               }
         }
		int year = 0;
		int month = 0;
		int day = 0;

		year = Integer.parseInt(str.substring(0, 4));
		month = Integer.parseInt(str.substring(5, 7));
		day = Integer.parseInt(str.substring(8, 10));

		if (year > 2006 || year < 1900) {
			return false;
		}
		if (month > 12 || month < 0) {
			return false;

		}
		if (day < 32 && day > 0) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return true;
			case 4:
			case 6:
			case 9:
			case 11:
				if (day < 31) {
					return true;
				}
			case 2:
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					if (day < 30) {
						return true;
					}
				} else if (day < 29) {
					return true;
				}
			}
		}
		return false;
	}
}