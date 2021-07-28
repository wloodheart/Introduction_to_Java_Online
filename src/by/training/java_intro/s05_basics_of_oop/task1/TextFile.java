package by.training.java_intro.s05_basics_of_oop.task1;

import java.util.Objects;

public class TextFile extends File{
    private String content;

    public TextFile(String name) {
        super(name);
    }

    public TextFile(String name, String content) {
        super(name);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		TextFile textFile = (TextFile) o;
		return Objects.equals(content, textFile.content);
	}

	public int hashCode() {
		return Objects.hash(super.hashCode(), content);
	}

	@Override
	public String toString() {
		return "TextFile [content=" + content + "]";
	}

    
}
