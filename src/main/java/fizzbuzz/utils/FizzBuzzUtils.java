package fizzbuzz.utils;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Service;

@Service("fizzBuzzUtils")
public class FizzBuzzUtils {

	public FizzBuzzUtils() {
	}

	public List<Object> getList(int no) {

		List<Object> list = new ArrayList<Object>();

		LocalDate date = new LocalDate();

		int day = date.getDayOfWeek();

		for (int i = 1; i <= no; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				if (day == 3) {
					list.add("wizz wuzz");
				} else {
					list.add("<span class=fizz>fizz</span> <span class=buzz>buzz</span>");
				}

			}

			else if (i % 3 == 0) {

				if (day == 3) {
					list.add("wizz");
				} else {
					list.add("<span class=fizz>fizz</span>");
				}

			} else if (i % 5 == 0) {

				if (day == 3) {
					list.add("wuzz");
				} else {
					list.add("<span class=buzz>buzz</span>");
				}

			}

			else {
				list.add(i);
			}
		}
		return list;
	}

}
