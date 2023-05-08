
/**
 * Task02
 * Дана строка (получение через обычный текстовый файл!!!)
 * "фамилия":"Иванов","оценка":"5","предмет":"Математика"
 * "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
 * Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
 * Студент [фамилия] получил [оценка] по предмету [предмет].
 * Пример вывода в консоль:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 */

import java.io.File;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        File file = new File("file.txt");
        Scanner scanner = null;

        try {

            scanner = new Scanner(file);

        } catch (Exception e) {

            e.printStackTrace();

        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split(";");
            String surname = fields[0].replaceAll("", "").substring(7);
            String grade = fields[1].replaceAll("", "").substring(7);
            String subject = fields[2].replaceAll("", "").substring(8);

            StringBuilder sb = new StringBuilder();

            sb.append("Студент(ка)").append(surname).append(" получил(а)").append(grade).append(" по предмету")
                    .append(subject).append(".");

            String result = sb.toString();
            System.out.println(result);
        }
        scanner.close();
    }
}