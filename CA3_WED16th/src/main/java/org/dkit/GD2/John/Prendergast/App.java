package org.dkit.GD2.John.Prendergast;

/**
 * Hello world!
 *
 */

import java.util.*;
import java.util.stream.Collectors;

/**
 * OOP CA3
 * @author John Loane
 */
public class App {
    public static void main(String[] args) {
        //Question 1

        questionOnePartA();
       // questionOnePartB();
        questionOnePartC();
        questionOnePartD();

        //Question 2
        questionTwoPartA();
        questionTwoPartB();
        //questionTwoPartC();
       // questionTwoPartD();

        //Question 3
        List<String> oneHundredStrings = new ArrayList<>();
        populateOneHundredStrings(oneHundredStrings);
        questionThreePartA(oneHundredStrings);
       // questionThreePartB();

        //Question 4
        compareTwoStudents();
        questionFourPartA();
        //questionFourPartB();
        //questionFourPartC();
    }




    private static void questionOnePartA() {
        System.out.println("Part A");
        List<Student> playerList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            playerList.add(new Student(1 + i, "p" + i , 10 + i));
        }


        System.out.println("questionOnePartB :");
        for (Student counter : playerList) {
            System.out.println(counter);
        }
        System.out.println("questionOnePartC:");
        for (Student counter : playerList) {
            System.out.println(counter);
        }

    }


    private static void questionOnePartB() {

    }


    private static void questionOnePartC() {

    }

    private static void questionOnePartD() {
    }

    private static void questionTwoPartA() {
        ArrayList<Employee> employee = new ArrayList<>();
        Map<Employee,Integer> wordCountMap = new HashMap<>();


        employee.add(new Employee("john", " lastname1"));
        employee.add(new Employee("ross", " lastname2"));
        employee.add(new Employee("josh", " lastname3"));
        employee.add(new Employee("dylan", " lastname4"));
        employee.add(new Employee("james", " lastname5"));


        for(Employee  word : employee) {
            Integer count = wordCountMap.get(word);
            if (count != null) {

                wordCountMap.put(word,(count+1));

            } else {
                wordCountMap.put(word, 1); // add new word with count 1
            }
        }

        System.out.println(wordCountMap);
        System.out.println("questionTwoPartc");
    }


    // Function select an element base on index
    // and return an element
    public int getRandomElement(List<Integer> employee)
    {
        Random rand = new Random();
        return employee.get(rand.nextInt(employee.size()));

    }


    private static void questionTwoPartB() {
    }
    private static void questionThreePartA(List<String> oneHundredStrings) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((1+i));
            list.add((1+i));
        }

        System.out.println("ArrayList with duplicates: "
                + oneHundredStrings);


        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());

        System.out.println("ArrayList with duplicates removed: "
                + newList);
    }
    private static void questionFourPartA() {
    }
    //The method below relates to Question 4
    private static void compareTwoStudents()
    {
        Student alex1 = new Student(1, "Alex", 22);
        Student alex2 = new Student(1, "Alex", 22);
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }

    //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
    private static void populateOneHundredStrings(List<String> oneHundredStrings)
    {
        for(int i=0; i < 100; i++)
        {
            if(i / 10 == 0)
            {
                oneHundredStrings.add("Java");
            }
            else if(i / 10 == 1)
            {
                oneHundredStrings.add("Python");
            }
            else if(i / 10 == 2)
            {
                oneHundredStrings.add("C++");
            }
            else if(i / 10 == 3)
            {
                oneHundredStrings.add("Javascript");
            }
            else if(i / 10 == 4)
            {
                oneHundredStrings.add("Ruby");
            }
            else if(i / 10 == 5)
            {
                oneHundredStrings.add("Golang");
            }
            else if(i / 10 == 6)
            {
                oneHundredStrings.add("C#");
            }
            else if(i / 10 == 7)
            {
                oneHundredStrings.add("C");
            }
            else if(i / 10 == 8)
            {
                oneHundredStrings.add("R");
            }
            else if(i / 10 == 9)
            {
                oneHundredStrings.add("Swift");
            }
        }
    }
}