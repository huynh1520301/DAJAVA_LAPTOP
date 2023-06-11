package LaptopWebsite.Nhom14.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import LaptopWebsite.Nhom14.Model.User;
import org.springframework.stereotype.Service;

import LaptopWebsite.Nhom14.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User user)
    {
        userRepository.save(user);
    }

    public List<User> GetAll(){return userRepository.findAll();}

    public void delete(Long id){userRepository.deleteById(id);}
}
