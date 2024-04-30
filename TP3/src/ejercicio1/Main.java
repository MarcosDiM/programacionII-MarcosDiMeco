package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Asignature asignature1 = new Asignature(3, "Lunes 10:00 am", "Matematicas");
        Asignature asignature2 = new Asignature(2, "Miercoles 9:00 am", "Estadistica");
        Asignature asignature3 = new Asignature(1,"Viernes 8:00 am", "Lengua");

        List<Asignature> asignatureList = new ArrayList<>();

        asignatureList.add(asignature1);
        asignatureList.add(asignature2);

        Student student1 = new Student(45985694,"Lucas Perez");
        Student student2 = new Student(41546546,"Juan Lucero");
        Student student3 = new Student(44545345,"Agustina Lopez");
        Student student4 = new Student(72947974,"Pedro Rodriguez");
        Student student5 = new Student(43323223,"Lucia Martinez");
        Student student6 = new Student(45424344,"Martina Diaz");

        List<Student> studentList1 = new ArrayList<>();

        studentList1.add(student1);
        studentList1.add(student2);

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(student3);
        studentList2.add(student4);

        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(student5);
        studentList3.add(student6);

        Group group1= new Group("Matematicas",'A', studentList1);
        Group group2= new Group("Estadistica",'B', studentList2);
        Group group3= new Group("Matematicas",'C', studentList3);

        Professor professor1 = new Professor(1681566, "Jose Villagra", "Matematicas",asignatureList);
        Professor professor2 = new Professor(5165166, "Leonel Messi", "Matematicas", asignatureList);

        asignature1.setGroup(group1);
        asignature2.setGroup(group2);

        Scanner scanner = new Scanner(System.in);



        //-------------------------------------------------------------------
        System.out.println("-------- PUNTO 3-a ----------");

        System.out.print("La tercera asignatura del profesor " + professor1.getName() + " es: ");
        System.out.println(professor1.getImparts().get(1).getName());


        //-------------------------------------------------------------------
        System.out.println("-------- PUNTO 3-b ----------");

        int counterAsignatures = 0;

        System.out.println("Las asignaturas del profesor " + professor2.getName() + " son: ");

        for (Asignature asignature : professor2.getImparts()) {
            counterAsignatures ++;
            if (counterAsignatures < professor2.getImparts().size()){
                System.out.print(asignature.getName()+"," );
            } else {
                System.out.println(asignature.getName()+"." );
            }
        }

        //-------------------------------------------------------------------
        System.out.println("-------- PUNTO 3-c ----------");

        int counterStudents = 0;

        System.out.println("Los alumnos de la asignatura "+ asignature2.getName()+ " son:");

        for (Student student : group2.getBelongs()) {

            counterStudents ++;

            if(counterStudents < group2.getBelongs().size()) {
                System.out.print(student.getName()+ ",");
            } else {
                System.out.println(student.getName()+ ".");
            }
        }

        //-------------------------------------------------------------------
        System.out.println("-------- PUNTO 3-e ----------");

        System.out.println("Las asignaturas recibidas por el alumno " + student2.getName() + " son:");
        boolean isFirst = true;
        for (Asignature asignature : asignatureList) {
            if (asignature.getGroup().getBelongs().contains(student2)) {
                if (isFirst) {
                    System.out.print(asignature.getName());
                    isFirst = false;
                } else {
                    System.out.print(", " + asignature.getName());
                }
            }
        }
        System.out.println();

        //-------------------------------------------------------------------
        System.out.println("-------- PUNTO 3-f ----------");

    }
}