package model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        float radius = scanner.nextFloat();
        System.out.print("Nhập màu sắc: ");
        String color = scanner.next();
        System.out.print("Nhập chiều cao (cho Cylinder): ");
        float height = scanner.nextFloat();
        Cylinder cylinder = new Cylinder(radius, color, height);
        System.out.println(cylinder);
        Circle circle=new Circle(radius, color);
        System.out.println(circle);
    }
}
