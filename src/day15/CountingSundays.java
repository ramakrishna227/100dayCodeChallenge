/*You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?*/

/*For september, april, june, november = 4*30  
 * 7* 31 
 * 1*28
 * on leap year feb has 29
 * */
package day15;

import java.util.HashMap;
import java.util.Map;

public class CountingSundays {
	public static void main(String[] args) {
		int start = 1901;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 31);
		map.put(2, 28);
		map.put(3, 31);
		map.put(4, 30);
		map.put(5, 31);
		map.put(6, 30);
		map.put(7, 31);
		map.put(8, 31);
		map.put(9, 30);
		map.put(10, 31);
		map.put(11, 30);
		map.put(12, 31);

		int lastDay = 1;
		int count = 0;
		for (int i = 1901; i <= 2000; i++) {
			for (int month = 1; month <= 12; month++) {
				int days = map.get(month);
				if (month == 2) {
					if (i % 4 == 0) {
						days = days + 1;
						if (i % 100 == 0 && i % 400 != 0) {
							days = days - 1;
						}

					}
				}

				lastDay = days % 7 + lastDay;
				if (lastDay > 7)
					lastDay = lastDay % 7;
				if (lastDay == 7)
					count++;
			}

		}
		System.out.println(count);
	}
}
