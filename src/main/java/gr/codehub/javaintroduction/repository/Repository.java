package gr.codehub.javaintroduction.repository;

import java.math.BigDecimal;
import java.util.List;


public interface Repository<T> {
	boolean add (T t);
    List<T> read();
	T read(long tId);
	boolean delete(long tId);
}
