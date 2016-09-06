package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import seedu.addressbook.common.Utils;

public class UtilsTest {

	@Test
	public void isAnyNull_noArgs() {
		assertFalse(Utils.isAnyNull());
	}

	@Test
	public void isAnyNull_OneNullArg() {
		assertTrue(Utils.isAnyNull((Object) null));
	}

	@Test
	public void isAnyNull_OneArgNotNull() {
		assertFalse(Utils.isAnyNull(""));
	}

	@Test
	public void isAnyNull_MultipleArgsNoNull() {
		assertFalse(Utils.isAnyNull("", "", "", ""));
	}

	@Test
	public void isAnyNull_MultipleArgsNull() {
		assertTrue(Utils.isAnyNull("", "", null, ""));
	}

	@Test
	public void elementsAreUnique_EmptyList() {
		List<String> items = new ArrayList<String>();
		assertTrue(Utils.elementsAreUnique(items));
	}

	@Test
	public void elementsAreUnique_OneItem() {
		List<String> items = new ArrayList<String>();
		items.add("A");
		assertTrue(Utils.elementsAreUnique(items));
	}

	@Test
	public void elementsAreUnique_TwoUniqueItems() {
		List<String> items = new ArrayList<String>();
		items.add("A");
		items.add("B");
		assertTrue(Utils.elementsAreUnique(items));
	}

	@Test
	public void elementsAreUnique_TwoSameItems() {
		List<String> items = new ArrayList<String>();
		items.add("A");
		items.add("A");
		assertFalse(Utils.elementsAreUnique(items));
	}

	@Test
	public void elementsAreUnique_MultipleUniqueItems() {
		List<String> items = new ArrayList<String>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		assertTrue(Utils.elementsAreUnique(items));
	}

	@Test
	public void elementsAreUnique_MultipleItemsNonUnique() {
		List<String> items = new ArrayList<String>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("A");
		assertFalse(Utils.elementsAreUnique(items));
	}
	
}
