package com.foreach.iotsensorreadings;

import java.util.ArrayList;
import java.util.List;

public class PrintReadings {
	public static void main(String[] args) {
		List<Sensor> sensors = new ArrayList<>();

		sensors.add(new Sensor(101, 45.5));
		sensors.add(new Sensor(102, 72.3));
		sensors.add(new Sensor(103, 88.1));
		sensors.add(new Sensor(104, 60.0));
		sensors.add(new Sensor(105, 95.7));
		sensors.add(new Sensor(106, 30.4));
		sensors.add(new Sensor(107, 81.9));
		sensors.add(new Sensor(108, 55.2));
		sensors.add(new Sensor(109, 90.6));
		sensors.add(new Sensor(110, 40.0));
		
		sensors.stream().filter(readings -> readings.getValue()>=50).forEach(System.out::println);

	}
}
