public class FirstLesson {
    private static double taskOne(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }
    private static boolean taskTwo(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
    private static void taskThree(int a) {
        if (a<0) {
            System.out.println(" отрицательное");
        } else {
            System.out.println(" положительное");
        }
    }
    private static void taskFour(String name){
        System.out.println("Привет, " + name + "!");
    }
    private static void taskFive(int yearValue){
        if ((yearValue % 4 == 0 && yearValue % 100 != 0) || (yearValue % 400 == 0)){
            System.out.println("Год " + yearValue + " - високосный");
        } else {
            System.out.println("Год " + yearValue + " - не високосный");
        }
    }
    public static void main(String[] args){
        int a = 15;
        int b = 20;
        int c = 34;
        int d =4;
        int negativeNumber = -25;
        System.out.println("Задача 1: \n a = " + a + " \n b = " + b + " \n c = " + c + " \n d = " + d + "\n (a * (b + (c / d))) = " + taskOne(a,b,c,d));
        System.out.println("Задача 2: \n a = " + a + " \n b = " + b + "\n a + b = " + (a+b) + "\n Результат = " + taskTwo(a, b));
        System.out.println(" a = " + a + " \n b = " + d + "\n a + b = " + (a+d) + "\n Результат = " + taskTwo(a, d));
        System.out.print("Задача 3: \nЧисло = " + a);
        taskThree(a);
        System.out.print("Число = " + negativeNumber);
        taskThree(negativeNumber);
        String name = "Василий";
        System.out.println("Задача 4: \n Имя = " + name);
        taskFour(name);
        int yearNotVis = 2013;
        int yearNotVis100 = 1900;
        int yearVis = 2020;
        int yearVis400 = 2000;
        System.out.println("Задача 5:");
        taskFive(yearNotVis);
        taskFive(yearNotVis100);
        taskFive(yearVis);
        taskFive(yearVis400);
    }
}
