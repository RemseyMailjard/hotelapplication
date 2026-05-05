package com.hotelapp.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LoadDataService {

	// Repository: passes the error to the calling code
	static public String loadData() throws IOException {
		return Files.readString(Path.of("data.txt"));

	}

	}


