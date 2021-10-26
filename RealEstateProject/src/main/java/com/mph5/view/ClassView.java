package com.mph5.view;

import java.util.Scanner;

import com.mph5.controller.CustomerController;
import com.mph5.controller.ICustomerController;

public class ClassView {

	public static void main(String[] args) {
		ICustomerController cusCon = new CustomerController();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("1.Add Customer /n2.View Customer /n3.Update Customer /n4.To Exit");
			switch (sc.nextInt()) {
			case 1:
				cusCon.addCustomer();
				break;
			case 2:
				cusCon.viewCustomer();
				break;
			case 3:
				cusCon.updateCustomer();
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("enter valid value");
				break;
			}
		}
	}

}
