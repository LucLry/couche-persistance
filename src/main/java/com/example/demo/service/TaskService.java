package com.example.demo.service;

import com.example.demo.dao.TaskDao;
import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskDao taskDao;

    public TaskService (TaskDao taskDao){
        this.taskDao = taskDao;
    }

    @Transactional
    public List<Task> findAllTasks(){
        return taskDao.findAll();
    }
    @Transactional
    public Task saveTask (Task task ){
        return taskDao.save(task);
    }
    @Transactional
    public Optional<Task> findTaskById(Long id) {
        return taskDao.findById(id);
    }

    @Transactional
    public boolean deleteTaskById(Long id){
        taskDao.deleteById(id);
        return true;
    }
}
