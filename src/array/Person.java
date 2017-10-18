package array;

public class Person {
	
	public static final String[] FIRST_START = {"Chr","J","Ju","B","Th","Jo","Br","D"};
	public static final String[] FIRST_MIDDLE = {"ala","e","o","anna","ola","av"};
	public static final String[] FIRST_END = {"n","tt","lius","lion","ck","id"};
	
	public static final String[] LAST_START = {"asd","qwe","gh","hgn","asd","vxc","xcv","T"};
	public static final String[] LAST_MIDDLE = {"k","h","w","t","h","a"};
	public static final String[] LAST_END = {"f","jh","g","f","ftf","n"};
	
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person(String first, String last, Borough home) {
		
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "My name is "+firstName+" "+lastName+" and I am from "+home+".";
	}
	
}
