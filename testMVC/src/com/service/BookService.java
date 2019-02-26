package com.service;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import com.model.Book;

public interface BookService
{
public void getAllBooks(HttpServletRequest request,HttpServletResponse response) throws SQLException, ServletException, IOException;
}

