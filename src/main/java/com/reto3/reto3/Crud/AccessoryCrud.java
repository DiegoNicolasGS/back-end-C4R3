/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reto3.reto3.Crud;

import com.reto3.reto3.Model.Footwears;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Diego Garzon
 */
public interface AccessoryCrud extends MongoRepository<Footwears, String> {
    
}
