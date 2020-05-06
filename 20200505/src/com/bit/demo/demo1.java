package com.bit.demo;

/*
 * @program: 20200505
 * @description
 * 多继承,实现多个接口
 * @author: mrs.yang
 * @create: 2020 -05 -05 12 :02
 */
class Animal{
    public String name;

    public Animal(String name) {//构造方法
        this.name = name;
    }
}
interface IFlying{//接口
    void fly();
}
interface ISWimming {//接口

    void swim();
}
interface IRunning{//接口
    void run();
}
class Cat extends Animal implements IRunning{
    public Cat(String name) {//继承需要实现父类的构造方法
        super(name);
    }
    @Override
    public void run() {//接口需要重写方法
        System.out.println(this.name+"正在跑");
    }
}
class Fish extends Animal implements ISWimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim () {
        System.out.println(this.name+"正在游泳");
    }
}
class Frog extends Animal implements IRunning,ISWimming{//实现多个接口
    public Frog(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name+"正在游");
    }
    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }
}
public class demo1 {
    public static void walk(IRunning irunning){
        irunning.run();
    }
    public static void main(String[] args) {
        /*Animal animal1=new Cat("mimi");
        Animal animal2=new Fish("haha");
        Animal animal3=new Frog("qing");*/
        IRunning irunning =new Frog("qing");
        walk(irunning);
        walk(irunning);
    }
}
