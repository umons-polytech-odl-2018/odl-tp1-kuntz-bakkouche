package exercise1;

class Person {

	private int age;
	private String nom;

	public Person(String nom, int age)
	{
		this.nom = nom;
		this.age = age;
	}

	public String getNom()
	{
		return nom;
	}

	public int getAge()
	{
		return age;
	}
}
