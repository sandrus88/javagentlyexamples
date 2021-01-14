package com.sg.javagently.my;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PersonListTest {

	@Test
	public void test_list1Element_findElement_ok() {
		// Given
		PersonList list = new PersonListImpl(new PersonListImpl.Node(new Person("Sandro", "Gargano"), null));

		// When
		Person p = list.findElement("Sandro");

		// Then
		assertNotNull(p);
		assertEquals(p.nome, "Sandro");
	}

	@Test
	public void test_list4Elements_findFirstElement_ok() {
		// Given
		PersonList list = new PersonListImpl(new PersonListImpl.Node(new Person("Sandro", "Gargano"), null));
		list.addLast(new Person("Armela", ""));
		list.addLast(new Person("Aida", ""));
		list.addLast(new Person("Ermal", ""));

		// When
		Person p = list.findElement("Sandro");

		// Then
		assertNotNull(p);
		assertEquals(p.nome, "Sandro");
	}

	@Test
	public void test_list4Elements_findLastElement_ok() {
		// Given
		PersonList list = new PersonListImpl(new PersonListImpl.Node(new Person("Sandro", "Gargano"), null));
		list.addLast(new Person("Armela", ""));
		list.addLast(new Person("Aida", ""));
		list.addLast(new Person("Ermal", ""));

		// When
		Person p = list.findElement("Ermal");

		// Then
		assertNotNull(p);
		assertEquals(p.nome, "Ermal");
	}

	@Test
	public void test_listElements_findWithSpace_ok() {
		// Given
		PersonList list = new PersonListImpl(new PersonListImpl.Node(new Person("Sandro", "Gargano"), null));
		list.addLast(new Person("Armela", ""));
		list.addLast(new Person("Aida", ""));
		list.addLast(new Person("Ermal ", ""));

		// When
		Person p = list.findElement("Ermal ");

		// Then
		assertNotNull(p);
		assertEquals(p.nome.trim(), "Ermal");
	}

	@Test
	public void test_list4Elements_findInTheMiddleElement_ok() {
		// Given
		PersonList list = new PersonListImpl(new PersonListImpl.Node(new Person("Sandro", "Gargano"), null));
		list.addLast(new Person("Armela", ""));
		list.addLast(new Person("Aida", ""));
		list.addLast(new Person("Ermal", ""));

		// When
		Person p = list.findElement("Aida");

		// Then
		assertNotNull(p);
		assertEquals(p.nome, "Aida");

	}

	@Test(expected = IllegalArgumentException.class)
	public void test_findElement_nonFound() {
		// Given
		PersonList list = new PersonListImpl(new PersonListImpl.Node(new Person("Sandro", "Gargano"), null));

		// When
		list.findElement("Armela");

		// Then
		// throw exception
	}

	@Test
	public void test_addLast() {
		// Given
		Person actualElement = new Person("Sandro", "Gargano");
		PersonList list = new PersonListImpl(new PersonListImpl.Node(actualElement, null));

		// When
		Person newElement = new Person("Ermal", "");
		list.addLast(newElement);

		// Then
		assertEquals(2, list.size());
		assertEquals(actualElement, list.get(0));
		assertEquals(newElement, list.get(1));
	}

	@Test
	public void test_addLast_when3ElementsPresent() {
		// Given, list with 3 elements
		Person actualElement1 = new Person("Sandro", "");
		Person actualElement2 = new Person("Armela", "");
		Person actualElement3 = new Person("Ermal", "");
		PersonList list = new PersonListImpl(new PersonListImpl.Node(actualElement1, null));
		list.addLast(actualElement2);
		list.addLast(actualElement3);
		
		// When, add 1 element at last
		Person newElement = new Person("Aida", "");
		list.addLast(newElement);

		// Then
		assertEquals(4, list.size());
		assertEquals(actualElement1, list.get(0));
		assertEquals(actualElement2, list.get(1));
		assertEquals(actualElement3, list.get(2));
		assertEquals(newElement, list.get(3));
	}

	@Test
	public void test_addFirst_when1ElementPresent() {
		// Given
		Person actualElement = new Person("Sandro", "Gargano");
		PersonList list = new PersonListImpl(new PersonListImpl.Node(actualElement, null));

		// When
		Person newElement = new Person("Armela", "");
		list.addFirst(newElement);

		// Then
		assertEquals(2, list.size());
		assertEquals(newElement, list.get(0));
		assertEquals(actualElement, list.get(1));
	}

	@Test
	public void test_addFirst_when3ElementsPresent() {
		// Given, list with 3 elements
		Person actualElement1 = new Person("Sandro", "");
		Person actualElement2 = new Person("Armela", "");
		Person actualElement3 = new Person("Ermal", "");
		PersonList list = new PersonListImpl(new PersonListImpl.Node(actualElement1, null));
		list.addLast(actualElement2);
		list.addLast(actualElement3);
		
		// When, add 1 element on the top of the list
		Person newElement = new Person("Aida", "");
		list.addFirst(newElement);

		// Then
		assertEquals(4, list.size());
		assertEquals(newElement, list.get(0));
		assertEquals(actualElement1, list.get(1));
		assertEquals(actualElement2, list.get(2));		
		assertEquals(actualElement3, list.get(3));		
	}

	@Test
	public void test_removeElement_whenOnly1ElementPresent() {
		// Given, list with only 1 element
		Person actualElement = new Person("Sandro", "");
		PersonList list = new PersonListImpl(new PersonListImpl.Node(actualElement, null));
		
		// When, remove this element of the list
		boolean isRemoved = list.removeElement(actualElement.nome);

		// Then
		assertTrue(isRemoved);
		assertEquals(0, list.size());
		assertTrue(list.isEmpty());
	}

	@Test
	public void test_removeElement_when3ElementsPresent_removeFirst() {
		// Given, list with 3 elements
		Person actualElement1 = new Person("Sandro", "");
		Person actualElement2 = new Person("Armela", "");
		Person actualElement3 = new Person("Ermal", "");
		PersonList list = new PersonListImpl(new PersonListImpl.Node(actualElement1, null));
		list.addLast(actualElement2);
		list.addLast(actualElement3);
		
		// When, remove first element of the list
		boolean isRemoved = list.removeElement(actualElement1.nome);

		// Then
		assertTrue(isRemoved);
		assertEquals(2, list.size());
		assertEquals(actualElement2, list.get(0));
		assertEquals(actualElement3, list.get(1));		
	}

	@Test
	public void test_removeElement_when3ElementsPresent_removeLast() {
		// Given, list with 3 elements
		Person actualElement1 = new Person("Sandro", "");
		Person actualElement2 = new Person("Armela", "");
		Person actualElement3 = new Person("Ermal", "");
		PersonList list = new PersonListImpl(new PersonListImpl.Node(actualElement1, null));
		list.addLast(actualElement2);
		list.addLast(actualElement3);
		
		// When, remove last element of the list
		boolean isRemoved = list.removeElement(actualElement3.nome);

		// Then
		assertTrue(isRemoved);
		assertEquals(2, list.size());
		assertEquals(actualElement1, list.get(0));
		assertEquals(actualElement2, list.get(1));		
	}

	@Test
	public void test_removeElement_when3ElementsPresent_removeInTheMiddle() {
		// Given, list with 3 elements
		Person actualElement1 = new Person("Sandro", "");
		Person actualElement2 = new Person("Armela", "");
		Person actualElement3 = new Person("Ermal", "");
		PersonList list = new PersonListImpl(new PersonListImpl.Node(actualElement1, null));
		list.addLast(actualElement2);
		list.addLast(actualElement3);
		
		// When, remove the element in the middle of the list
		boolean isRemoved = list.removeElement(actualElement2.nome);

		// Then
		assertTrue(isRemoved);
		assertEquals(2, list.size());
		assertEquals(actualElement1, list.get(0));
		assertEquals(actualElement3, list.get(1));		
	}
	
	@Test
	public void test_get() {
		// Given
		Person actualElement1 = new Person("Sandro", "");
		Person actualElement2 = new Person("Armela", "");
		Person actualElement3 = new Person("Ermal", "");
		PersonList list = new PersonListImpl(new PersonListImpl.Node(actualElement1, null));
		list.addLast(actualElement2);
		list.addLast(actualElement3);
		
		// When
		Person personIndex0 = list.get(0);
		Person personIndex1 = list.get(1);
		Person personIndex2 = list.get(2);
		
		System.out.println(personIndex0);
		System.out.println(personIndex1);
		System.out.println(personIndex2);
		
		// Then
		assertEquals(3, list.size());
		assertEquals(actualElement1, personIndex0);
		assertEquals(actualElement2, personIndex1);
		assertEquals(actualElement3, personIndex2);
	}
}