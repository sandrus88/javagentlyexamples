package com.sg.javagently.my.giocoDel15;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

import com.sg.javagently.my.SGUtil;

public class GiocoDel15Test {
	
//    {"7", "6", "15", "13",
//	   "3", "5", "12", "" ,
//	   "11", "14", "8", "4",
//	   "9", "2", "10", "1"};
	private String numeri[] = { "7", "6", "15", "13", "3", "5", "12", "", "11", "14", "8", "4", "9", "2", "10", "1" };
	GiocoDel15 gioco = new GiocoDel15(numeri);

	@Test
	public void test_mixNumbers() {
		String numeriAsString = SGUtil.getArrayAsString(numeri);
		gioco.mixNumbers();
		String[] newNumbers = gioco.getNumeri();
		String newNumeriAsString = SGUtil.getArrayAsString(newNumbers);
		System.out.println("numeriAsString: " + numeriAsString);
		System.out.println("newNumeriAsString: " + newNumeriAsString);

		assertNotEquals(numeriAsString, newNumeriAsString);
	}

	@Test
	public void test_getVuoto() {
		int index = gioco.getVuoto();
		assertEquals(7, index);
	}

	@Test
	public void test_scambia_vuotoInMezzo_conPrimo() {
		gioco.scambia(0);
		assertEquals(numeri[0], "");
		assertEquals(numeri[7], "7");
	}

	@Test
	public void test_scambia_vuotoInMezzo_conUnAltroInMezzo() {
		gioco.scambia(3);
		assertEquals(numeri[3], "");
		assertEquals(numeri[7], "13");
	}

	@Test
	public void test_scambia_vuotoInMezzo_conUltimo() {
		gioco.scambia(15);
		assertEquals(numeri[15], "");
		assertEquals(numeri[7], "1");
	}

	@Test
	public void test_scambia_vuotoPrimoElemento_conUnoInMezzo() {
		String numeri[] = { "", "6", "15", "13", "3", "5", "12", "7", "11", "14", "8", "4", "9", "2", "10", "1" };
		gioco = new GiocoDel15(numeri);

		gioco.scambia(8);
		assertEquals(numeri[8], "");
		assertEquals(numeri[0], "11");
	}

	@Test
	public void test_scambia_vuotoPrimoElemento_conUnUltimo() {
		String numeri[] = { "", "6", "15", "13", "3", "5", "12", "7", "11", "14", "8", "4", "9", "2", "10", "1" };
		gioco = new GiocoDel15(numeri);

		gioco.scambia(15);
		assertEquals(numeri[15], "");
		assertEquals(numeri[0], "1");
	}

	@Test
	public void test_scambia_vuotoUltimoElemento_conUnoInMezzo() {
		String numeri[] = { "1", "6", "15", "13", "3", "5", "12", "7", "11", "14", "8", "4", "9", "2", "10", "" };
		gioco = new GiocoDel15(numeri);

		gioco.scambia(9);
		assertEquals(numeri[9], "");
		assertEquals(numeri[15], "14");
	}

