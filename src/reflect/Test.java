package reflect;

public class Test {
		  public static void main(String[] args){
		   Class< ?> c1 = null;
		   try{
		        c1 = Class.forName("reflect.Person");
		   }catch(ClassNotFoundException e){
		    e.printStackTrace();
		   }   
		   Person p1 = null;
		   try {
		   p1 =(Person)c1.newInstance();
		 } catch (InstantiationException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
		 } catch (IllegalAccessException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
		 }
		 
		 
		   p1.setAge(12);
		   p1.setName("haobo");
		   System.out.println(p1);
		  }


}
	class Person{
		 private int age;
		 private String name;
		 public int getAge() {
		  return age;
		 }
		 public void setAge(int age) {
		  this.age = age;
		 }
		 public String getName() {
		  return name;
		 }
		 public void setName(String name) {
		  this.name = name;
		 }
		 public String toString(){
		  return "年龄是："+this.age+"  姓名是："+this.name;
		  
		 } 
		 
		}
		
