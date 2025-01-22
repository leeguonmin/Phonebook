package himedia.phonebook.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.phonebook.exceptions.PhonebookDaoException;
import himedia.phonebook.mappers.PhonebookMapper;
import himedia.phonebook.repository.vo.PhonebookVo;

@Repository
public class PhoneDaoImpl implements PhonebookDao {
	@Autowired
	private PhonebookMapper phonebookMapper;
	
	@Override
	public int inert(PhonebookVo phonebookVo) {
		try {
			return phonebookMapper.insert(phonebookVo);
		} catch (Exception e) {
			throw new PhonebookDaoException("전화번호 입력 중 예외 발생", e, phonebookVo );
		} 
	}

	@Override
	public int update(PhonebookVo phonebookVo) {
		try {
			return phonebookMapper.update(phonebookVo);
		} catch (Exception e) {
			throw new PhonebookDaoException("전화번호 수정 중 예외 발생,", e, phonebookVo);
		}
		
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PhonebookVo selectOne(Integer id) {
		PhonebookVo phonebookVo = phonebookMapper.selectOne(id);
		
		return phonebookVo;
	}

	@Override
	public List<PhonebookVo> selectAll() {
		List<PhonebookVo> list=phonebookMapper.selectAll();
		return list;
	}

}
