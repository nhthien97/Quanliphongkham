package com.example.quanliphongkham.application.service.impl;
import com.example.quanliphongkham.application.service.RoomService;
import com.example.quanliphongkham.domain.entity.Room;
import com.example.quanliphongkham.persistence.repository.RoomRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RoomServiceImpl implements RoomService {
    private final RoomRepository repository;
    public RoomServiceImpl(RoomRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Room> findAll() {
        return repository.findAll();
    }
}
