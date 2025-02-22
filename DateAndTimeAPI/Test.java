package com.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalTime t = LocalTime.now();
		System.out.println(t);
		LocalDateTime a = LocalDateTime.now();
		System.out.println(a);
		LocalDate b = LocalDate.parse("2024-12-30");
		System.out.println(b);
		LocalDate c = LocalDate.of(2000, 10, 8);
		System.out.println(c);
		LocalTime e=LocalTime.of(12,32);
		System.out.println(e);
		

	}

	

}
