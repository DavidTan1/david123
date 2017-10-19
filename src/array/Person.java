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
	private Hobby hobby;
	private Person[] friends;
	
	
	public Person(String first, String last, Borough home) {
		
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		friends = new Person[3];
		hobby = Hobby.randomHobby();
		// TODO Auto-generated constructor stub
	}
	
	public void mingle(Person[] peers)
	{
		for(Person p: peers)
		{	
			//you cannot friend yourself
			if(p != this)
			{
				setInFirstPlace(p);
			}
		}
	}
	
	public void stateYourFriends()
	{
		String friend1 = friends[0].firstName;
		String statement = "My friends are ";
		for(int i=0; i<friends.length-1; i++)
		{
			if(i==friends.length)
			{
				friend1 = statement+", and"+friends[i];
			}
			
			statement = statement+friends[i].firstName;		
		}
		
		return statement;
	}
	
	public void setInFirstPlace(Person f)
	{
		//go backward
		for(int i = friends.length - 1; i>0; i--)
		{
			friends[i] = friends[i-1];
		}
		friends[0] = f;
	}
	
	public String toString() {
		return "My name is "+firstName+" "+lastName+" and I am from "+home+".";
	}
	
}
