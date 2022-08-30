package za.ac.cput.service;

/*
SubjectService.java
Author: Mathew Fortuin (219069514)
Date: 21/8/2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Entity.Subject;
import za.ac.cput.Repository.impl.ISubjectRepository;
import za.ac.cput.service.impl.ISubjectService;


import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SubjectService implements ISubjectService {


@Autowired
private ISubjectRepository subjectRepository;

    @Override
    public Subject create(Subject subject){return this.subjectRepository.save(subject);}

    @Override
    public Subject read(String subjectId){return this.subjectRepository.findById(subjectId).orElseGet(null);}

    @Override
    public Subject update(Subject subject)
    {
        if(this.subjectRepository.existsById(subject.getSubjectID()))
        {
            return this.subjectRepository.save(subject);
        }

        return null;
    }

    @Override
    public boolean delete(String id){
        this.subjectRepository.deleteById(id);
        if(this.subjectRepository.existsById(id)) return false;
        else return true;
    }

    @Override
    public Set<Subject> getAll() {return this.subjectRepository.findAll().stream().collect(Collectors.toSet());}



}
