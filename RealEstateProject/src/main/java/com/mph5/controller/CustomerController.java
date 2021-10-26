package com.mph5.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerController implements ICustomerController{
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	Scanner sc = new Scanner(System.in);

	public void addCustomer() {
		Transaction transaction = session.beginTransaction();

		System.out.println("1.As Byer /n2.As seller");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Customer customer = new Byer();
			Customer customer = CreateCustomer(customer);
			session.save(customer);
			transaction.commit();
			break;
		case 2:
			Customer customer = new Seller();
			Customer customer = CreateCustomer(customer);
			customer = createProperty(customer);
			session.save(customer);
			transaction.commit();
			break;
		default:
			break;
		}

	}

	@Override
	private Customer CreateCustomer(Customer customer) {
		System.out.println("Enter First Name: ");
		customer.setFname(sc.next());

		System.out.println("Enter Last Name: ");
		customer.setLname(sc.next());

		System.out.println("Enter Phone: ");
		System.out.println("Enter email: ");
		customer.setEmail(sc.next());

		System.out.println("Enter PAN: ");
		customer.setPan(sc.next());

		System.out.println("Enter Aadhar Number: ");
		customer.setAadhar(sc.next());

		boolean flag_pwd = true;
		while (flag_pwd) {
			System.out.println("Enter password: ");
			String password1 = sc.next();
			System.out.println("Confirm password: ");
			String password2 = sc.next();
			if (password1.equals(password2)) {
				flag_pwd = false;
				customer.setPassword(password1);
			} else {
				System.out.println("password doesnt match");
			}
		}
		return customer;
	}
//---------------------------------------------------------------------

	private Customer createProperty(Customer customer) {
		boolean addProp = true;
		List<Property> property_List = new ArrayList<Property>();
		while (addProp) {
			Property property = new Property();
			System.out.println("Enter property Type: ");
			property.setPropertyType(sc.next());

			System.out.println("Enter price: ");
			property.setPrice(sc.nextLong());

			boolean property_flag = true;
			while (property_flag) {
				System.out.println("Property Status- Available Yes/No: ");
				String str = sc.next();
				if (str.toLowerCase().charAt(0) == 'y') {
					property.isStatus(true);
					property_flag = false;
				} else if (str.toLowerCase().charAt(0) == 'n') {
					property.isStatus(false);
					property_flag = false;
				} else {
					System.out.println("Enter valid value");
				}
			}
			property.setSeller(customer);
			session.save(property);
			property_List.add(property);

			System.out.println("1.Add another property   /n2.others to Exit");
			if (sc.nextInt() == 1) {
				addProp = true;
			} else {
				addProp = false;
			}
		}

		customer.setProperty(property_List);
		return customer;
	}
	
	//--------------------------------------------------------------
	@Override
	public void viewCustomer() {
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from Customer");
		List<Customer> customer_List = query.list();
		Iterator<Customer> itr = customer_List.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	@Override
	public void updateCustomer() {
		Transaction txn = session.beginTransaction();
        Query qry =session.createQuery("update Employee set lname=:nam where eid=101").setString("nam", "run");
        int noofrows = qry.executeUpdate();        
        txn.commit();
        System.out.println("Update is successful !!!");		
	}

}
