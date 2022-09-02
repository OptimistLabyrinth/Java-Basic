package com.ksyoo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UnderstandingReference understandingReference = new UnderstandingReference();
        understandingReference.main(args);
        System.out.println();
        UnderstandingPackageImport understandingPackageImport = new UnderstandingPackageImport();
        understandingPackageImport.main(args);
        System.out.println();
        UnderstandingArray understandingArray = new UnderstandingArray();
        understandingArray.main(args);
        System.out.println();
// *      스캐너 입력 기다리는 부분 때문에 빠르게 테스트하기 불편해서 우선은 주석처리
//        UnderstandingScanner understandingScanner = new UnderstandingScanner();
//        understandingScanner.main(args);
//        System.out.println();
        UnderstandingMethods understandingMethods = new UnderstandingMethods();
        understandingMethods.main(args);
        System.out.println();
        UnderstandingClasses understandingClasses = new UnderstandingClasses();
        understandingClasses.main(args);
    }

    static class UnderstandingReference {
        public void main(String[] args) {
            int a = 7;
            int b = a;
            System.out.println("before chaning value: " + a + " " + b);
            a = 3;
            System.out.println("after chaning value: " + a + " " + b);

            Person alex = new Person("alex");
            Person mariam = alex;
            System.out.println("before changing name: " + alex.name + " " + mariam.name);
            alex.name = "Alexander";
            System.out.println("after changing name: " + alex.name + " " + mariam.name);
        }

        class Person {
            String name;

            Person(String name) {
                this.name = name;
            }
        }
    }

    static class UnderstandingPackageImport {
        public void main(String[] args) {
            Date date = new Date();
            java.sql.Date dateSql = new java.sql.Date(1);
            String s = "abc123";
            LocalDate localDate = LocalDate.now();
            LocalDateTime localDateTime = LocalDateTime.now();

            System.out.println(date);
            System.out.println(dateSql);
            System.out.println(s);
            System.out.println(localDate);
            System.out.println(localDateTime);
        }
    }

    static class UnderstandingArray {
        public void main(String[] args) {
            int[] numbers = {2, 0, 1, 4, 1104};
            System.out.println(Arrays.toString(numbers));
            System.out.println(numbers.length);
            System.out.println(numbers[4]);
            System.out.println("for loop");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
            System.out.println("stream forEach");
            Arrays.stream(numbers).forEach(value -> System.out.print(value + " "));
            System.out.println();
        }
    }

    static class UnderstandingScanner {
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your name?");
            String userName = scanner.nextLine();
            System.out.println("Hello " + userName);

            System.out.println("How old are you?");
            int age = scanner.nextInt();
            int year = LocalDate.now().minusYears(age).getYear();
            System.out.println("You were born in " + year);
            if (age < 18) {
                System.out.println("  and you are not an adult");
            } else {
                System.out.println("  and you are an adult :)");
            }
        }
    }

    static class UnderstandingMethods {
        public void main(String[] args) {
            String string = "AABCDDD";
            char [] letters = string.toCharArray();
            int count = countOccurrences(letters, 'A');
            System.out.println(count);
        }

        int countOccurrences(char[] letters, char searchLetter) {
            int count = 0;
            for (char letter : letters) {
                if (letter == searchLetter)
                    count++;
            }
            return count;
        }
    }

    static class UnderstandingClasses {
        public void main(String[] args) {
            Lens lensOne = new Lens("sony", "85mm", true);
            Lens lensTwo = new Lens("sony", "30mm", true);
            Lens lensThree = new Lens("canon", "24-70mm", false);

            System.out.println(lensOne);
            System.out.println(lensTwo);
            System.out.println(lensThree);
        }

        class Lens {
            String brand;
            String focalLength;
            boolean isPrime;

            Lens() {
                this.brand = null;
                this.focalLength = null;
                this.isPrime = false;
            }

            Lens(String brand, String focalLength, boolean isPrime) {
                this.brand = brand;
                this.focalLength = focalLength;
                this.isPrime = isPrime;
            }

            @Override
            public String toString() {
                return "Lens { " +
                        "brand='" + brand + '\'' +
                        ", focalLength='" + focalLength + '\'' +
                        ", isPrime=" + isPrime +
                        " }";
            }
        }
    }
}
