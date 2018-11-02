package exercise2;

public class Exercise2 {

	static Person createPerson(String nom, int age) {

		return new Person(nom,age);
	}

	static int computePopulationSize(Person[] tab) {

		int tmp = 0;

		for(Person element : tab)
		{
			if(element != null)
				tmp++;
		}

		return tmp;
	}

	static float computeAveragePopulationAge(Person[] tab) {

		float tmp = 0;

		for(Person element : tab)
		{
			if(element != null)
				tmp += element.getAge();
		}
		tmp = tmp/computePopulationSize(tab);

		return tmp;
	}

	static void resetPopulation(Person[] tab) {

		tab = null;
		tab = new Person[100];
	}



	public static void main(String[] args) {

		Person[] tab = new Person[100];

		for(int i = 0;i<10;i++)
			tab[i] = createPerson("Berndard", i);

		System.out.println(computePopulationSize(tab));
		System.out.println(computeAveragePopulationAge(tab));

		resetPopulation(tab);

		for(Person element : tab)
		{
			if(element != null)
				System.out.print(element.getAge());
		}
	}
}

