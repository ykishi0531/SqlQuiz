package jp.co.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.example.entity.SqlTest;

@Repository
public interface SqlTestRepository extends JpaRepository<SqlTest, Long> {

}
