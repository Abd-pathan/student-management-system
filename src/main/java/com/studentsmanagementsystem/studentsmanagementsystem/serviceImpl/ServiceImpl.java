package com.studentsmanagementsystem.studentsmanagementsystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentsmanagementsystem.studentsmanagementsystem.repository.StudentRepository;
import com.studentsmanagementsystem.studentsmanagementsystem.entity.Student;
import com.studentsmanagementsystem.studentsmanagementsystem.service.StudentService;

@Service
public class ServiceImpl implements StudentService{

    @Autowired
    StudentRepository StudentRepository;
    @Override
    public List<Student> getAllStudents() {
        List<Student> list= StudentRepository.findAll();
        return list;
    }
    @Override
    public Student saveStudent(Student student) {
return StudentRepository.save(student);
    }
    @Override
    public Student getById(int id) {
return StudentRepository.findById(id).get();
    }
    @Override
    public void deleteById(int id) {
    StudentRepository.deleteById(id);    }
    
}
