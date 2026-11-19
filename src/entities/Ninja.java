package entities;

public class Ninja {
	private String name;
	private String village;
	private String rank;
	private int age;
	private int chakra = 100;
	private int missionsCompleted;

	public Ninja(String name, String village, String rank, int age) {
		this.name = name;
		this.village = village;
		this.rank = rank;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVillage() {
		return village;
	}

	public String getRank() {
		return rank;
	}

	public int getAge() {
		return age;
	}

	public int getChakra() {
		return chakra;
	}

	public int getMissionsCompleted() {
		return missionsCompleted;
	}

	public int useChakra(int amount) {
		if (amount > 0 && amount <= chakra) {
			this.chakra -= amount;
		} else {
			System.out.println("Não é possivel utilizar essa quantidade");
		}
		return this.chakra;
	}

	public int train(int amount) {
		if (amount > 0) {
			this.chakra += amount;

			if (chakra > 100) {
				this.chakra = 100;
			}

		} else {
			System.out.println("Valor invalido!");
		}

		return this.chakra;
	}

	public void completeMission() {
		this.missionsCompleted += 1;
		if (this.missionsCompleted < 5) {
			this.rank = "Genin";
		} else if (this.missionsCompleted < 10) {
			this.rank = "Chunin";
		} else {
			this.rank = "Jounin";
		}

	}

	public String toString() {
		return "Nome: " + name + "\nVila: " + village + "\nPatente: " + rank + "\nIdade: " + age + "\nChakra: " + chakra
				+ "\nMissões concluídas: " + missionsCompleted;
	}

}
