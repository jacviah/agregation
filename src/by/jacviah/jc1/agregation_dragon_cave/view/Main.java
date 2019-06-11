package by.jacviah.jc1.agregation_dragon_cave.view;

import by.jacviah.jc1.agregation_dragon_cave.controller.Controller;

public class Main  {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        String s = controller.doAction("view all");
        System.out.println(s);
        System.out.println("----------------------");
        String s2 = controller.doAction("find treasures for a given amount|12000");
        System.out.println(s2);
        System.out.println("----------------------");
        String s3 = controller.doAction("get most expensive treasure");
        System.out.println(s3);

    }
}
