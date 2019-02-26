package com.dao;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoginDAO {
void showLoginForm(HttpServletRequest request,HttpServletResponse response);
public boolean validateUser(String username,String password) throws SQLException;
}
