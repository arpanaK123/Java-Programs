package com.bridgeit.visitorPattern;

public interface ShoppingCartVisitor {
	int visit(Book Book);

	int visit(Fruit Fruit);
}
