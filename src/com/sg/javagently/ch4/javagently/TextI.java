package com.sg.javagently.ch4.javagently;

import java.io.*;

interface TextI {

	void prompt(String msg);

	BufferedReader open(InputStream in);

	int readInt(BufferedReader in);

	double readDouble(BufferedReader in);

}
