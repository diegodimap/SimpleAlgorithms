package org.example;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your date of birth: (yyyy-MM-dd)");
        String birth = scanner.next();
        String parts[] = birth.split("-");
        Date birthDate = new Date(Integer.parseInt(parts[0]) - 1900, Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
        System.out.println(getAge(birthDate));
    }

    public static Integer getAge(Date birthDate) {
        GregorianCalendar hj = new GregorianCalendar();
        GregorianCalendar birth = new GregorianCalendar();
        birth.setTime(birthDate);
        int yearNow = hj.get(Calendar.YEAR);
        int yearBirth = birth.get(Calendar.YEAR);
        return new Integer(yearNow-yearBirth);
    }
}
