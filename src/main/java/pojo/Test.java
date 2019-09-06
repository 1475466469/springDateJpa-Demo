package pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //声明实体类
@Table(name="test") //建立实体类和表的映射关系
public class Test implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //配置主键的生成策略
	@Column(name="id") //指定和表中 cust_id 字段的映射关系
	private  int  id;
	@Column(name="name") //指定和表中 cust_id 字段的映射关系
	private  String name;
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	private int count;
		

		
	
	
	
	
}
