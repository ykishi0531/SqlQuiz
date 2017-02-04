package jp.co.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.example.entity.MstPrefectures;

@Repository
public interface MstPrefecturesRepository extends JpaRepository<MstPrefectures, Long> {

}
