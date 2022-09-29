package org.example;

import org.example.strategy.StorageStrategy;

public class Shortener {
	private Long lastId = 0L;
	private StorageStrategy storageStrategy;

	public Shortener(StorageStrategy storageStrategy) {
		this.storageStrategy = storageStrategy;
	}

	public synchronized Long getId(String string) {
		if (storageStrategy.containValue(string))
			return storageStrategy.getKey(string);

		lastId++;
		storageStrategy.put(lastId, string);
		return lastId;
	}

	public synchronized String getString(Long id) {
		return storageStrategy.getValue(id);
	}

}
