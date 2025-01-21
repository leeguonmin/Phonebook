package himedia.phonebook.repository.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 *  id INTEGER AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(10),
    hp VARCHAR(20),
    tel VARCHAR(20)
 * 
 * */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PhonebookVo {
	private Integer id;
	private String name;
	private String hp;
	private String tel;
	
	

}
