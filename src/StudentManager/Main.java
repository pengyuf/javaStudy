package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) {
        while (true) {
            System.out.println("\n=== 学生信息管理系统 ===");
            System.out.println("1. 添加学生");
            System.out.println("2. 查看所有学生");
            System.out.println("3. 删除学生");
            System.out.println("4. 查找学生");
            System.out.println("5. 退出");
            System.out.print("请输入编号：");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    listStudents();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入有误");
            }
        }
    }

    // 添加学生
    static void addStudent() {
        System.out.print("学号:");
        String id = sc.nextLine();
        System.out.print("姓名:");
        String name = sc.nextLine();
        System.out.print("年龄:");
        int age = sc.nextInt();
        sc.nextLine();
        students.add(new Student(id, name, age));
        System.out.println("添加成功");
    }

    // 查看所有学生
    static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("没有学生");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // 删除学生
    static void deleteStudent() {
        System.out.print("请输入学号:");
        String id = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("没有找到");
    }

    // 搜索
    static void searchStudent() {
        System.out.print("请输入姓名:");
        String name = sc.nextLine();
        boolean found = false;

        for (Student s : students) {
            if (s.getName().equals(name)) {
                found = true;
                System.out.println(s);
            }
        }
        if (!found) {
            System.out.println("没找到");
        }
    }
}
