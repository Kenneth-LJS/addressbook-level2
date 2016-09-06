package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.ReadOnlyPerson;

public class Tagging {
	
	private ReadOnlyPerson person;
	private Tag tag;
	private TaggingAction action;
	
	public Tagging(ReadOnlyPerson person, Tag tag, TaggingAction action) {
		this.person = person;
		this.tag = tag;
		this.action = action;
	}

	public ReadOnlyPerson getPerson() {
		return person;
	}
	
	public Tag getTag() {
		return tag;
	}
	
	public TaggingAction getAction() {
		return action;
	}
	
	public String toString() {
		return action.toString() + " " +
				person.getName().fullName + " " +
				"[" + tag.tagName + "]";
	}
	
}
