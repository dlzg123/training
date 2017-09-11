/*
 * Created on 2006/10/24
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package jp.co.realsys.dao.ibatis;

import java.util.List;

import jp.co.realsys.error.TaskException;
import jp.co.realsys.model.StudentModel;
import jp.co.realsys.dao.StudentDao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @author Administrator
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class StudentIbatisDaoImpl extends SqlMapClientDaoSupport implements
		StudentDao {

	public StudentModel getStudentById(String id) {
		return (StudentModel) getSqlMapClientTemplate().queryForObject(
				"getStudentById", id);
	}

	public int doDeleteStduent(String studentId) throws TaskException {
		return getSqlMapClientTemplate().delete("delete", studentId);
	}

	@SuppressWarnings("unchecked")
	public List<StudentModel> doQueryStduentList(String name) throws TaskException {
		return getSqlMapClientTemplate().queryForList("getStudentByName", name);
	}

	public int doRegisterStduent(StudentModel student) throws TaskException {
		return getSqlMapClientTemplate().insert("saveStudent", student) == null ? 0
				: 1;
	}

	public int doUpdateStduent(StudentModel student) throws TaskException {
		return getSqlMapClientTemplate().update("updateStudent", student);
	}
}
