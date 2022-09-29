package org.example.strategy;

public interface StorageStrategy {
	boolean containsKey(Long key);

	boolean containValue(String value);

	void put(Long key, String value);

	Long getKey(String value);

	String getValue(Long key);
}
