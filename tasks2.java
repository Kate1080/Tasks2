import java.util.Arrays;


public class tasks2 {

    /**Вывод всех данных**/
    public static void main(String[] args) {
        System.out.println(Repeat("mice", 5));
        System.out.println(Repeat("hello", 3));
        System.out.println(Repeat("stop", 1));

        System.out.println("Задание 2");
        int[] numbs = new int[] {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(differenceMaxMin(numbs));


        System.out.println("Задание 3");
        int[] mas = new int[] {1, 2, 3, 4};
        System.out.println(isAvgWhole(mas));
        int[] mass = new int[] {1, 5, 6};
        System.out.println(isAvgWhole(mass));


        System.out.println("Задание 4");
        int[] m = new int[] {1, 2, 3};
        int[] ints = cumSum(m);
        System.out.println(Arrays.toString(ints));

        int[] massi = new int[] {1, -2, 3};
        int[] intss = cumSum(massi  );
        System.out.println(Arrays.toString(intss));


        System.out.println("Задание 5");
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));


        System.out.println("Задание 6");
        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(7));
        System.out.println(Fibonacci(12));


        System.out.println("Задание 7");
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));


        System.out.println("Задание 8");
        System.out.println(isStrangePair("", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));


        System.out.println("Задание 9");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isPrefix("retrospect", "sub-"));

        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isSuffix("vocation", "-logy"));


        System.out.println("Задание 10");
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));

    }

    /** Создайте функцию, которая повторяет каждый символ в строке n раз **/
    public static String Repeat(String a, int b) {
        String s = "";
        for (int i=0; i<a.length(); i++) {
            for (int k=1; k<=b; k++) {
                s += a.charAt(i);
            }
        }
        return s;
    }

    /** Создайте функцию, которая принимает массив и возвращает разницу между самыми большими и самыми маленькими числами.**/
    public static Integer differenceMaxMin(int[] x) {
        int maxNum = x[0];
        int minNum = x[0];

        for (int i = 1; i < x.length; i++) {
            if (maxNum < x[i]) {
                maxNum = x[i];
            }
            if (minNum > x[i]) {
                minNum = x[i];
            }
        }

        return maxNum - minNum;
    }


    /** Создайте функцию, которая принимает массив в качестве аргумента и возвращает
     true или false в зависимости от того, является ли среднее значение всех элементов
     массива целым числом или нет.**/
    public static boolean isAvgWhole(int[] x) {
        int sum = 0;
        for( int i: x) {
            sum = sum + i;
        }

        return sum % x.length == 0;
    }


    /** Создайте метод, который берет массив целых чисел и возвращает массив, в
     котором каждое целое число является суммой самого себя + всех предыдущих
     чисел в массиве**/
    public static int[] cumSum(int[] m) {
        int[] myArray = new int[m.length];
        int num = m[0];
        myArray[0] = m[0];

        for (int i=1; i < m.length; i++) {
            num = num + m[i];
            myArray[i] = num;
        }
        return myArray;
    }

    /** Создайте функцию, которая возвращает число десятичных знаков, которое имеет
     число (заданное в виде строки). Любые нули после десятичной точки
     отсчитываются в сторону количества десятичных знаков**/
    public static Integer getDecimalPlaces(String x) {
        if (!(x.contains("."))) {
            return 0;
        } else {
            String[] numbs = x.split("\\.");
            String numb = numbs[1];
            return numb.length();
        }
    }

    /** Создайте функцию, которая при заданном числе возвращает соответствующее
     число Фибоначчи **/
    static int Fibonacci(int n){
        if (n == 0) {
            return 0;
        }

        if (n == 1){
            return 1;
        }

        else{
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }


    /** – Должно содержать только цифры (не допускается использование нецифровых цифр).
     – Не должно содержать никаких пробелов.
     – Длина не должна превышать 5 цифр. **/
    public static boolean isValid(String s) {
        try {
            int Value = Integer.parseInt(s);
            if (!(s.contains(".*"))) {
                return !(s.length() == 5);
            }

            else  {
                return false;
            }
        }

        catch (NumberFormatException e) {
            return false;
        }
    }


    /** – Первая буква 1-й строки = последняя буква 2-й строки.
     – Последняя буква 1-й строки = первая буква 2-й строки.
     – Создайте функцию, которая возвращает true, если пара строк представляет собой
     странную пару, и false в противном случае**/

    public static boolean isStrangePair(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        else {
            return  ((s1.charAt(0) == s2.charAt(len2 - 1)) && (s1.charAt(len1 - 1) == s2.charAt(0)));

        }
    }


    /**оздайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
     – isPrefix должен возвращать true, если он начинается с префиксного аргумента.
     – isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
     – В противном случае верните false.**/
    public static boolean isPrefix(String word, String pre) {
        String new_pre = pre.replaceAll("-", "");
        return word.indexOf(new_pre) == 0;
    }


    public static boolean isSuffix(String word, String suf) {
        String new_suf = suf.replaceAll("-", "");
        return word.lastIndexOf(new_suf) == (word.length() - new_suf.length());
    }



    /**Создайте функцию, которая принимает число (шаг) в качестве аргумента и
     возвращает количество полей на этом шаге последовательности**/
    public static Integer boxSeq(int n) {

        if (n == 0) {
            return 0;
        }

        else {
            if (n % 2 == 0) {
                return 2 + (n/2 - 1) * 2;
            }
            else {
                return  (2 + ((n+1)/2 - 1) * 2) + 1;

            }
        }

    }

}
