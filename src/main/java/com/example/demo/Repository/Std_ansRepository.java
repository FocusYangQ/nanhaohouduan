package com.example.demo.Repository;

import com.example.demo.Entity.Ip;
import com.example.demo.Entity.Std_ans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Std_ansRepository extends JpaRepository<Std_ans, String> {
}
