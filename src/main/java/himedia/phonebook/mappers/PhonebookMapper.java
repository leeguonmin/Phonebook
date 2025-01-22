package himedia.phonebook.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import himedia.phonebook.repository.vo.PhonebookVo;

// 1:1 매칭
// 무슨 말이냐면
// 이 매퍼 인터페이스를 mybatis mapper 설정의 namespace 로 등록해 줘야 한다! (이게 일대일 1:1 매칭)
// xml 과 인터페이스를 1:1 매칭

@Mapper		// mybatis Mapper 
public interface PhonebookMapper {
// <select id="selectAll" resultType="phonebookVo">
	List<PhonebookVo> selectAll();
	
//	<insert id="insert" parameterType="phonebookVo"> (우리가 정의하고 싶은거)
	int insert(PhonebookVo phonebookVo);
	
// 	<insert id="insert" parameterType="phonebookVo">	
	/* @Select("SELECT * FROM phonebook WHERE id=#{id}")  			// 이렇게 쓸 수도 있음 */
	PhonebookVo selectOne(Integer id);								// 근데 우린 이렇게 쓸거임
	
	
// <update id="update" parameterType="phonebookVo">
	int update(PhonebookVo phonebookVo);
}




