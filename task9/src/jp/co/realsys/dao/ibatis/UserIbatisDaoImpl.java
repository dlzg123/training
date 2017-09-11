/*
 * Created on 2006/10/24
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package jp.co.realsys.dao.ibatis;

import jp.co.realsys.dao.UserDao;
import jp.co.realsys.model.UserModel;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @author Administrator
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class UserIbatisDaoImpl extends SqlMapClientDaoSupport implements UserDao {
    public UserModel getUser(UserModel user) {
        return (UserModel) getSqlMapClientTemplate().queryForObject("getUser", user);
    }
}