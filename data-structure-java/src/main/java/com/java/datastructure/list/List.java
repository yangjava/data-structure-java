package com.java.datastructure.list;

import java.util.Collection;

public interface List<E> {
	
	 //如果集合中没有元素,返回返回true
	 boolean isEmpty();
	
	 //返回集合中元素的个数,最大为Integer.MAX_VALUE
	 int size();
	
	 boolean contains(Object o);
	
	 boolean add(E e);
	 
	 boolean remove(Object o);
	 
	 E get(int index);
	 
	 E set(int index, E element);
	 
	 void add(int index, E element);
	 
	 E remove(int index);
	 
	 int indexOf(Object o);
	 
	 boolean removeAll(Collection<?> c);
}
