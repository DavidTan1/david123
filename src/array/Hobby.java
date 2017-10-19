package array;

public class Hobby extends Thing{
	public Hobby(String description) {
		super(description);
	}
	
	public static Hobby randomHobby() 
	{
		Hobby[] h = {new Hobby("Playing video games"), new Hobby("dancing"),new Hobby("going for long walk")};
	}
	
}
