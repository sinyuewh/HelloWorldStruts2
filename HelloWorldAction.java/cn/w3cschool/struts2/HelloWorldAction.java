package cn.w3cschool.struts2;

public class HelloWorldAction{
   private String name;

   public String execute() throws Exception {
      return "success";
   }
   
   public String getName() {
       int i=10;
	   return name;
   }

   public void setName(String name) {
	   
	   this.name = name;
   }
}
