package by.training.wlood.s04_programming_with_classes.t01_class_and_object;

/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Task3 {
	public static void main(String args[]) {
		Student[] students = { new Student("Данилов О. А.", 15, new int[] { 5, 8, 3, 8, 4 }),
				new Student("Субботин Д. А.", 25, new int[] { 9, 9, 9, 9, 9 }),
				new Student("Лазарев И. И.", 15, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Воронов Б. А.", 15, new int[] { 6, 4, 5, 5, 7 }),
				new Student("Фадеев Ф. А.", 35, new int[] { 10, 8, 8, 7, 8 }),
				new Student("Пасичник Ж. Л.", 45, new int[] { 7, 8, 9, 5, 3 }),
				new Student("Савельев Ю. А.", 25, new int[] { 3, 6, 6, 7, 6 }),
				new Student("Андрухович Я. Ф.", 15, new int[] { 8, 5, 4, 10, 3 }),
				new Student("Моисеенко Б. А.", 25, new int[] { 10, 8, 6, 9, 6 }),
				new Student("Кравченко Л. В.", 15, new int[] { 9, 9, 9, 10, 9 }) };
		
		printExcellentStudent(students);
	}

	static void printExcellentStudent(Student[] students) {
		for (Student student : students)
			if (student.isExcellentStudent())
				System.out.println(student.getFullName() + " группа " + student.getGroup());
	}
}

class Student {
	private String fullName;
	private int group;
	private int[] academicPerformance = new int[5];

	public Student(String fullName, int group, int[] academicPerformance) {
		this.fullName = fullName;
		this.group = group;
		this.academicPerformance = academicPerformance;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int[] getAcademicPerformance() {
		return academicPerformance;
	}

	public void setAcademicPerformance(int[] academicPerformance) {
		this.academicPerformance = academicPerformance;
	}

	public boolean isExcellentStudent() {
		for (int i : academicPerformance)
			if (i < 9)
				return false;

		return true;
	}
}
