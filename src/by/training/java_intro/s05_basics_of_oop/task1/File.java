package by.training.java_intro.s05_basics_of_oop.task1;

import java.util.Objects;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		File file = (File) o;
		return Objects.equals(name, file.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}
