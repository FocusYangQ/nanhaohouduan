package com.example.demo.Repository;

import com.example.demo.Entity.Stu_id_name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface Stu_id_nameRepository extends JpaRepository<Stu_id_name, Integer> {

//    @Query(value = "FROM Stu_id_name s WHRER s.stu_id= ?1")
//    Stu_id_name findByStu_id(String stu_id);
}
