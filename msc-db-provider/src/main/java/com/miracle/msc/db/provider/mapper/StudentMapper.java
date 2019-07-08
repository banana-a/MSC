package com.miracle.msc.db.provider.mapper;

import com.miracle.msc.db.provider.entity.Student;
import com.miracle.utils.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends MyMapper<Student> {
    void insertStudent(Student student);
}