	@Test
	public void test_scambia_vuotoUltimoElemento_conPrimo() {
		String numeri[] = { "1", "6", "15", "13", "3", "5", "12", "7", "11", "14", "8", "4", "9", "2", "10", "" };
		gioco = new GiocoDel15(numeri);
		gioco.scambia(0);
		assertEquals(numeri[0], "");
		assertEquals(numeri[15], "1");
	}

	
//	  {"7", "", "15", "13",
//	   "3", "5", "12", "6" ,
//	   "11", "14", "8", "4",
//	   "9", "2", "10", "1"};
//	 
	@Test
	public void test_isAdiacent_false() {
		int x = 3%4;
		int y = 23%4;
		// 3/4 = 0 resto 3;
		// 0/4 = 0 resto = 0
		// 1/4 = 0 resto 1
		// 5/4 = 1 resto 1
		// 23/4 = 5 resto 3 
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
//	  {"7", "3", "15", "13",
//	   "11", "5", "12", "6" ,
//	   "", "14", "8", "4",
//	   "9", "2", "10", "1"};
	@Test
	public void test_isAdiacent_colonnaSx() {
		assertFalse(gioco.isAdjacent(0));
		assertFalse(gioco.isAdjacent(4));
		assertFalse(gioco.isAdjacent(8));
		assertFalse(gioco.isAdjacent(12));
		
		String numeri[] = { "1", "", "15", "13", "3", "5", "12", "7", "11", "14", "8", "4", "9", "2", "10", "6" };
		gioco = new GiocoDel15(numeri);
		assertTrue(gioco.isAdjacent(0));
		
		String numeri2[] = { "1", "3", "15", "13", "", "5", "12", "7", "11", "14", "8", "4", "9", "2", "10", "6" };
		gioco = new GiocoDel15(numeri2);
		assertTrue(gioco.isAdjacent(0));
		assertTrue(gioco.isAdjacent(8));
		
		String numeri3[] = { "1", "3", "15", "13", "11", "5", "12", "7", "", "14", "8", "4", "9", "2", "10", "6" };
		gioco = new GiocoDel15(numeri3);
		assertTrue(gioco.isAdjacent(12));
		
		String numeri4[] = { "1", "3", "15", "13", "11", "5", "12", "7", "2", "14", "8", "4", "9", "", "10", "6" };
		gioco = new GiocoDel15(numeri4);
		assertTrue(gioco.isAdjacent(12));
	}
	
//	  {"7", "3", "15", "13",
//	   "11", "5", "12", "6" ,
//	   "", "14", "8", "4",
//	   "9", "2", "10", "1"};
	@Test
	public void test_isAdiacent_colonnaDx() {
		String numeri[] = { "7", "", "15", "13", "3", "5", "12", "6", "11", "14", "8", "4", "9", "2", "10", "1" };
		GiocoDel15 gioco = new GiocoDel15(numeri);

		assertFalse(gioco.isAdjacent(3));
		assertFalse(gioco.isAdjacent(7));
		assertFalse(gioco.isAdjacent(11));
		assertFalse(gioco.isAdjacent(15));
		
		String numeri2[] = { "1", "15", "", "13", "3", "5", "12", "7", "11", "14", "8", "4", "9", "2", "10", "6" };
		gioco = new GiocoDel15(numeri2);
		assertTrue(gioco.isAdjacent(3));
		
		String numeri3[] = { "1", "3", "15", "13", "7", "5", "12", "", "11", "14", "8", "4", "9", "2", "10", "6" };
		gioco = new GiocoDel15(numeri3);
		assertTrue(gioco.isAdjacent(3));
		assertTrue(gioco.isAdjacent(11));
		
		String numeri4[] = { "1", "3", "15", "13", "11", "5", "12", "7", "4", "14", "8", "", "9", "2", "10", "6" };
		gioco = new GiocoDel15(numeri4);
		assertTrue(gioco.isAdjacent(15));
		
		String numeri5[] = { "1", "3", "15", "13", "11", "5", "12", "7", "2", "14", "8", "4", "9", "10", "", "6" };
		gioco = new GiocoDel15(numeri5);
		assertTrue(gioco.isAdjacent(15));
	}
	
//	  {"7", "3", "15", "13",
//	   "11", "5", "12", "6" ,
//	   "", "14", "8", "4",
//	   "9", "2", "10", "1"};
	@Test
	public void test_isAdiacent_colonnaCentrale() {
		String numeri[] = { "1", "7", "15", "13", "3", "5", "12", "6", "11", "14", "8", "4", "9", "2", "10", "" };
		GiocoDel15 gioco = new GiocoDel15(numeri);
		
		assertFalse(gioco.isAdjacent(1));
		assertFalse(gioco.isAdjacent(5));
		assertFalse(gioco.isAdjacent(9));
		assertFalse(gioco.isAdjacent(13));
		
		String numeri2[] = { "", "7", "15", "13", "3", "5", "12", "6", "11", "14", "8", "4", "9", "2", "10", "1" };
		gioco = new GiocoDel15(numeri2);
		assertTrue(gioco.isAdjacent(1));
		
		String numeri3[] = { "15", "7", "", "13", "3", "5", "12", "6", "11", "14", "8", "4", "9", "2", "10", "1" };
		gioco = new GiocoDel15(numeri3);
		assertTrue(gioco.isAdjacent(1));
		
		String numeri4[] = { "15", "", "7", "13", "3", "5", "12", "6", "11", "14", "8", "4", "9", "2", "10", "1" };
		gioco = new GiocoDel15(numeri4);
		assertTrue(gioco.isAdjacent(0));
		assertTrue(gioco.isAdjacent(2));
		assertTrue(gioco.isAdjacent(5));
		
		String numeri5[] = { "5", "7", "15", "13", "3", "", "12", "6", "11", "14", "8", "4", "9", "2", "10", "1" };
		gioco = new GiocoDel15(numeri5);
		assertTrue(gioco.isAdjacent(1));
		assertTrue(gioco.isAdjacent(4));
		assertTrue(gioco.isAdjacent(6));
		assertTrue(gioco.isAdjacent(9));
		
		String numeri6[] = { "15", "2", "7", "13", "3", "5", "12", "6", "11", "14", "8", "4", "9", "", "10", "1" };
		gioco = new GiocoDel15(numeri6);
		assertTrue(gioco.isAdjacent(9));
		assertTrue(gioco.isAdjacent(12));
		assertTrue(gioco.isAdjacent(14));			
	}
	
	@Test
	public void test_isFinish_false() {
		assertFalse(gioco.isFinish());
		
		String numeri[] = { "1", "2", "4", "3", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "" };
		gioco = new GiocoDel15(numeri);		
		assertFalse(gioco.isFinish());
	}
	
	@Test
	public void test_isFinish() {
		String numeri[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "" };
		gioco = new GiocoDel15(numeri);
		assertTrue(gioco.isFinish());
	}
}
