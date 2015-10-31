package pitstop;

public class College {
	
	private String name;
	private int size, month, day, year;
	
	public College(String n, int s, int m, int d, int y)
	{
		name = n;
		size = s;
		month = m;
		day = d;
		year = y;
		
	}
	
	public String toString(){
		return "Name: " + name + "\n" + "Size: " + size + "\n" + "Application Deadline: " +
				month + "/" + day + "/" + year;
		
	}
	public String getname(){
		return "Name: " + name ;
	}
	public String getsize(){
		return "Size: " + size;
		
	}
	public String getdeadline(){
		return "Application Deadline: " +
				month + "/" + day + "/" + year;
	}
	
	 
	
	
}
