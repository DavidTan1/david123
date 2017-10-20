package array;

public class Person {
	
	public static final String[] FIRST_START = {"Chr","J","Ju","B","Th","Jo","Br","D"};
	public static final String[] FIRST_MIDDLE = {"ala","e","o","anna","ola","av"};
	public static final String[] FIRST_END = {"n","tt","lius","lion","ck","id"};
	
	public static final String[] LAST_START = {"S","Pa","Wi","By","J","T"};
	public static final String[] LAST_MIDDLE = {"o","rk","ls","ck","or","am"};
	public static final String[] LAST_END = {"n","er","on","dan"};
	
	private String firstName;
	private String lastName;
	private Borough home;
	private Hobby hobby;
	private Person[] friends;
	private String nickname;
	
	public Person(String first, String last, Borough home) {
		
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		friends = new Person[3];
		hobby = Hobby.randomHobby();
		nickname = createNickname(firstName);
		// TODO Auto-generated constructor stub
	}
	
	public static String createNickname(String name)
	{
		String nickname = "";
		int vowels = 0;
		for(int i=0; i<name.length(); i++)
		{
			String letter = name.substring(i,i+1);
			
			if(isVowel(letter))
			{
				vowels++;
				if(vowels!=2)
				{
					nickname = nickname + letter;
				}
				else
				{
					return nickname;
				}
			}
			else
			{
				nickname = nickname + letter;
			}
		}
		return name;
	}
	
	public static boolean isVowel(String letter)
	{
		letter = letter.toLowerCase();
		return letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u");
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
	
	public void statYourFriends() {
		String statement = "My friends are ";
		for(int i =0; i < friends.length-1;i++) {
			statement += friends[i].firstName +" "+friends[i].lastName;
		}
		statement += "and " + friends[friends.length-1];
		System.out.println(statement);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
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
		return "My name is "+firstName+" "+lastName+". Call me "+nickname+". and I am from "+home+".";
	}

	
	
}
