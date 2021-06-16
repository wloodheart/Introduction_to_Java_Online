package by.training.wlood.s03_strings_and_basics_of_text_processing.t03_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Дана строка, содержащая следующий текст (xml-документ):

<notes>
    <note id = "1">
        <to>Вася</to>
        <from>Света</from>
        <heading>Напоминание</heading>
        <body>Позвони мне завтра!</body>
    </note>
    <note id = "2">
        <to>Петя</to>
        <from>Маша</from>
        <heading>Важное напоминание</heading>
    <body/>
    </note>
</notes>

Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.
 */
public class Task2 {
	public static void main(String[] args) {
		String xml = "" + "<notes>\n" + "    <note id = \"1\">\n" + "        <to>Вася</to>\n"
				+ "        <from>Света</from>\n" + "        <heading>Напоминание</heading>\n"
				+ "        <body>Позвони мне завтра!</body>\n" + "    </note>\n" + "    <note id = \"2\">\n"
				+ "        <to>Петя</to>\n" + "        <from>Маша</from>\n"
				+ "        <heading>Важное напоминание</heading>\n" + "    <body/>\n" + "    </note>\n" + "</notes>";

		Pattern node = Pattern.compile("<[^/<>]+>([^<>]+)+</[^<>]+>|<([^/<>]+)>|</([^<>]+)>|<([^<>])+/>");
		Matcher matcher = node.matcher(xml);

		while (matcher.find()) {
			if (matcher.group(2) != null)
				System.out.println("Открывающий тег: " + matcher.group(2));
			else if (matcher.group(1) != null)
				System.out.println("Содержимое тега: " + matcher.group(1));
			else if (matcher.group(3) != null)
				System.out.println("Закрывающий тег: " + matcher.group(3));
			else if (matcher.group(4) != null)
				System.out.println("Тег без тела: " + matcher.group(4));
		}
	}
}
