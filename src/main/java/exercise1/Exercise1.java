package exercise1;

public class Exercise1 {
	static Person createPerson(String nom, int age) {

		// Ajoutez les champs name et age à la classe Person.
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		return new Person(nom,age);
	}

	public static void main(String[] args) {

		String nom = "Nicolas";
		int age = 20;

		Person moi = createPerson(nom,age);

		System.out.println(moi.getNom());
		System.out.println(moi.getAge());

		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.
	}
}
