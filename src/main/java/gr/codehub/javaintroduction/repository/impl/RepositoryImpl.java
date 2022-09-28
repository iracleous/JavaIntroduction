package gr.codehub.javaintroduction.repository.impl;

import java.util.ArrayList;
import java.util.List;

import gr.codehub.javaintroduction.domain.Entity;
import gr.codehub.javaintroduction.repository.Repository;

 

public abstract class RepositoryImpl<T extends Entity> implements Repository<T>{
	
	 private final List<T> list ;

	    public RepositoryImpl(List<T> list) {
	         this.list = list;
	    }
	   
	    // add  remove get  update   CR2UD   create read update delete

	    /**
	     *
	     * @param customer
	     * @return
	     */
	    
	    @Override
	    public boolean add (T t){
	    	if (t.isValid())
		        list.add(t);
	        return true;
	    }
	    
	    /**
	     *
	     * @return
	     */
	    @Override
	    public List<T> read(){
	        return list;
	    }
	    
	    /**
	     *
	     * @param id
	     * @return
	     */
	    @Override
	    public T read(long id){
 
	        for (T t:list){
	            if (t.getId() == id){
	                   return t;
	            }
	        }
	        return null; 
	    }
	    
    
	    /**
	     *
	     * @param customerId
	     * @return
	     */
	    @Override
	    public boolean delete(long tId){
	        T t = read(tId);
	        if( t == null) return false;
	        list.remove(t);
	        return true;
	    }
}
