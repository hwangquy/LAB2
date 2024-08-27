/*
 * @(#) Exer1.java 1.0 27/08/2024
 *
 * Copyright (c) 2024 IUH
 */

package edu.iuh.fit;

import java.util.Scanner;

/*
 * @description: This class represents a bank with many bank accounts
 * @author : Nguyen Huy Hoang
 * @version 1.0
 * @created :27-Aug-2024 10:41:50 AM
 */
public class TestCourse {
    public static void main(String[] args) {
        CourseList courseList = new CourseList(10);

        initData(courseList);
// Them va lay danh sach khoa hoc
        System.out.printf("%-10s%-30s%10s %-30s\n", "Id", "Title", "Credit", "Department");
        Course[] temp = courseList.getCourses();
        for(Course c : temp)
        {
            if(c != null) System.out.println(c);
        }
//  Xoa mot khoa hoc kho danh sach
        System.out.print("Nhap ma khoa hoc can xoa: ");
        String s = new Scanner(System.in).nextLine();
        courseList.removeCourse(s);
        System.out.printf("%-10s%-30s%10s %-30s\n", "Id", "Title", "Credit", "Department");
        for(Course c : courseList.getCourses())
            if (c != null) System.out.println(c);

//    Tim kiem khoa hoc theo id
        System.out.print("Nhap ma khoa hoc can tim: ");
        s = new Scanner(System.in).nextLine();
        System.out.printf("%-10s%-30s%10s %-30s\n", "Id", "Title", "Credit", "Department");
        System.out.println(courseList.searchById(s));

//  Tim kiem khoa hoc theo ten
        System.out.print("Nhap ten khoa hoc can tim: ");
        s = new Scanner(System.in).nextLine();
        System.out.printf("%-10s%-30s%10s %-30s\n", "Id", "Title", "Credit", "Department");
        for(Course c : courseList.SearchByTitle(s))
            if(c != null) System.out.println(c);

// Tim kiem khoa hoc theo khoa phu trach
        System.out.print("Nhap khoa phu trach: ");
        s = new Scanner(System.in).nextLine();
        System.out.printf("%-10s%-30s%10s %-30s\n", "Id", "Title", "Credit", "Department");
        for(Course c : courseList.SearchByDepartment(s))
            if(c != null) System.out.println(c);

// Sap xep theo ten khoa hoc
        System.out.println("Danh sach khoa hoc sau khi sap xep theo ten khoa hoc");
        System.out.printf("%-10s%-30s%10s %-30s\n", "Id", "Title", "Credit", "Department");
        for(Course c : courseList.sortCourse())
            if(c != null) System.out.println(c);

//        Tim khoa phu trach nhieu hoc nhat
        System.out.println("Khoa phu trach nhieu khoa hoc nhat: " + courseList.findDepartmentWithMostCourse(temp));

//  Tim khoa hoc co so tin chi lon nhat
        System.out.println("Cac khoa hoc co so tin chi lon nhat");
        System.out.printf("%-10s%-30s%10s %-30s\n", "Id", "Title", "Credit", "Department");
        for(Course c : courseList.findMaxCreditCourse(temp))
            if(c != null) System.out.println(c);
    }

    private static void initData(CourseList courseList) {
        Course c1 = new Course("CS101","Java Pro",2,"CS2");
        Course c2 = new Course("CS102","Java Pro",3,"CS1");
        Course c3 = new Course("CS103","C++ Pro",2,"CS3");
        Course c4 = new Course("CS104","C++ Pro",3,"CS3");

        courseList.addCourse(c1);
        courseList.addCourse(c2);
        courseList.addCourse(c3);
        courseList.addCourse(c4);
    }
}
