package com.bridgeit.AddressBook;

import java.io.IOException;

public interface CreateAddressBook {
	public void create() throws Exception;

	public void remove(String file);

	public void close();

	void save(String file);

	public void saveAs();

}
