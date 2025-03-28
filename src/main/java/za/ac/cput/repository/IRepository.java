package za.ac.cput.repository;
/*
IRepository.java interface
IRepository Interface
Author: Ashlyn Jordan January 230577644
Date: 25 March 2025
*/

import java.util.List;

public interface IRepository <T, ID>{

    T create(T t);

    T read(ID id);

    T update(T t);

    boolean delete(ID id);

    List<T> getAll();
}
