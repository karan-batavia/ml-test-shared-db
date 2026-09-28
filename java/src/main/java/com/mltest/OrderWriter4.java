package com.mltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OrderWriter4 {
    private static final String URL = "jdbc:postgresql://orders-db:5432/orders";

    public void saveCustomer4(String email, String firstName) throws Exception {
        try (Connection conn = DriverManager.getConnection(URL, "orders", "orders")) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO customers (email, first_name) VALUES (?, ?)");
            ps.setString(1, email);
            ps.setString(2, firstName);
            ps.executeUpdate();
        }
    }
}
