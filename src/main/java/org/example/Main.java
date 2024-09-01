package org.example;

import java.util.UUID;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    List<Student> studentList = IntStream.range(0, 10)
        .mapToObj(i -> new strudent(UUID.randomUUID().toString(), "坂井" + i)).toList();
    StudentManager manager = new StidentManeager(studentList);

    Student student = managaer.search("坂井3");
    System.out.println(student.getName());

  }
}