package lr8.Task8;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        Person person = new Person("Антон", 26);

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("src/lr8/Task8/person.json");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileIn =
                    new FileInputStream("src/lr8/Task8/person.json");
            ObjectInputStream in =
                    new ObjectInputStream(fileIn);
            System.out.println("Данные из файла: " + in.readObject());
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
    }
}

//Сохранение объекта класса в файл и восстановление его из файла, требуется
//создать класс с несколькими полями и реализовать интерфейс Serializable. Затем
//создать объект этого класса, записать его в файл в бинарном виде с помощью
//ObjectOutputStream, а затем восстановить его из файла с помощью
//ObjectInputStream. После восстановления объекта из файла необходимо вывести
//значения его полей на экран.