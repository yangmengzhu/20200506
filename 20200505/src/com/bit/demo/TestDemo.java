package com.bit.demo;

/*
 * @program: 20200505
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -05 10 :14
 */
interface Shape{//接口
   //public abstract void draw();
   void draw();//抽象方法
    //public static final int a=10;常量
}
class Cycle implements Shape{//实现shape接口
    @Override
    public void draw() {//重写
        System.out.println("画一个圆");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();//父类的引用调用这个重写的方法
    }
    public static void main(String[] args) {
      Shape shape=new Cycle();//向上转型
       drawMap(shape);
    }
}
