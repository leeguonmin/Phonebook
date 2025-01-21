package himedia.phonebook.repository.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
@ToString
public class PhonebookVo {
	private Integer id;
	private String name;
	private String hp;
	private String tel;
	
	

}
