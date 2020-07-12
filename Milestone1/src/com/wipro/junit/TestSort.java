package com.wipro.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.junit.ex1.task.DailyTasks;

public class TestSort {

	@Test
	public void test() {
		DailyTasks dt=new DailyTasks();
		assertArrayEquals(new int[] {1,2,3},dt.sortValues(new int[] {3,2,1}));
		
	}

}
