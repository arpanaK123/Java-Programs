package com.bridgeit.visitorPattern;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);

}
