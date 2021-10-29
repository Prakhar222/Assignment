package com.yash.CachingLevel;
import java.util.ArrayList;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="Product")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Product
{
	@Id
	private int pid;
	private String pname;
	private String color;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	Product(){};
	public Product(int pid, String pname, String color) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.color = color;
	}
	
	
   @Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", color=" + color + "]";
	}



	
			
}
