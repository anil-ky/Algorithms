package com.test.collections;

public class HashMapImpl<K, V> {
	Entry table[] = new Entry[20];

	public V put(K key, V value) {

		if (key == null) return null;

		int hashCode = key.hashCode();
		int hash = hash(hashCode);

		int index = getIndex(hash, table.length);

		for(Entry<K, V> map = table[index]; map != null; map = map.next)
		{
			if(map.hashcode == hash && (map.key == key || map.key.equals(key))) {
				V oldValue = map.value;
				map.value = value;
				return oldValue;
			}
		}

		addEntry(hash, key, value, index);

		return null;
	}


	public V get(K key) {
		if (key == null) return null;

		int hashCode = key.hashCode();
		int hash = hash(hashCode);

		int index = getIndex(hash, table.length);

		for(Entry<K, V> map = table[index]; map != null; map = map.next)
		{
			if(map.hashcode == hash && (map.key == key || map.key.equals(key))) {
				return map.value;
			}
		}


		return null;
	}

	private void addEntry(int hash, K key, V value, int index) {
		// TODO Auto-generated method stub

	}

	private int getIndex(int hash, int length) {
		return 0;
	}

	private int hash(int hashCode) {
		return 0;
	}

	class Entry<K, V> {
		K key;
		V value;
		Entry<K,V> next;
		int hashcode;
	}
}
