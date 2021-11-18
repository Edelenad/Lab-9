// Andrew Edelen and Evan Naylor
import java.io.*;
import java.util.*;


class Main {

  static ArrayList <Person> people;
  static String fileName;
  static FileReader myFile;

  public static void main(String[] args) {

    people = new ArrayList<Person>();

    String name = "";
    String age = "";
    String color = "";
    
    people.add(new Person("Andrew","23","red"));
    people.add(new Person("A","87","pink"));
    people.add(new Person("B","13","yellow"));
    people.add(new Person("C","55","black"));
    people.add(new Person("D","4",green));

    try{
      FileWriter toWriteFile;
      toWriteFile = new FileWriter("data.txt");

      BufferedWriter output = new
      BufferedWriter(toWriteFile);


      for(int i =0; i < people.size(); i++){
        output.write(people.get(i).getName());
        output.newLine();

        output.write(Integer.toString(people.get(i).getAge()));

        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();
        output.flush();
      }
      output.close();
    }

    catch(IOException exception){
      exception.printStackTrace();
    }
    try {
      myFile = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(myFile);

      while (reader.ready()){
        name = reader.readLine();
        age = reader.readLine();
        color = reader.readLine();
        System.out.printf("%-10s %-10s %-10s %n" , name, age, color);
      }
      reader.close();
    }
    catch (IOException exception)
    {
      System.out.println ("An error occured:" + exception);
    }

    }


    
  }
