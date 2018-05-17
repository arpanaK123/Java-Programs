package com.bridgeit.ADDRESSBook;

import java.io.IOException;

public interface AddressBookManage {
	public void save(String Sfile);

	public void saveAs();

	public void close(String file);

	public void create() throws IOException;

}
