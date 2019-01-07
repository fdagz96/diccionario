/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.connection.DBUtil;
import com.utileria.Modismo;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ModismoDao implements CRUD{
    
    private Connection connection = null;
    public ModismoDao(){
        /* Al instanciar creamos y traemos la conexión*/
        connection = DBUtil.getConnection();
    }
    
    @Override
    public void create(Modismo modismo){
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement("INSERT INTO modismo (palabra,definicion,zona)"
                            + " VALUES (?, ?, ?)");
            preparedStatement.setString(1, modismo.getPalabra());
            preparedStatement.setString(2, modismo.getDefinicion());
            preparedStatement.setString(3, modismo.getRegion());
            
            preparedStatement.executeUpdate();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    @Override
    public void read(){
        
    }
    
    @Override
    public void update(){}
    
    @Override
    public void delete(){}
    


}
