package com.example.servingwebcontent.repository;
import com.example.servingwebcontent.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AssetRepository extends JpaRepository<Asset, Long> {}
