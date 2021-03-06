// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package challenge.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import challenge.dao.TrainerDao;
import challenge.dao.UserDao;
import challenge.domain.Trainer;
import challenge.service.TrainerService;


@Service
public class TrainerServiceImpl implements TrainerService {

    TrainerDao trainerDao;
    UserDao userDao;
    
    public TrainerServiceImpl(TrainerDao trainerDao, UserDao userDao) {
        this.trainerDao = trainerDao;
        this.userDao = userDao;
    }
    
    @Override
    public List<Trainer> list() {
//        HashMap<String,Object> params = new HashMap<>();
//        params.put("startRowNo", (pageNo - 1) * pageSize);
//        params.put("pageSize", pageSize);
        
        return trainerDao.selectList();
    }
    
    @Override
    public int delete(int tno) {
        return trainerDao.delete(tno);
    }

    @Override
    public Trainer get(int tno) {
        Trainer trainer = trainerDao.selectOne(tno);
        return trainer;
    }
    
    @Override
    public int add(Trainer trainer) {
        userDao.insert(trainer);
        return trainerDao.insert(trainer);
    }
    
    public int update(Trainer trainer) {
        return trainerDao.update(trainer);
    }
}