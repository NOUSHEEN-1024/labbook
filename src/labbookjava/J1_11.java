package labbookjava;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class J1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate ld=LocalDate.now();
		//LocalDate ldt1=LocalDate()
		System.out.println(ld);
		
		LocalDate ld1=LocalDate.parse("2023-07-03");
		System.out.println(ld1);
		
		long day=ChronoUnit.YEARS.between(ld1, ld);
		System.out.println(day);

	}

}
