package com.bit.demo;

/*
 * @program: 20200505
 * @description
 * 自定义类型进行比较，需要是可比较的
 * @author: mrs.yang
 * @create: 2020 -05 -05 12 :35
 */

import java.util.Arrays;
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {//重写compareto方法
       // return 0;
        if(this.age>o.age){//>从小到大排序
            return -1;
        }else if(this.age==o.age){
            return 0;
        }else{
            return 1;
        }
    }
}
public class demo2 {
    public static void main(String[] args) {
        Student student1=new Student("bit",18,79);
        Student student2=new Student("haha",29,70);
        Student student3=new Student("hehe",17,99);
        Student[] students=new Student[3];
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        if(student1.compareTo(student2) >0){
            System.out.println("student1的年龄>student2的年龄");
        }
        Arrays.sort(students);//默认是从小到大
        System.out.println(Arrays.toString(students));
    }
    public static void main1(String[] args) {
        int[] arr={12,4,6,8,16};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

