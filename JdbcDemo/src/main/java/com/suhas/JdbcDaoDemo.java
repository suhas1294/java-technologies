package com.suhas;

import org.apache.commons.lang3.RandomStringUtils;

import java.sql.*;

public class JdbcDaoDemo {
	public static void main(String[] args) {
		GadgetDao dao = new GadgetDao();
		dao.connect();
		
		// fetching result
		Gadget g1 = dao.getPriceOfGadget("Iphone");
		System.out.println("Price of " + g1.getName() + " is " + g1.getPrice());
		
		// creating result
		Gadget g2 = new Gadget();
		g2.name = RandomStringUtils.randomAlphanumeric(5);
		g2.price = 9000;
		dao.addGadget(g2);
		System.out.println("Created : "+ g2.name);
		
		// deleting record in db
		System.out.println("Deleting record : " + g2.getName());
		dao.removeStudent(g2.name);
	}
}

class GadgetDao{
	private String url = "jdbc:mysql://localhost:3306/ecommerce";
	private String username = "root";
	private String password = "";
	Connection connection = null;
	
	public void connect() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		}catch (Exception e){
			System.out.println("Not able to connect");
			e.printStackTrace();
		}
	}
	public Gadget getPriceOfGadget(String name){
		Gadget g = new Gadget();
		try{
			Statement st = connection.createStatement();
			String query = "select * from gadget where name like " + "'%" + name + "%'" ;
			ResultSet rs = st.executeQuery(query);
			rs.next();
			int gprice = rs.getInt(3);
			String gadgetName = rs.getString(2);
			g.setName(gadgetName);
			g.setPrice(gprice);
		}catch (Exception e){
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		return g;
	}
	public void addGadget(Gadget g){
		try{
			String query = "insert into gadget (name, price) values (?, ?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, g.name);
			ps.setInt(2, g.price);
			ps.executeUpdate();
		}catch (Exception e){
		
		}
	}
	public void removeStudent(String name){
		try{
			String query = "delete from gadget where name = ?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, name);
			ps.executeUpdate();
		}catch (Exception e){
			System.out.println("Gadget could not be deleted");
			e.printStackTrace();
		}
	}
}

class Gadget{
	int id;
	String name;
	int price;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}