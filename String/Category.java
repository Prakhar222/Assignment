package com.java.code;

public class Category {
		int id;
		String name;
		String createDate; 
		public void setter(int id,String name,String createDate)
		{
			this.id=id;
			this.name=name;
			this.createDate=createDate;
		}
		public void getter()
		{
			System.out.println("id:"+id);
			System.out.println("name:"+name);
			System.out.println("createDate:"+createDate);
		}
		void showCategoryDetail()
		{
			setter(101,"name:javabasics","31/01/2017");
			getter();
		}
	 public static void main(String args[])
		{
		Category c1=new Category();
		c1.showCategoryDetail();
		}

	}
	
