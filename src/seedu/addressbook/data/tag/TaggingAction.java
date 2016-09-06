package seedu.addressbook.data.tag;

public enum TaggingAction {
	
	ADD('+'),
	REMOVE('-');
	
	private final char displayChar;
	
	private TaggingAction(char displayChar) {
		this.displayChar = displayChar;
	}

	public char getDisplayChar() {
		return displayChar;
	}
}
