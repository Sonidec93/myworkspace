package com.practice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Book{




	public Book(String bookName, int price) {

		this.bookName = bookName;
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String bookName;
	private int price;
}


class PriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getPrice()>o2.getPrice()){
			return 1;
		}
		else if (o1.getPrice()<o2.getPrice()) {
			return -1;
		}
		else{
			return 0;
		}
	}

}

public class ComparatorExample {

	public static void main(String [] arg){

		List<Book> list=new ArrayList<Book>();
		list.add(new Book("junglebook",900));
		list.add(new Book("treehouse",500));

		Collections.sort(list,new PriceComparator());

		for(Book obj:list){

			System.out.println(obj.getBookName()+" "+obj.getPrice());
		}
	}


}
