package com.jaenyeong.iterator.refactor2;

import com.jaenyeong.iterator.MenuItem;

import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("메뉴\n----\n아침 메뉴");
		printMenu(pancakeIterator);
		System.out.println("\n점심 메뉴");
		printMenu(dinerIterator);
	}

	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
