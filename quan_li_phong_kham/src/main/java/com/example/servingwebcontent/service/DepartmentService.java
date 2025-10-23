package com.example.servingwebcontent.service;
import com.example.servingwebcontent.model.Asset;
import com.example.servingwebcontent.model.Department;
import com.example.servingwebcontent.repository.AssetRepository;
import com.example.servingwebcontent.repository.DepartmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DepartmentService {
    private final DepartmentRepository depRepo;
    private final AssetRepository assetRepo;
    public DepartmentService(DepartmentRepository d, AssetRepository a){ this.depRepo=d; this.assetRepo=a; }
    public List<Department> departments(){ return depRepo.findAll(); }
    public Department saveDepartment(Department d){ return depRepo.save(d); }
    public void deleteDepartment(Long id){ depRepo.deleteById(id); }
    public List<Asset> assets(){ return assetRepo.findAll(); }
    public Asset saveAsset(Asset a){ return assetRepo.save(a); }
    public void deleteAsset(Long id){ assetRepo.deleteById(id); }
}
