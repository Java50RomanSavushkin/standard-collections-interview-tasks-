package telran.interviews.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static telran.interviews.InterviewTasks.displayShuffled;
import static telran.interviews.InterviewTasks.rolesInDates;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import telran.interviews.DateRole;

class InterviewTasksTest {

	@Test
	void dateRolesTest() {
		List<DateRole> dateRoles = rolesInDates(
				List.of(new DateRole(LocalDate.parse("2017-10-12"), "Developer"),
						new DateRole(LocalDate.parse("2020-01-01"), "Team leader"),
						new DateRole(LocalDate.parse("2023-08-15"), "Project Manager")),
				
				List.of(LocalDate.parse("2015-01-01"), 
						LocalDate.parse("2018-01-01"), 
						LocalDate.parse("2023-01-01")));
		 
		DateRole[] expected = { 
								new DateRole(LocalDate.parse("2015-01-01"), null),
			  					new DateRole(LocalDate.parse("2018-01-01"), "Developer"),
			  					new DateRole(LocalDate.parse("2023-01-01"), "Team leader") 
			  					};
		assertArrayEquals(expected, dateRoles.toArray(DateRole[]::new));
	}
  
	@Test
	void shuffledArrayTest() {
		int[] ar = { 1, 2, 0, 4, 5, 6, 9, 20 };
		displayShuffled(ar);
	} 
 
}
