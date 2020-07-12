package com.wipro.junit.ex1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.junit.ex1.task.DailyTasks;

public class TestStringContact {

	@Test
	public void doStringConcat() {
		DailyTasks d=new DailyTasks();
		assertEquals("Result", "Hello World", d.doStringConcat("Hello", "World"));
		
	}

}
